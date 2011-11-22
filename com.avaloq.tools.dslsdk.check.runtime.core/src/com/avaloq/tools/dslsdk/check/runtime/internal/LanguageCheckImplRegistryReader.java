/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.internal;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;

import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckImpl;
import com.google.common.collect.Multimap;


/**
 * Provides a RegistryReader for the Check language. TODO Document this class.
 */
class LanguageCheckImplRegistryReader extends AbstractCheckRegistryReader {

  /** The logger. */
  private static final Logger LOGGER = Logger.getLogger(LanguageCheckImplRegistryReader.class);

  @Override
  protected Logger getLogger() {
    return LOGGER;
  }

  @Override
  protected String topLevelElementName() {
    return "validator"; //$NON-NLS-1$
  }

  @Override
  protected ICheckImplDescriptor newDescriptor(final IConfigurationElement element, final String attClass) {
    return new CheckImplDescriptor(element, attClass);
  }

  /**
   * Gets the map of languages mapped to validators.
   * 
   * @return the language validator map
   */
  @Override
  protected Multimap<String, Object> getMap() {
    return ICheckImpl.Registry.INSTANCE.getLanguageToValidatorMap();
  }

  /**
   * Instantiates a new Check language registry reader. TODO Document this method.
   * 
   * @param extensionRegistry
   *          the extension registry
   * @param symbolicBundleName
   *          the symbolic bundle name
   */
  public LanguageCheckImplRegistryReader(final IExtensionRegistry extensionRegistry, final String symbolicBundleName) {
    super(extensionRegistry, symbolicBundleName, "check"); //$NON-NLS-1$
  }

}

/* Copyright (c) Avaloq License AG */