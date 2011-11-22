/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.builder.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.xtext.util.Strings;

import com.avaloq.tools.dslsdk.check.check.CheckCatalog;


/**
 * Abstract class for extension point utility classes. Defines operations required by the Check builder participant.
 */
public abstract class AbstractCheckExtensionUtil {

  protected static final String TARGET_CLASS_ELEMENT_TAG = "targetClass";
  protected static final String LANGUAGE_ELEMENT_TAG = "language";

  /**
   * Creates the extension. Note that the <code>id</code> attribute is optional and thus not created.
   * 
   * @param catalog
   *          the catalog for which to crate the extension content.
   * @param extensionId
   *          the extension id
   * @param pluginModel
   *          the model
   * @return the plugin extension
   * @throws CoreException
   *           a core exception
   */
  public IPluginExtension createExtension(final CheckCatalog catalog, final String extensionId, final IPluginModelBase pluginModel) throws CoreException {
    IPluginExtension newExtension = pluginModel.getFactory().createExtension();

    newExtension.setPoint(getExtensionPointId());
    newExtension.setId(extensionId);
    newExtension.setName(getExtensionPointName(catalog));

    // Add contents to the extension
    for (final IPluginObject p : getPluginElements(catalog, newExtension)) {
      newExtension.add(p);
    }

    return newExtension;
  }

  /**
   * Gets the plugin elements.
   * 
   * @param catalog
   *          the catalog
   * @param extension
   *          the extension
   * @return the plugin elements
   * @throws CoreException
   *           the core exception
   */
  abstract Iterable<? extends IPluginObject> getPluginElements(final CheckCatalog catalog, final IPluginExtension extension) throws CoreException;

  /**
   * Gets the extension point id.
   * 
   * @return the extension point id
   */
  abstract String getExtensionPointId();

  /**
   * Gets the extension point name.
   * 
   * @param catalog
   *          the check catalog
   * @return the extension point name
   */
  abstract String getExtensionPointName(CheckCatalog catalog);

  /**
   * Updates a given extension to values calculated using given check catalog.
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
  public abstract void updateExtension(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements) throws CoreException;

  /**
   * Gets the target class name based on the package path of given check catalog.
   * 
   * @param catalog
   *          the check catalog
   * @return the target class FQN
   */
  public abstract String getTargetClassName(final CheckCatalog catalog);

  /**
   * Checks if is extension update required.
   * <p>
   * Generally, the following conditions must always be true:
   * <ul>
   * <li>extension point ID is as defined by {@link #getExtensionPointId()}
   * <li>extension point name is as defined by {@link #getExtensionPointName(CheckCatalog)}
   * </ul>
   * In addition to the conditions named above, an update should only be triggered if either the target class value or the language name has changed.
   * </p>
   * <p>
   * Note that the extension ID and name is only changed by the builder participant. The results of {@link #languageNameMatches(IPluginElement, String)} and
   * 
   * @param catalog
   *          the catalog
   * @param extension
   *          the extension
   * @param elements
   *          the elements
   * @return true, if is extension update required {@link #targetClassMatches(IPluginElement, String)} are based on given check catalog and their values may
   *         have changed before the builder participant kicks
   *         in.
   *         </p>
   */
  public abstract boolean isExtensionUpdateRequired(final CheckCatalog catalog, final IPluginExtension extension, final Iterable<IPluginElement> elements);

  /**
   * Checks if the language name defined in given plugin extension element matches with given language.
   * 
   * @param element
   *          the plugin extension element
   * @param expectedLanguageName
   *          the expected language name
   * @return {@code true} if the language name as defined in the plugin extension element is up to date
   */
  public boolean languageNameMatches(final IPluginElement element, final String expectedLanguageName) {
    return Strings.equal(element.getAttribute(LANGUAGE_ELEMENT_TAG).getValue(), expectedLanguageName);
  }

  /**
   * Checks if the target class name defined in given plugin extension element matches with given target class name.
   * 
   * @param element
   *          the plugin extension element
   * @param expectedTargetClassName
   *          the expected target class name
   * @return {@code true} if the target class name as defined in the plugin extension element is up to date
   */
  public boolean targetClassMatches(final IPluginElement element, final String expectedTargetClassName) {
    return Strings.equal(element.getAttribute(TARGET_CLASS_ELEMENT_TAG).getValue(), expectedTargetClassName);
  }

  /**
   * Checks if the name of given plugin extension extension matches with that calculated based on given check catalog.
   * 
   * @param extension
   *          the plugin extension
   * @param catalog
   *          the check catalog
   * @return {@code true} if the extension name as defined in the plugin extension is up to date
   */
  public boolean extensionNameMatches(final IPluginExtension extension, final CheckCatalog catalog) {
    return Strings.equal(extension.getName(), getExtensionPointName(catalog));
  }

}

