/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry.
 */
public class CheckStandaloneSetup extends CheckStandaloneSetupGenerated {

  /** Do setup. */
  public static void doSetup() {
    new CheckStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

/* Copyright (c) Avaloq License AG */