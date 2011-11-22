/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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
 * The extension point utility class for Check quickfixes. Intended to be used by the Check builder participant.
 */
public final class CheckQuickfixExtensionUtil extends AbstractCheckExtensionUtil {

  public static final String QUICKFIX_EXTENSION_POINT_ID = "com.avaloq.tools.dslsdk.check.runtime.core.checkquickfix";

  private static final String PROVIDER_ELEMENT_TAG = "provider";

  @Inject
  private CheckGeneratorExtensions generatorExtensions;

  @Override
  String getExtensionPointId() {
    return QUICKFIX_EXTENSION_POINT_ID;
  }

  @Override
  String getExtensionPointName(final CheckCatalog catalog) {
    return "Check quickfix extension for " + catalog.getName();
  }

  @Override
  Iterable<? extends IPluginObject> getPluginElements(final CheckCatalog catalog, final IPluginExtension extension) throws CoreException {
    IPluginElement element = extension.getModel().getFactory().createElement(extension);
    return Collections.singletonList(updateOnlyPluginElement(catalog, element));
  }

  /**
   * Updates the plugin element. The {@code name}, {@code target class} and {@code language} attributes of the plugin
   * extension are set to values based on given check catalog.
   * 
   * @param catalog
   *          the catalog
   * @param element
   *          the element
   * @return the updated plugin element
   * @throws CoreException
   *           a core exception
   */
  private IPluginElement updateOnlyPluginElement(final CheckCatalog catalog, final IPluginElement element) throws CoreException {
    element.setName(PROVIDER_ELEMENT_TAG);
    element.setAttribute(TARGET_CLASS_ELEMENT_TAG, generatorExtensions.qualifiedQuickfixClassName(catalog));
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
    // The quickfix extension must define a provider plugin element
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
    return generatorExtensions.qualifiedQuickfixClassName(catalog);
  }

  @Override
  public boolean isExtensionUpdateRequired(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements) {
    // CHECKSTYLE:OFF
    // @Format-Off
    return extension.getPoint().equals(QUICKFIX_EXTENSION_POINT_ID) && extensionNameMatches(extension, catalog)
        && !(Iterables.size(elements) == 1
        && targetClassMatches(Iterables.get(elements, 0), getTargetClassName(catalog))
        && languageNameMatches(Iterables.get(elements, 0), catalog.getGrammar().getName()));
    // @Format-On
    // CHECKSTYLE:ON
  }
}

/* Copyright (c) Avaloq License AG */