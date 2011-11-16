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

/**
 * Issue codes used for the Check Configuration Java validator.
 */
public final class IssueCodes {
  private static final String ISSUE_CODE_PREFIX = "com.avaloq.tools.dslsdk.checkcfg.validation.IssueCodes.";

  public static final String DISABLED_CHECK_NOT_CONFIGURED = ISSUE_CODE_PREFIX + "configuration_for_disabled_check";
  public static final String REFERENCED_CHECK_NOT_CONFIGURED = ISSUE_CODE_PREFIX + "missing_configuration_for_check";
  public static final String FINAL_CATALOG_NOT_CONFIGURABLE = ISSUE_CODE_PREFIX + "final_catalog_not_configurable";
  public static final String FINAL_CHECK_NOT_CONFIGURABLE = ISSUE_CODE_PREFIX + "final_check_not_configurable";
  public static final String CONFIGURED_PARAM_EQUALS_DEFAULT = ISSUE_CODE_PREFIX + "configured_param_equals_default";
  public static final String DUPLICATE_CATALOG_CONFIGURATION = ISSUE_CODE_PREFIX + "duplicate_catalog_configuration";
  public static final String DUPLICATE_CHECK_CONFIGURATION = ISSUE_CODE_PREFIX + "duplicate_check_configuration";
  public static final String DUPLICATE_PARAMETER_CONFIGURATION = ISSUE_CODE_PREFIX + "duplicate_parameter_configuration";
  public static final String SEVERITY_NOT_ALLOWED = ISSUE_CODE_PREFIX + "severity_not_allowed";

  private IssueCodes() {
    // No instantiation.
  }

}

/* Copyright (c) Avaloq License AG */