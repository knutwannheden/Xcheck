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