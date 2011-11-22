/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.configuration;

import com.google.inject.ImplementedBy;


/**
 * Simplifies access to Check configuration properties.
 */
@ImplementedBy(CheckConfigurationStoreService.class)
public interface ICheckConfigurationStoreService {

  /**
   * Returns the configuration store that handle Check Configuration properties based on a given context.
   * Typical context objects are {@link org.eclipse.emf.common.util.URI URI}s and {@link org.eclipse.core.resources.IProject
   * IProject}s.
   * <p>
   * Returns {@code null} if no project is associated with given context object.
   * </p>
   * 
   * @param context
   *          the context to ask
   * @return a check configuration store
   */
  ICheckConfigurationStore getCheckConfigurationStore(Object context);

}

