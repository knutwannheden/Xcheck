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
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.emf.ecore.plugin.RegistryReader;

import com.google.common.collect.Multimap;


/**
 * The abstract registry reader for check and check quickfix extension point registers.
 */
abstract class AbstractCheckRegistryReader extends RegistryReader {

  /** The common attribute ATT_CLASS denoting the target implementation class. */
  protected static final String ATT_CLASS = "targetClass"; //$NON-NLS-1$

  public AbstractCheckRegistryReader(final IExtensionRegistry pluginRegistry, final String pluginID, final String extensionPointID) {
    super(pluginRegistry, pluginID, extensionPointID);
  }

  /**
   * Gets the top-level configuration element name for check or check quickfix extensions. Should be either of the following:
   * <ul>
   * <li>{@code provider}
   * <li>{@code validator}
   * </ul>
   * 
   * @return the top-level element name
   */
  protected abstract String topLevelElementName();

  /**
   * Creates a new check implementation descriptor.
   * 
   * @param element
   *          the configuration element
   * @param attClass
   *          the implementing class
   * @return the descriptor
   */
  protected abstract ICheckImplDescriptor newDescriptor(final IConfigurationElement element, final String attClass);

  /**
   * Gets the map containing language to implementation descriptor mappings.
   * 
   * @return the map
   */
  protected abstract Multimap<String, Object> getMap();

  /**
   * Gets the logger.
   * 
   * @return the logger
   */
  protected abstract Logger getLogger();

  /** {@inheritDoc} */
  @Override
  protected void logError(final IConfigurationElement element, final String text) {
    IExtension extension = element.getDeclaringExtension();
    getLogger().error("Plugin " + extension.getContributor().getName() + ", extension " + extension.getExtensionPointUniqueIdentifier()); //$NON-NLS-1$ //$NON-NLS-2$
    getLogger().error(text);
  }

  /**
   * Gets the value for a given key attribute in the language validator map.
   * 
   * @param element
   *          the element
   * @return the value for key attribute
   */
  protected String getValueForKeyAttribute(final IConfigurationElement element) {
    return element.getAttribute(getKeyAttribute());
  }

  /**
   * Gets the key attribute for mappings in the language validator map. Should correspond to an Xtext Grammar name.
   * 
   * @return the grammar name
   */
  protected String getKeyAttribute() {
    return "language"; //$NON-NLS-1$
  }

  /** {@inheritDoc} */
  @Override
  protected boolean readElement(final IConfigurationElement element, final boolean add) {
    if (element.getName().equals(topLevelElementName())) {
      String languageIdentifier = getValueForKeyAttribute(element);
      if (languageIdentifier == null) {
        logMissingAttribute(element, getKeyAttribute());
      } else if (element.getAttribute(ATT_CLASS) == null) {
        logMissingAttribute(element, ATT_CLASS);
      } else if (add) {
        getMap().put(languageIdentifier, newDescriptor(element, ATT_CLASS));
        return true;
      } else {
        getMap().removeAll(languageIdentifier);
        return true;
      }
    }
    return false;
  }
}

/* Copyright (c) Avaloq License AG */