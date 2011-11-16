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

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


/**
 * Activates the Check runtime plugin.
 */
public class Activator extends Plugin {

  /** {@inheritDoc} */
  @Override
  public void start(final BundleContext context) throws Exception { // NOPMD
    super.start(context);
    initializeResourceServiceProviderRegistry(context);
  }

  /**
   * Initializes the resource service provider registry.
   * 
   * @param context
   *          the bundle context
   */
  private void initializeResourceServiceProviderRegistry(final BundleContext context) {
    IExtensionRegistry eReg = Platform.getExtensionRegistry();
    String symbolicName = context.getBundle().getSymbolicName();
    new LanguageCheckImplRegistryReader(eReg, symbolicName).readRegistry();
    new LanguageCheckQuickfixImplRegistryReader(eReg, symbolicName).readRegistry();
  }

}