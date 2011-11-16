/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.internal;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;

import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckQuickfixImpl;
import com.google.common.collect.Multimap;


/**
 * Provides a RegistryReader for the Check language. TODO Document this class.
 */
class LanguageCheckQuickfixImplRegistryReader extends AbstractCheckRegistryReader {

  /** The logger. */
  private static final Logger LOGGER = Logger.getLogger(LanguageCheckQuickfixImplRegistryReader.class);

  @Override
  protected Logger getLogger() {
    return LOGGER;
  }

  @Override
  protected String topLevelElementName() {
    return "provider"; //$NON-NLS-1$
  }

  @Override
  protected ICheckImplDescriptor newDescriptor(final IConfigurationElement element, final String attClass) {
    return new CheckQuickfixImplDescriptor(element, attClass);
  }

  /**
   * Gets the map of languages mapped to quickfix providers.
   * 
   * @return the language to quickfix provider map
   */
  @Override
  protected Multimap<String, Object> getMap() {
    return ICheckQuickfixImpl.Registry.INSTANCE.getLanguageToProviderMap();
  }

  /**
   * Instantiates a new Check language registry reader. TODO Document this method.
   * 
   * @param extensionRegistry
   *          the extension registry
   * @param symbolicBundleName
   *          the symbolic bundle name
   */
  public LanguageCheckQuickfixImplRegistryReader(final IExtensionRegistry extensionRegistry, final String symbolicBundleName) {
    super(extensionRegistry, symbolicBundleName, "checkquickfix"); //$NON-NLS-1$
  }

}

/* Copyright (c) Avaloq License AG */