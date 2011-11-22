/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.runtime.issue;

import java.util.Collection;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreQuickfixProvider;
import com.avaloq.tools.dslsdk.check.runtime.registry.CheckQuickfixImplRegistryImpl;
import com.google.common.collect.Multimap;


/**
 * Contains a registry used for collecting all quickfixes providers in a non-OSGI environment.
 */
public interface ICheckQuickfixImpl {

  /**
   * The Check quickfix provider registry.
   */
  public interface Registry {

    /** The Constant INSTANCE. */
    // CHECKSTYLE:OFF
    public static final Registry INSTANCE = new CheckQuickfixImplRegistryImpl();// CHECKSTYLE:ON

    /**
     * Gets the quickfix providers.
     * 
     * @param language
     *          the language
     * @return the quickfix providers
     */
    Collection<ICoreQuickfixProvider> getProviders(String language);

    /**
     * Gets the language to quickfix provider map.
     * 
     * @return the language to quickfix provider map
     */
    Multimap<String, Object> getLanguageToProviderMap();
  }

}

/* Copyright (c) Avaloq License AG */