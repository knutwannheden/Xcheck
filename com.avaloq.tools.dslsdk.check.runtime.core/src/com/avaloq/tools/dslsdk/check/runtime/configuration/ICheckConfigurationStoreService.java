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

/* Copyright (c) Avaloq License AG */