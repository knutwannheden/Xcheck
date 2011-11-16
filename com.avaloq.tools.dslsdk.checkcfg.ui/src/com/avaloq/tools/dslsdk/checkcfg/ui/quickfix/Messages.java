/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.checkcfg.ui.quickfix;

import org.eclipse.osgi.util.NLS;


// CHECKSTYLE:OFF
public class Messages extends NLS {

  private static final String BUNDLE_NAME = "com.avaloq.tools.dslsdk.checkcfg.ui.quickfix.messages"; //$NON-NLS-1$

  public static String CheckCfgQuickfixProvider_CORRECT_SEVERITY_DESCN;
  public static String CheckCfgQuickfixProvider_CORRECT_SEVERITY_LABEL;
  public static String CheckCfgQuickfixProvider_CORRECT_SEVERITY_OF_FINAL_CHECK_DESCN;
  public static String CheckCfgQuickfixProvider_CORRECT_SEVERITY_OF_FINAL_CHECK_LABEL;
  public static String CheckCfgQuickfixProvider_REMOVE_CONFIGURED_PARAM_DESCN;
  public static String CheckCfgQuickfixProvider_REMOVE_CONFIGURED_PARAM_LABEL;
  public static String CheckCfgQuickfixProvider_REMOVE_DUPLICATE_CATALOG_DESCN;
  public static String CheckCfgQuickfixProvider_REMOVE_DUPLICATE_CATALOG_LABEL;
  public static String CheckCfgQuickfixProvider_REMOVE_DUPLICATE_CHECK_DESCN;
  public static String CheckCfgQuickfixProvider_REMOVE_DUPLICATE_CHECK_LABEL;
  public static String CheckCfgQuickfixProvider_REMOVE_DUPLICATE_PARAM_DESCN;
  public static String CheckCfgQuickfixProvider_REMOVE_DUPLICATE_PARAM_LABEL;

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    super();
  }
}

/* Copyright (c) Avaloq License AG */