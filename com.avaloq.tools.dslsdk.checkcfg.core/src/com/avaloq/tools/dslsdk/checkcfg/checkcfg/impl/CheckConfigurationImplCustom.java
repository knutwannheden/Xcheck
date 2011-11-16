/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl; // NOPMD should be changed

/**
 * Configures custom behavior for the Check Configuration model element.
 */
public class CheckConfigurationImplCustom extends CheckConfigurationImpl {

  /**
   * Converts the given label to a Java identifier.
   * <p>
   * {@inheritDoc}
   */
  @Override
  public String getName() {
    return com.avaloq.tools.dslsdk.check.util.CheckUtil.toIdentifier(this.getLabel());
  }

}

/* Copyright (c) Avaloq License AG */