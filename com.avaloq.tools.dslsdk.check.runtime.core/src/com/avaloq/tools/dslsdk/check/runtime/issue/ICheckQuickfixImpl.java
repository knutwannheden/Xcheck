/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
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