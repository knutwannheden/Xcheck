/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.configuration;

import com.google.inject.ImplementedBy;


/**
 * Represents a strategy to store and access Check Configuration Preferences.
 */
@ImplementedBy(DefaultCheckConfigurationStore.class)
public interface ICheckConfigurationStore {

  // TODO: do we need default values (for the standalone builder)

  String CHECK_CONFIGURATION_NODE = "com.avaloq.tools.dslsdk.checkcfg.core"; //$NON-NLS-1$

  /**
   * Return the value stored in the configuration store for the given key.
   * If the key is not defined then return the specified default value.
   * Use the canonical scope lookup order for finding the preference value.
   * 
   * @param catalog
   *          the name of the catalog
   * @param key
   *          the name of the preference (optionally including its path)
   * @param defaultValue
   *          the value to use if the preference is not defined
   * @return the value of the preference or the given default value
   */
  boolean getBoolean(String catalog, String key, boolean defaultValue);

  /**
   * Return the value stored in the configuration store for the given key.
   * If the key is not defined then return the specified default value.
   * Use the canonical scope lookup order for finding the preference value.
   * 
   * @param catalog
   *          the name of the catalog
   * @param key
   *          the name of the preference (optionally including its path)
   * @param defaultValue
   *          the value to use if the preference is not defined
   * @return the value of the preference or the given default value
   */
  int getInt(String catalog, String key, int defaultValue);

  /**
   * Return the value stored in the configuration store for the given key.
   * If the key is not defined then return the specified default value.
   * Use the canonical scope lookup order for finding the preference value.
   * 
   * @param catalog
   *          the name of the catalog
   * @param key
   *          the name of the preference (optionally including its path)
   * @param defaultValue
   *          the value to use if the preference is not defined
   * @return the value of the preference or the given default value
   */
  String getString(String catalog, String key, String defaultValue);

}

/* Copyright (c) Avaloq License AG */