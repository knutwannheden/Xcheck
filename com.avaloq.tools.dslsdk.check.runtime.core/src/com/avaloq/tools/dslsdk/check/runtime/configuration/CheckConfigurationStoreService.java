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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;


/**
 * A "Default" Check Configuration Service. Gets a {@link ICheckConfigurationStore} for
 * any given context object associated to an {@link IProject}.
 */
public class CheckConfigurationStoreService implements ICheckConfigurationStoreService {

  // CHECKSTYLE:OFF
  protected IProject project;
  // CHECKSTYLE:ON

  @Inject
  private ICheckConfigurationStore configurationStore;

  public CheckConfigurationStoreService() { // NOPMD
    // does nothing yet
  }

  /** {@inheritDoc} */
  public ICheckConfigurationStore getCheckConfigurationStore(final Object context) {
    setProject(context);
    if (configurationStore != null) {
      if (configurationStore instanceof DefaultCheckConfigurationStore) {
        // project can be null!
        ((DefaultCheckConfigurationStore) configurationStore).setProject(this.project);
      }
      return configurationStore;
    }
    return null;
  }

  /**
   * Sets the project if an associated instance can be found for given context object.
   * <p>
   * This is the default implementation. Only platform URI-based schemas are supported. Other implementations may overwrite {@link #getProject()}.
   * </p>
   * 
   * @param context
   *          the context object, potentially contained by an IProject
   */
  // TODO find a better way to determine the context
  protected void setProject(final Object context) {
    if (context instanceof IProject) {
      this.project = (IProject) context;
    } else if (context instanceof IFile) {
      this.project = ((IFile) context).getProject();
    } else if (context instanceof EObject && ((EObject) context).eResource() != null) {
      final Resource resource = ((EObject) context).eResource();
      if (resource.getURI().isPlatform()) {
        final IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getURI().toPlatformString(true));
        this.project = file.getProject();
      }
    }
  }
}

/* Copyright (c) Avaloq License AG */