/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.check.impl;

import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.avaloq.tools.dslsdk.check.util.CheckUtil;


/**
 * Provides custom behavior for {@link CheckImpl}.
 */
public class CheckImplCustom extends CheckImpl {

  @Override
  public String getName() {
    if (!StringExtensions.isNullOrEmpty(getId())) {
      return getId();
    } else {
      return CheckUtil.toIdentifier(getLabel());
    }
  }

  @Override
  public String getMessage() {
    if (!StringExtensions.isNullOrEmpty(getGivenMessage())) {
      return getGivenMessage();
    } else {
      return getLabel();
    }
  }
}

/* Copyright (c) Avaloq License AG */