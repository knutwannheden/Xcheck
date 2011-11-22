/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.wizard;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ui.wizard.DefaultProjectInfo;

import com.avaloq.tools.dslsdk.check.util.GrammarAccessHelper;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;


/**
 * Aggregates project information collected from UI.
 */
public class CheckProjectInfo extends DefaultProjectInfo {

  private String catalogName;
  private String path;
  private String packageName;
  private IGrammarAccess grammarAccess;
  private GrammarAccessHelper grammarAccessHelper;
  private IPackageFragment packageFragment;

  public String getCatalogName() {
    return catalogName;
  }

  public void setCatalogName(final String catalogName) {
    this.catalogName = catalogName;
  }

  public Grammar getGrammar() {
    return grammarAccess.getGrammar();
  }

  public IGrammarAccess getGrammarAccess() {
    return grammarAccess;
  }

  /**
   * Sets the grammar access and creates the corresponding helper.
   * 
   * @param grammarAccess
   *          a grammar access
   */
  public void setGrammarAccess(final IGrammarAccess grammarAccess) {
    this.grammarAccess = grammarAccess;
    this.grammarAccessHelper = new GrammarAccessHelper(grammarAccess);
  }

  public Collection<String> getDslDependency() {
    return grammarAccessHelper.getRequiredBundleSymbolicNames();
  }

  /**
   * Gets the default package import. Returns the package name of the Java package in which the interface
   * of the grammar's top-level grammar rule is located.
   * <p>
   * A typical location for this would be {@code org.xtext.example.mydsl.myDsl}
   * </p>
   * 
   * @return the default package import or {@code null} if no default package was found
   */
  public String getDefaultPackageImport() {
    String result = null;
    for (AbstractMetamodelDeclaration metamodelDeclaration : grammarAccessHelper.getGrammar().getMetamodelDeclarations()) {
      if (metamodelDeclaration instanceof GeneratedMetamodel) { // ignore ReferencedMetalmodel instances
        result = grammarAccessHelper.getFirstInterface(metamodelDeclaration).getPackage().getName();
        break;
      }
    }
    return result; // may be null, but should not
  }

  /**
   * Gets the path to where files should be generated by Xpand. If {@code path} is {@code null}, a default is calculated.
   * 
   * @return the path
   */
  public String getPath() {
    if (this.path == null) {
      return "src" + "/" + this.packageName.replace('.', '/') + "/";
    }
    return this.path;
  }

  public void setPath(final String path) {
    this.path = path;
  }

  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(final String packageName) {
    this.packageName = packageName;
  }

  public IPackageFragment getPackageFragment() {
    return packageFragment;
  }

  public void setPackageFragment(final IPackageFragment packageFragment) {
    this.packageFragment = packageFragment;
  }

  public Collection<String> getMetamodelImports() {
    return Collections2.transform(grammarAccessHelper.getMetamodelPackages(), new Function<String, String>() {
      public String apply(final String importPackageName) {
        return importPackageName + ".*";
      }
    });
  }

  public Iterable<String> getRequiredBundles() {
    return Iterables.concat(Collections.singleton(grammarAccessHelper.getBundleSymbolicName()), grammarAccessHelper.getRequiredBundleSymbolicNames());
  }
}
/* Copyright (c) Avaloq License AG */