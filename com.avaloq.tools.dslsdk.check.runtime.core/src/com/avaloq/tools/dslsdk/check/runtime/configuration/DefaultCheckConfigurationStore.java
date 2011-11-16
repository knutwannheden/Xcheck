/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.configuration;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;

import com.google.inject.Inject;


// @Format-Off
/**
 * The default check configuration store looks up configurable values for check
 * properties in the Eclipse preferences. Looks up the {@link ProjectScope
 * project scope} in order to check if custom check configurations have been defined.
 * <p>
 * If no customized check configurations exist, the default {@link InstanceScope instance
 * scope} is used to query default values which have been set using implementations of
 * {@link org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer AbstractPreferenceInitializer}
 * (using the {@code org.eclipse.core.runtime.preferences} extension point.
 * </p>
 * <p>
 * Note: This configuration store would not necessarily need to look up the instance scope for  
 * finding default values for configurable check properties. All "get" operation signatures 
 * ({@link #getBoolean(String, String, boolean) getBoolean}, {@link #getInt(String, String, int) getInt}
 * and {@link #getString(String, String, String) getString})  require a default value to 
 * be passed. These operations are called by code generated from check catalogs, in which 
 * default values are accessible.
 * </p>
 * <p>
 * Default values are returned if no configured properties were found in the project scope.
 * </p>
 */
// @Format-Off
public class DefaultCheckConfigurationStore implements ICheckConfigurationStore {

  private static final IScopeContext[] DEFAULT_SCOPE_CONTEXT = new IScopeContext[] {InstanceScope.INSTANCE};
  private ProjectScope projectScope;
  private IProject project;

  /**
   * Initializes the scope lookup order.
   */
  @Inject
  public void initializeLookupOrder() {
    Platform.getPreferencesService().setDefaultLookupOrder(CHECK_CONFIGURATION_NODE, null, new String[] {ProjectScope.SCOPE});
  }

  public void setProject(final IProject project) {
    this.project = project;
  }

  /**
   * Gets the scope context to be used. Returns {@code null} if the {@link IProject project} is {@code null}.
   * 
   * @return the scope context
   */
  private IScopeContext getProjectScope() {
    if (project == null) {
      return null;
    }
    if (projectScope == null) {
      projectScope = new ProjectScope(project);
    }
    return projectScope;
  }

  /** {@inheritDoc} */
  public boolean getBoolean(final String catalog, final String key, final boolean defaultValue) {
    if (getProjectScope() != null) {
      return getProjectScope().getNode(CHECK_CONFIGURATION_NODE).getBoolean(key, defaultValue);
    } else {
      // TODO consider just returning 'defaultValue'
      return Platform.getPreferencesService().getBoolean(catalog, key, defaultValue, DEFAULT_SCOPE_CONTEXT);
    }
  }

  /** {@inheritDoc} */
  public int getInt(final String catalog, final String key, final int defaultValue) {
    if (getProjectScope() != null) {
      return getProjectScope().getNode(CHECK_CONFIGURATION_NODE).getInt(key, defaultValue);
    } else {
      // TODO consider just returning 'defaultValue'
      return Platform.getPreferencesService().getInt(catalog, key, defaultValue, DEFAULT_SCOPE_CONTEXT);
    }
  }

  /** {@inheritDoc} */
  public String getString(final String catalog, final String key, final String defaultValue) {
    if (getProjectScope() != null) {
      return getProjectScope().getNode(CHECK_CONFIGURATION_NODE).get(key, defaultValue);
    } else {
      // TODO consider just returning 'defaultValue'
      return Platform.getPreferencesService().getString(catalog, key, defaultValue, DEFAULT_SCOPE_CONTEXT);
    }
  }

}

/* Copyright (c) Avaloq License AG */