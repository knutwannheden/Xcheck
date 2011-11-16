/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.checkcfg.validation;

import org.eclipse.osgi.util.NLS;


// CHECKSTYLE:OFF
public class Messages extends NLS {

  private static final String BUNDLE_NAME = "com.avaloq.tools.dslsdk.checkcfg.validation.messages"; //$NON-NLS-1$

  public static String CheckCfgJavaValidator_DISABLED_CHECK_NOT_CONFIGURED;
  public static String CheckCfgJavaValidator_REFERENCED_CHECK_NOT_CONFIGURED;
  public static String CheckCfgJavaValidator_FINAL_CATALOG_NOT_CONFIGURABLE;
  public static String CheckCfgJavaValidator_FINAL_CHECK_NOT_CONFIGURABLE;
  public static String CheckCfgJavaValidator_CONFIGURED_PARAM_EQUALS_DEFAULT;
  public static String CheckCfgJavaValidator_DUPLICATE_CATALOG_CONFIGURATION;
  public static String CheckCfgJavaValidator_DUPLICATE_CHECK_CONFIGURATION;
  public static String CheckCfgJavaValidator_DUPLICATE_PARAMETER_CONFIGURATION;
  public static String CheckCfgJavaValidator_SEVERITY_NOT_ALLOWED;

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    super();
  }
}

/* Copyright (c) Avaloq License AG */