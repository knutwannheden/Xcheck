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

import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginObject;

import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.generator.CheckGeneratorExtensions;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;


/**
 * The extension point utility class for Check validators. Intended to be used by the Check builder participant.
 */
public final class CheckValidatorExtensionUtil extends AbstractCheckExtensionUtil {

  public static final String CHECK_EXTENSION_POINT_ID = "com.avaloq.tools.dslsdk.check.runtime.core.check";

  private static final String VALIDATOR_ELEMENT_TAG = "validator";

  @Inject
  private CheckGeneratorExtensions generatorExtensions;

  @Override
  String getExtensionPointId() {
    return CHECK_EXTENSION_POINT_ID;
  }

  @Override
  String getExtensionPointName(final CheckCatalog catalog) {
    return "Check extension for " + catalog.getName();
  }

  @Override
  Iterable<? extends IPluginObject> getPluginElements(final CheckCatalog catalog, final IPluginExtension extension) throws CoreException {
    IPluginElement element = extension.getModel().getFactory().createElement(extension);
    return Collections.singletonList(updateOnlyPluginElement(catalog, element));
  }

  /**
   * Updates the plugin element.
   * 
   * @param catalog
   *          the catalog
   * @param element
   *          the element
   * @return the i plugin element
   * @throws CoreException
   *           the core exception
   */
  private IPluginElement updateOnlyPluginElement(final CheckCatalog catalog, final IPluginElement element) throws CoreException {
    element.setName(VALIDATOR_ELEMENT_TAG);
    element.setAttribute(TARGET_CLASS_ELEMENT_TAG, generatorExtensions.qualifiedValidatorClassName(catalog));
    element.setAttribute(LANGUAGE_ELEMENT_TAG, catalog.getGrammar().getName());
    return element;
  }

  /**
   * Updates {@code name}, {@code target class} and {@code language} of given extension to values
   * calculated using given check catalog.
   * 
   * @param catalog
   *          the check catalog
   * @param extension
   *          the plugin extension
   * @param elements
   *          the elements
   * @throws CoreException
   *           a core exception
   */
  @Override
  public void updateExtension(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements) throws CoreException {
    // The validator extension must define a validator plugin element
    if (Iterables.size(elements) == 1) {
      extension.setName(getExtensionPointName(catalog));
      updateOnlyPluginElement(catalog, Iterables.get(elements, 0));
    }
  }

  /**
   * Gets the target class name based on the package path of given check catalog.
   * 
   * @param catalog
   *          the check catalog
   * @return the target class FQN
   */
  @Override
  public String getTargetClassName(final CheckCatalog catalog) {
    return generatorExtensions.qualifiedValidatorClassName(catalog);
  }

  @Override
  public boolean isExtensionUpdateRequired(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements) {
    // CHECKSTYLE:OFF
    // @Format-Off
    return extension.getPoint().equals(CHECK_EXTENSION_POINT_ID) && extensionNameMatches(extension, catalog)
        && !(Iterables.size(elements) == 1
        && targetClassMatches(Iterables.get(elements, 0), getTargetClassName(catalog))
        && languageNameMatches(Iterables.get(elements, 0), catalog.getGrammar().getName())
    );
    // @Format-On
    // CHECKSTYLE:ON
  }
}

/* Copyright (c) Avaloq License AG */