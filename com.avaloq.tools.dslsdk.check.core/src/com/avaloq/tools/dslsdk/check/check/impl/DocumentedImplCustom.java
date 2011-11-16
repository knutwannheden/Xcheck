/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.check.impl;

import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Strings;


/**
 * A generic implementation getDescription that returns the Document provider yielded value.
 */
public class DocumentedImplCustom extends DocumentedImpl {

  /** {@inheritDoc} */
  @Override
  public String getDescription() {
    if (!this.eIsProxy() && this.eResource() != null) {
      IResourceServiceProvider serviceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(this.eResource().getURI());
      if (serviceProvider != null) {
        IEObjectDocumentationProvider documentationProvider = serviceProvider.get(IEObjectDocumentationProvider.class);
        String documentation = documentationProvider.getDocumentation(this);
        if (!Strings.isEmpty(documentation)) { // NOPMD
          return documentation;
        }
      }
    }
    return null;
  }
}

/* Copyright (c) Avaloq License AG */