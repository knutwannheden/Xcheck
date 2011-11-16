/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.templates;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.templates.AbstractTemplateVariableResolver;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;


/**
 * The Class PackageNameResolver.
 */
public class ResourceNameTemplateVariableResolver extends AbstractTemplateVariableResolver {

  private static final Logger LOGGER = Logger.getLogger(ResourceNameTemplateVariableResolver.class);

  public ResourceNameTemplateVariableResolver() {
    super("ResourceName", "Resolves the current package name");
  }

  @Override
  public List<String> resolveValues(final TemplateVariable variable, final XtextTemplateContext templateContext) {
    final List<String> result = Lists.newArrayList();
    IDocument document = templateContext.getDocument();
    final Object obj = variable.getVariableType().getParams().iterator().next();
    if (obj instanceof String) {
      final String variableName = (String) obj;
      final IXtextDocument xtextDocument = (IXtextDocument) document;
      IFile file = xtextDocument.getAdapter(IFile.class);

      if ("package".equals(variableName) && document instanceof IXtextDocument) {
        if (file != null && file.getParent() instanceof IFolder) {
          IJavaProject javaProject = JavaCore.create(file.getProject());
          try {
            IPackageFragment packageFragment = javaProject.findPackageFragment(file.getParent().getFullPath());
            result.add(packageFragment.getElementName());
          } catch (JavaModelException e) {
            LOGGER.error("Could not determine package for file of given document");
          }
        }
      } else if ("catalog".equals(variableName)) {
        final String fileName = file.getName();
        result.add(fileName.indexOf('.') > 0 ? fileName.substring(0, fileName.lastIndexOf('.')) : fileName);
      }
    }
    return Lists.newArrayList(Iterables.filter(result, Predicates.notNull()));
  }
}

/* Copyright (c) Avaloq License AG */