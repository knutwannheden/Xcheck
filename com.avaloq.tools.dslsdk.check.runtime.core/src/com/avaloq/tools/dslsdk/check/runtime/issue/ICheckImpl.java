/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.runtime.issue; //TODO rename package

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.avaloq.tools.dslsdk.check.runtime.registry.CheckImplRegistryImpl;
import com.google.common.collect.Multimap;


/**
 * Contains a registry used for collecting all validators in a non-OSGi environment
 * and defines an operation used for validation of models.
 */
public interface ICheckImpl {

  /**
   * The Interface Registry.
   */
  public interface Registry {

    /** The Constant INSTANCE. */
    // CHECKSTYLE:OFF
    public static final Registry INSTANCE = new CheckImplRegistryImpl();// CHECKSTYLE:ON

    /**
     * Gets the validators.
     * 
     * @param language
     *          the language
     * @return the validators
     */
    Collection<ICheckImpl> getValidators(String language);

    /**
     * Gets the language to validator map.
     * 
     * @return the language to validator map
     */
    Multimap<String, Object> getLanguageToValidatorMap();
  }

  /**
   * Validate.
   * 
   * @param eClass
   *          the e class
   * @param eObject
   *          the e object
   * @param diagnostics
   *          the diagnostics
   * @param context
   *          the context
   * @return true, if successful
   */
  boolean validate(final EClass eClass, final EObject eObject, final DiagnosticChain diagnostics, final Map<Object, Object> context);

}

/* Copyright (c) Avaloq License AG */