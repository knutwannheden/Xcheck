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

