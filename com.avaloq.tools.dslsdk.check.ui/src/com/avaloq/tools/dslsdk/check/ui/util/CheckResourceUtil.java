/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import com.avaloq.tools.dslsdk.check.util.GrammarHelper;
import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;


/**
 * Provides utility operations for Eclipse resources.
 */
public class CheckResourceUtil {

  // TODO refactor into GrammarHelper

  private static final Logger LOGGER = Logger.getLogger(CheckResourceUtil.class);

  /**
   * Gets the name of the resource related to given document.
   * 
   * @param xtextDocument
   *          the xtext document
   * @return the name of the resource being edited with given document
   */
  public String getNameOfResource(final IXtextDocument xtextDocument) {
    IFile file = xtextDocument.getAdapter(IFile.class);
    if (file != null && file.getName() != null) {
      final String fileName = file.getName();
      int indexOfDotBeforeExtension = fileName.lastIndexOf('.');
      return indexOfDotBeforeExtension > 0 ? fileName.substring(0, indexOfDotBeforeExtension) : fileName;
    }
    return null;
  }

  /**
   * Gets the name of containing package.
   * 
   * @param xtextDocument
   *          the xtext document
   * @return the name of containing package
   */
  public String getNameOfContainingPackage(final IXtextDocument xtextDocument) {
    IFile file = xtextDocument.getAdapter(IFile.class);
    if (file != null && file.getParent() instanceof IFolder) {
      IJavaProject javaProject = JavaCore.create(file.getProject());
      try {
        IPackageFragment myFragment = javaProject.findPackageFragment(file.getParent().getFullPath());
        return myFragment.getElementName();
      } catch (JavaModelException e) {
        LOGGER.error("Could not determine package for file of given document");
      }
    }
    return null;
  }

  private static final String GENERATED_EPACKAGE_EXTENSION = "org.eclipse.emf.ecore.generated_package"; //$NON-NLS-1$

  /**
   * Gets all the plugins registering to the <code>org.eclipse.emf.ecore.generated_package</code>.
   * By default, all Xtext generated run-time plugins register to that extension point.
   * 
   * @return the list of registered plugin names
   */
  public Iterable<String> getDslPlugins() {
    IExtensionRegistry registry = Platform.getExtensionRegistry();
    IExtensionPoint extensionPoint = registry.getExtensionPoint(GENERATED_EPACKAGE_EXTENSION);
    List<IExtension> extensions = Lists.newArrayList(extensionPoint.getExtensions());

    final Iterable<String> result = Iterables.transform(extensions, new Function<IExtension, String>() {
      public String apply(final IExtension from) {
        return from.getContributor().getName();
      }
    });
    return Ordering.<String> natural().sortedCopy(Sets.newHashSet(result));
  }

  /**
   * Looks up all exported grammars.
   * 
   * @return an iterable of grammar names
   */
  public List<IGrammarAccess> getGrammarAccesses() {
    Iterable<IGrammarAccess> result = allGrammarAccesses();

    Ordering<IGrammarAccess> byNameOrdering = new Ordering<IGrammarAccess>() {
      public int compare(final IGrammarAccess left, final IGrammarAccess right) {
        return Ordering.<String> natural().compare(new GrammarHelper(left.getGrammar()).getLabelName(), new GrammarHelper(right.getGrammar()).getLabelName());
      }
    };
    return byNameOrdering.sortedCopy(Sets.newHashSet(Iterables.filter(result, Predicates.notNull())));
  }

  /**
   * Gets all grammars in the resource service provider registry.
   * 
   * @return the iterable of grammars
   */
  public Iterable<IGrammarAccess> allGrammarAccesses() {
    final IResourceServiceProvider.Registry reg = IResourceServiceProvider.Registry.INSTANCE;
    Map<String, Object> extensionToFactoryMap = reg.getExtensionToFactoryMap();
    Set<String> keySet = extensionToFactoryMap.keySet();

    Function<String, IGrammarAccess> function = new Function<String, IGrammarAccess>() {
      public IGrammarAccess apply(final String from) {
        URI dummyUri = URI.createURI("foo:/foo." + from); //$NON-NLS-1$
        try {
          return reg.getResourceServiceProvider(dummyUri).get(IGrammarAccess.class);
          // CHECKSTYLE:OFF
        } catch (Exception e) {
          // CHECKSTYLE:ON
        }
        return null;
      }
    };
    return Iterables.filter(Iterables.transform(keySet, function), Predicates.notNull());
  }
}

