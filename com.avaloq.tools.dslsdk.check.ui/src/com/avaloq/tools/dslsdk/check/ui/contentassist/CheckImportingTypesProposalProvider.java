/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.contentassist;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.xtext.common.types.xtext.ui.JdtTypesProposalProvider;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalFactory;

import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.CheckPackage;
import com.google.inject.Inject;


/**
 * @see org.eclipse.xtext.xtend2.ui.contentassist.ImportingTypesProposalProvider.
 */
public class CheckImportingTypesProposalProvider extends JdtTypesProposalProvider {

  @Inject
  private QualifiedNameValueConverter qualifiedNameValueConverter;

  @Override
  protected IReplacementTextApplier createTextApplier(final ContentAssistContext context, final IScope typeScope, final IQualifiedNameConverter qualifiedNameConverter, final IValueConverter<String> valueConverter) {
    return new FQNImporter(context.getResource(), context.getViewer(), typeScope, qualifiedNameConverter, valueConverter, qualifiedNameValueConverter);
  }

  @Override
  public void createTypeProposals(final IJavaProject project, final ICompletionProposalFactory proposalFactory, final ContentAssistContext context, final EReference typeReference, final Filter filter, final IValueConverter<String> valueConverter, final ICompletionProposalAcceptor acceptor) {

    try {
      IJavaSearchScope searchScope;
      if (context.getPrefix() == null || context.getPrefix().length() == 0) {
        searchScope = SearchEngine.createJavaSearchScope(new IJavaElement[] {project}, IJavaSearchScope.SOURCES);
      } else {
        searchScope = SearchEngine.createJavaSearchScope(new IJavaElement[] {project});
      }

      searchAndCreateProposals(searchScope, proposalFactory, context, typeReference, filter, valueConverter, acceptor);
      // CHECKSTYLE:OFF
    } catch (JavaModelException e) {
      // CHECKSTYLE:ON
      // ignore
    }
  }

  /**
   * @see Xtend2ImportingTypesProposalProvider.FQNImporter.
   */
  public static class FQNImporter extends FQNShortener {

    private final ITextViewer viewer;
    private final QualifiedNameValueConverter importConverter;

    public FQNImporter(final Resource context, final ITextViewer viewer, final IScope scope, final IQualifiedNameConverter qualifiedNameConverter, final IValueConverter<String> valueConverter, final QualifiedNameValueConverter importConverter) {
      super(context, scope, qualifiedNameConverter, valueConverter);
      this.viewer = viewer;
      this.importConverter = importConverter;
    }

    @Override
    public void apply(final IDocument document, final ConfigurableCompletionProposal proposal) throws BadLocationException { // NOPMD NPath Complexity
      String proposalReplacementString = proposal.getReplacementString();
      String typeName = proposalReplacementString;
      if (valueConverter != null) {
        typeName = valueConverter.toValue(proposalReplacementString, null);
      }
      String replacementString = getActualReplacementString(proposal);
      // there is an import statement - apply computed replacementString
      if (!proposalReplacementString.equals(replacementString)) {
        String shortTypeName = replacementString;
        if (valueConverter != null) {
          shortTypeName = valueConverter.toValue(replacementString, null);
        }
        QualifiedName shortQualifiedName = qualifiedNameConverter.toQualifiedName(shortTypeName);
        if (shortQualifiedName.getSegmentCount() == 1) {
          proposal.setCursorPosition(replacementString.length());
          document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), replacementString);
          return;
        }
      }
      // we could create an import statement if there is no conflict
      CheckCatalog catalog = (CheckCatalog) context.getContents().get(0);
      // XtendClass clazz = file.getXtendClass();

      QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(typeName);
      if (qualifiedName.getSegmentCount() == 1) {
        // type resides in default package - no need to hassle with imports
        proposal.setCursorPosition(proposalReplacementString.length());
        document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposalReplacementString);
        return;
      }

      IEObjectDescription description = scope.getSingleElement(qualifiedName.skipFirst(qualifiedName.getSegmentCount() - 1));
      if (description != null) {
        // there exists a conflict - insert fully qualified name
        proposal.setCursorPosition(proposalReplacementString.length());
        document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposalReplacementString);
        return;
      }

      // Import does not introduce ambiguities - add import and insert short name
      String shortName = qualifiedName.getLastSegment();
      int topPixel = -1;
      // store the pixel coordinates to prevent the ui from flickering
      StyledText widget = viewer.getTextWidget();
      if (widget != null) {
        topPixel = widget.getTopPixel();
      }
      ITextViewerExtension viewerExtension = null;

      // Currently disabled: causes index out of bounds exceptions when entering a text such as a.b.c and
      // then applying content assist

      // if (viewer instanceof ITextViewerExtension) {
      // viewerExtension = (ITextViewerExtension) viewer;
      // viewerExtension.setRedraw(false);
      // }
      try {
        // compute import statement's offset
        int offset = 0;
        boolean startWithLineBreak = true;
        boolean endWithLineBreak = false;
        if (catalog.getImports().isEmpty()) {
          startWithLineBreak = true;
          List<INode> nodes = NodeModelUtils.findNodesForFeature(catalog, CheckPackage.Literals.CHECK_CATALOG__PACKAGE_NAME);
          INode lastNode = nodes.get(nodes.size() - 1);
          offset = lastNode.getOffset() + lastNode.getLength() + 1; // TODO
          endWithLineBreak = true;
        } else {
          ICompositeNode node = NodeModelUtils.getNode(catalog.getImports().get(catalog.getImports().size() - 1));
          offset = node.getOffset() + node.getLength();
        }
        offset = Math.min(proposal.getReplacementOffset(), offset);

        // apply short proposal
        String escapedShortname = shortName;
        if (valueConverter != null) {
          escapedShortname = valueConverter.toString(shortName);
        }
        proposal.setCursorPosition(escapedShortname.length());
        document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), escapedShortname);

        // add import statement
        StringBuffer importStatement = new StringBuffer(startWithLineBreak ? "\nimport " : "import ");
        importStatement.append(importConverter.toString(typeName));
        if (endWithLineBreak) {
          importStatement.append('\n');
        }
        document.replace(offset, 0, importStatement.toString());
        proposal.setCursorPosition(proposal.getCursorPosition() + importStatement.length());

        // set the pixel coordinates
        if (widget != null) {
          int additionalTopPixel = 0;
          if (startWithLineBreak) {
            additionalTopPixel += widget.getLineHeight();
          }
          if (endWithLineBreak) {
            additionalTopPixel += 2 * widget.getLineHeight();
          }
          widget.setTopPixel(topPixel + additionalTopPixel);
        }
      } finally {
        if (viewerExtension != null) {
          viewerExtension.setRedraw(true);
        }
      }
    }
  }

}

