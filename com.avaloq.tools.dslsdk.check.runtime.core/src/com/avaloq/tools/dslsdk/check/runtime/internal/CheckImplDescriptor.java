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

import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckImpl;
import com.google.inject.Provider;


/**
 * TODO Document class.
 */
public class CheckImplDescriptor implements Provider<ICheckImpl>, ICheckImplDescriptor {

  private static final Logger LOGGER = Logger.getLogger(CheckImplDescriptor.class);

  private final IConfigurationElement element;
  private final String attClass;
  private ICheckImpl validator;

  public CheckImplDescriptor(final IConfigurationElement element, final String attClass) {
    this.element = element;
    this.attClass = attClass;
  }

  public IConfigurationElement getElement() {
    return element;
  }

  /**
   * Gets the validator as specified in the {@code plugin.xml} file.
   * Will log error and return {@code null} if no implementation could be found.
   * <p>
   * {@inheritDoc}
   */
  public synchronized ICheckImpl get() {
    if (this.validator == null) {
      try {
        this.validator = (ICheckImpl) element.createExecutableExtension(attClass);
      } catch (CoreException e) {
        LOGGER.error(e.getMessage(), e);
      }
    }
    return this.validator;
  }

}

/* Copyright (c) Avaloq License AG */