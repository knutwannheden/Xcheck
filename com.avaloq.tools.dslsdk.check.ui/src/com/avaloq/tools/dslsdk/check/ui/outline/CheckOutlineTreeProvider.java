/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.CheckPackage;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.Import;
import com.avaloq.tools.dslsdk.check.ui.labeling.CheckImages;
import com.google.inject.Inject;


/**
 * Customization of the default outline structure.
 */
public class CheckOutlineTreeProvider extends DefaultOutlineTreeProvider {

  @Inject
  private CheckImages checkImages;

  /**
   * Customizes outline nodes for a {@link CheckCatalog}.
   * 
   * @param parentNode
   *          the parent node
   * @param catalog
   *          the catalog
   */
  // CHECKSTYLE:OFF
  protected void _createChildren(final DocumentRootNode parentNode, final CheckCatalog catalog) {
    // CHECKSTYLE:ON
    if (catalog.getPackageName() != null) {
      createEStructuralFeatureNode(parentNode, catalog, CheckPackage.Literals.CHECK_CATALOG__PACKAGE_NAME, checkImages.forPackage(), catalog.getPackageName(), true);
    }

    if (!catalog.getImports().isEmpty()) {
      EStructuralFeatureNode importNode = createEStructuralFeatureNode(parentNode, catalog, //
          CheckPackage.Literals.CHECK_CATALOG__IMPORTS, checkImages.forImportContainer(),//
          "Import declarations", false);
      for (final Import imported : catalog.getImports()) {
        createEObjectNode(importNode, imported);
      }
    }

    EObjectNode catalogNode = createEObjectNode(parentNode, catalog);

    for (final Category category : catalog.getCategories()) {
      createEObjectNode(catalogNode, category);
    }
    for (final Check check : catalog.getChecks()) {
      createEObjectNode(catalogNode, check);
    }

  }

  /**
   * Customizes outline nodes for a {@link Category}.
   * 
   * @param parentNode
   *          the parent node
   * @param category
   *          the category
   */
  // CHECKSTYLE:OFF
  protected void _createChildren(final IOutlineNode parentNode, final Category category) {
    // CHECKSTYLE:ON
    for (final Check c : category.getChecks()) {
      createEObjectNode(parentNode, c);
    }
  }

  /**
   * Customizes outline nodes for a {@link Check}.
   * 
   * @param parentNode
   *          the parent node
   * @param check
   *          the check
   */
  // CHECKSTYLE:OFF
  protected void _createChildren(final IOutlineNode parentNode, final Check check) {
    // CHECKSTYLE:ON
    for (final Context c : check.getContexts()) {
      createEObjectNode(parentNode, c);
    }
  }

  /**
   * Defines that no children nodes of a {@link Check} are used for creating outline nodes.
   * 
   * @param context
   *          the context
   * @return <code>true</code> if no outline nodes should be created for child nodes
   */
  // CHECKSTYLE:OFF
  protected boolean _isLeaf(final Context context) {
    // CHECKSTYLE:ON
    return true;
  }

  // // CHECKSTYLE:OFF
  // protected boolean _isLeaf(final Check check) {
  // // CHECKSTYLE:ON
  // return true;
  // }

}

/* Copyright (c) Avaloq License AG */