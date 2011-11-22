/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.highlighting;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;

import com.avaloq.tools.dslsdk.check.documentation.JavaDocCommentDocumentationProvider;
import com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess;
import com.google.inject.Inject;


/**
 * An XbaseHighlightingCalculator-based implementation for the Check language.
 */
@SuppressWarnings("restriction")
public class CheckHighlightingCalculator extends XbaseHighlightingCalculator {

  @Inject
  private JavaDocCommentDocumentationProvider commentProvider;

  @Inject
  private CheckGrammarAccess grammarAccess;

  @Override
  protected void highlightSpecialIdentifiers(final IHighlightedPositionAcceptor acceptor, final ICompositeNode root) {
    TerminalRule idRule = grammarAccess.getIDRule();

    for (ILeafNode leaf : root.getLeafNodes()) {
      if (commentProvider.isJavaDocComment(leaf)) {
        // not really a special identifier, but we don't want to iterate over the leaf nodes twice, do we?
        acceptor.addPosition(leaf.getOffset(), leaf.getLength(), CheckHighlightingConfiguration.JAVADOC_ID);
      } else if (!leaf.isHidden()) {
        highlightSpecialIdentifiers(leaf, acceptor, idRule);
      }
    }
  }

}

/* Copyright (c) Avaloq License AG */