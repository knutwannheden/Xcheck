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

