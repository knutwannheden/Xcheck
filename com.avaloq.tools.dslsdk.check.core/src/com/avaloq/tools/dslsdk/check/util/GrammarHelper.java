/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.Grammar;
import org.osgi.framework.Bundle;


/**
 * The Class GrammarHelper.
 */
@SuppressWarnings("restriction")
public class GrammarHelper {

  private final Grammar grammar;

  /**
   * Instantiates a new grammar helper.
   * 
   * @param grammarAccess
   *          the grammar access
   */
  public GrammarHelper(final Grammar grammar) {
    this.grammar = grammar;
  }

  /**
   * Gets the bundle symbolic name.
   * 
   * @param classe
   *          the class
   * @return the bundle symbolic name
   */
  protected String getBundleSymbolicName(final Class<?> classe) {
    ClassLoader cl = classe.getClassLoader();
    if (cl instanceof DefaultClassLoader) {
      Bundle bundle = ((DefaultClassLoader) cl).getBundle();
      if (bundle != null) {
        return bundle.getSymbolicName();
      }
    }
    return null;
  }

  /**
   * @return a text representation of the grammar in which the last segment
   * appears first (like in content assist.)
   */
  public String getLabelName() {
    String name = getGrammar().getName();
    return name.substring(name.lastIndexOf('.') == -1 ? 0 : name.lastIndexOf('.') + 1) + " - " + name;
  }

  /**
   * Gets the Java interface that corresponds to a grammar's top-level grammar rules.
   * 
   * @param metamodelDeclaration
   *          the metamodel declaration
   * @return the first interface corresponding to a grammar's top-level grammar rule
   */
  public Class<?> getFirstInterface(final AbstractMetamodelDeclaration metamodelDeclaration) {
    return metamodelDeclaration.getEPackage().getClass().getInterfaces()[0];
  }

  /**
   * Gets the grammar.
   * 
   * @return the grammar
   */
  public Grammar getGrammar() {
    // no need to cache, the GrammarProvider does it for us...
    return grammar;
  }

  /**
   * Gets the name of the bundles required for this grammar.
   * 
   * @return the required bundle symbolic names
   */
  public Set<String> getRequiredBundleSymbolicNames() {
    Set<String> set = new HashSet<String>();
    for (AbstractMetamodelDeclaration metamodelDeclaration : getGrammar().getMetamodelDeclarations()) {
      set.add(getBundleSymbolicName(metamodelDeclaration.getEPackage().getClass().getInterfaces()[0])); // TODO call getFirstInterface
    }
    return set;
  }

  /**
   * Returns the list of metamodel declarations Java packages.
   * 
   * @return the metamodel packages
   */
  public List<String> getMetamodelPackages() {
    ArrayList<String> list = new ArrayList<String>();
    for (AbstractMetamodelDeclaration metamodelDeclaration : getGrammar().getMetamodelDeclarations()) {
      list.add(getFirstInterface(metamodelDeclaration).getPackage().getName());
    }
    return list;
  }

}

/* Copyright (c) Avaloq License AG */