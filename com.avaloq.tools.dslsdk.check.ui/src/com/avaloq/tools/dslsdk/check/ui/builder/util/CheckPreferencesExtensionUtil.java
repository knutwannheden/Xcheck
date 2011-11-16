/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.builder.util;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.xtext.util.Strings;

import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.generator.CheckGeneratorExtensions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;


/**
 * The extension point utility class for preference initializers. Intended to be used by the Check builder participant.
 */
public final class CheckPreferencesExtensionUtil extends AbstractCheckExtensionUtil {

  public static final String PREFERENCES_EXTENSION_POINT_ID = "org.eclipse.core.runtime.preferences";

  private static final String EXTENSION_NAME_PREFIX = "Preferences extension for ";
  private static final String SCOPE_ELEMENT_TAG = "scope";
  private static final String INITIALIZER_ELEMENT_TAG = "initializer";
  private static final String CLASS_ATTRIBUTE_TAG = "class";
  private static final String NAME_ATTRIBUTE_TAG = "name";

  @Inject
  private CheckGeneratorExtensions generatorExtensions;

  /**
   * Updates the preferences extension with current values as provided by given check catalog.
   * 
   * @param catalog
   *          the check catalog
   * @param extension
   *          the extension to be updated
   * @param elements
   *          the elements
   * @throws CoreException
   *           a core exception
   */
  @Override
  public void updateExtension(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements) throws CoreException {
    // The preference extension must define a scope plugin element only
    if (Iterables.size(elements) == 1) {
      extension.setName(getExtensionPointName(catalog));
      updateInitializerElement(catalog, Iterables.get(elements, 0));
    }
  }

  /**
   * Updates the initializer plug-in element.
   * 
   * @param catalog
   *          the catalog
   * @param element
   *          the element
   * @return the i plugin element
   * @throws CoreException
   *           the core exception
   */
  private IPluginElement updateInitializerElement(final CheckCatalog catalog, final IPluginElement element) throws CoreException {
    element.setName(INITIALIZER_ELEMENT_TAG);
    element.setAttribute(CLASS_ATTRIBUTE_TAG, getTargetClassName(catalog));
    return element;
  }

  /**
   * Updates the scope plug-in element.
   * 
   * @param catalog
   *          the catalog
   * @param element
   *          the element
   * @return the i plugin element
   * @throws CoreException
   *           the core exception
   */
  @SuppressWarnings("unused")
  private IPluginElement updateScopeElement(final CheckCatalog catalog, final IPluginElement element) throws CoreException {
    element.setName(SCOPE_ELEMENT_TAG);
    element.setAttribute(NAME_ATTRIBUTE_TAG, catalog.getName() + ".preference");
    // element.setAttribute(CLASS_ATTRIBUTE_TAG, "com.avaloq.tools.dslsdk.check.runtime.configuration.CheckConfigurationProjectPreferences");
    return element;
  }

  /**
   * Checks if the initializer class value of given plugin extension element matches with that calculated using given check catalog.
   * 
   * @param element
   *          the plugin extension element
   * @param initializerClassName
   *          the initializer class FQN
   * @return {@code true}, if given plugin extension element is up to date
   */
  private boolean initializerClassMatches(final IPluginElement element, final String initializerClassName) {
    return element != null && Strings.equal(element.getAttribute(CLASS_ATTRIBUTE_TAG).getValue(), initializerClassName);
  }

  /**
   * Checks if the name of given plugin extension matches with that calculated using given check catalog.
   * 
   * @param extension
   *          the plugin extension
   * @param catalog
   *          the check catalog
   * @return {@code true}, if given plugin extension element is up to date
   */
  @Override
  public boolean extensionNameMatches(final IPluginExtension extension, final CheckCatalog catalog) {
    return Strings.equal(extension.getName(), EXTENSION_NAME_PREFIX + catalog.getName());
  }

  @Override
  Iterable<? extends IPluginObject> getPluginElements(final CheckCatalog catalog, final IPluginExtension extension) throws CoreException {
    List<IPluginElement> result = Lists.newArrayList();
    result.add(updateInitializerElement(catalog, extension.getModel().getFactory().createElement(extension)));
    // result.add(updateScopeElement(catalog, extension.getModel().getFactory().createElement(extension)));
    return result;// Lists.newArrayList(updatePluginElements(catalog, initializerElement));
  }

  @Override
  String getExtensionPointId() {
    return PREFERENCES_EXTENSION_POINT_ID;
  }

  @Override
  String getExtensionPointName(final CheckCatalog catalog) {
    return EXTENSION_NAME_PREFIX + catalog.getName();
  }

  @Override
  public String getTargetClassName(final CheckCatalog catalog) {
    return generatorExtensions.qualifiedPreferenceInitializerClassName(catalog);
  }

  /**
   * Gets the initializer element.
   * 
   * @param elements
   *          the elements
   * @return the initializer element
   */
  private IPluginElement getInitializerElement(final Iterable<IPluginElement> elements) {
    for (IPluginElement e : elements) {
      if (e.getName().equals(INITIALIZER_ELEMENT_TAG)) {
        return e;
      }
    }
    return null;
  }

  @Override
  public boolean isExtensionUpdateRequired(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements) {
    // @Format-Off
    return extension.getPoint().equals(PREFERENCES_EXTENSION_POINT_ID) && extensionNameMatches(extension, catalog) 
        && !(Iterables.size(elements) == 2
        && initializerClassMatches(getInitializerElement(elements), getTargetClassName(catalog)));
    // @Format-On
  }

}

/* Copyright (c) Avaloq License AG */