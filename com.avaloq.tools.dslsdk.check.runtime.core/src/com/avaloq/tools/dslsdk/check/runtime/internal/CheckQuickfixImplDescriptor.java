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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreQuickfixProvider;
import com.google.inject.Provider;


/**
 * Defines a descriptor of a Check quickfix provider instance. Gets the actual quickfix provider
 * implementation from the extension point registry. Instances of this class are created when the
 * extension point registry is read.
 */
public class CheckQuickfixImplDescriptor implements Provider<ICoreQuickfixProvider>, ICheckImplDescriptor {

  private static final Logger LOGGER = Logger.getLogger(CheckQuickfixImplDescriptor.class);

  private final IConfigurationElement element;
  private final String attClass;
  private ICoreQuickfixProvider provider;

  public CheckQuickfixImplDescriptor(final IConfigurationElement element, final String attClass) {
    this.element = element;
    this.attClass = attClass;
  }

  public IConfigurationElement getElement() {
    return element;
  }

  /**
   * Gets the quickfix provider as specified in the {@code plugin.xml} file.
   * Will log error and return {@code null} if no implementation could be found.
   * <p>
   * {@inheritDoc}
   */
  public synchronized ICoreQuickfixProvider get() {
    if (this.provider == null) {
      try {
        this.provider = (ICoreQuickfixProvider) element.createExecutableExtension(attClass);
      } catch (CoreException e) {
        LOGGER.error(e.getMessage(), e);
      }
    }
    return this.provider;
  }

}

/* Copyright (c) Avaloq License AG */