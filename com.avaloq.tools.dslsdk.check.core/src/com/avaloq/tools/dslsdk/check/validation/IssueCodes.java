/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.validation;

/**
 * Issue codes used for the Check Java validator.
 */
public final class IssueCodes {
  private static final String ISSUE_CODE_PREFIX = "com.avaloq.tools.dslsdk.check.validation.IssueCodes.";

  public static final String CHECK_IMPLICITLY_FINAL = ISSUE_CODE_PREFIX + "check_implicitly_final";
  public static final String CONTEXT_TYPE_IS_ECLASS = ISSUE_CODE_PREFIX + "context_type_is_eclass";
  public static final String CONTEXT_TYPES_NOT_UNIQUE = ISSUE_CODE_PREFIX + "context_type_not_unique";
  public static final String DEAD_CODE = ISSUE_CODE_PREFIX + "dead_code";
  public static final String DEFAULT_SEVERITY_NOT_IN_RANGE = ISSUE_CODE_PREFIX + "default_severity_not_in_range";
  public static final String DUPLICATE_CATEGORY = ISSUE_CODE_PREFIX + "category_name_must_be_unique";
  public static final String DUPLICATE_CHECK = ISSUE_CODE_PREFIX + "check_name_must_be_unique";
  public static final String FORMAL_PARAMETER_TYPE = ISSUE_CODE_PREFIX + "formal_param_type";
  public static final String GUARDS_COME_FIRST = ISSUE_CODE_PREFIX + "guards_come_first";
  public static final String ILLEGAL_SEVERITY_RANGE_ORDER = ISSUE_CODE_PREFIX + "illegal_severity_range_order";
  public static final String IMPLICIT_ISSUED_CHECK = ISSUE_CODE_PREFIX + "check_is_check_definition";
  public static final String INCLUDED_CATALOG_GRAMMAR_MISMATCH = ISSUE_CODE_PREFIX + "grammar_mismatch_of_included_category";
  public static final String INCLUDED_CATALOGS_WITH_CIRCULAR_DEPENDENCIES = ISSUE_CODE_PREFIX + "circular_dependency";
  public static final String INVALID_CATALOG_NAME = ISSUE_CODE_PREFIX + "invalid_catalog_name";
  public static final String INVALID_CATEGORY_NAME = ISSUE_CODE_PREFIX + "invalid_category_name";
  public static final String INVALID_CHECK_NAME = ISSUE_CODE_PREFIX + "invalid_check_name";
  public static final String INVALID_PACKAGE_NAME = ISSUE_CODE_PREFIX + "invalid_package_name";
  public static final String ISSUED_BINDINGS = ISSUE_CODE_PREFIX + "issued_bindings";
  public static final String ISSUED_CHECK = ISSUE_CODE_PREFIX + "issue_refers_to_check";
  public static final String MARKER_INDEX_MANY = ISSUE_CODE_PREFIX + "marker_index_for_many";
  public static final String MISSING_DOCUMENTATION_ON_CHECK = ISSUE_CODE_PREFIX + "missing_documentation_on_check";
  public static final String MISSING_DOCUMENTATION_ON_IMPLEMENTATION = ISSUE_CODE_PREFIX + "missing_documentation_on_implementation";
  public static final String MISSING_ISSUE_EXPRESSION = ISSUE_CODE_PREFIX + "missing_issue_expression";
  public static final String NAMES_MUST_BE_UNIQUE = ISSUE_CODE_PREFIX + "names_must_be_unique";
  public static final String RETURN_IN_IMPL = ISSUE_CODE_PREFIX + "return_in_implementation";
  public static final String SEVERITY_RANGES_FOR_FINAL_CHECK = ISSUE_CODE_PREFIX + "severity_ranges_for_final_check";
  public static final String UNSUPPORTED_CATALOG_FOR_PACKAGE = ISSUE_CODE_PREFIX + "catalog_for_epackage";
  public static final String UNSUPPORTED_FINAL_KEYWORD = ISSUE_CODE_PREFIX + "final_keyword";
  public static final String UNSUPPORTED_FORMAL_PARAMETER = ISSUE_CODE_PREFIX + "names_must_be_unique";
  public static final String UNSUPPORTED_IGNORE_SEVERITY = ISSUE_CODE_PREFIX + "ignore_severity";
  public static final String UNSUPPORTED_IMPLEMENTATION = ISSUE_CODE_PREFIX + "def_check";
  public static final String UNSUPPORTED_INCLUDED_CATALOG = ISSUE_CODE_PREFIX + "with_catalog";
  public static final String UNSUPPORTED_OPTIONAL_KW = ISSUE_CODE_PREFIX + "optional_keyword";
  public static final String UNSUPPORTED_SEVERITY_RANGES = ISSUE_CODE_PREFIX + "min_max_severity_range";
  public static final String WRONG_FILE = ISSUE_CODE_PREFIX + "wrong_file";
  public static final String WRONG_PACKAGE = ISSUE_CODE_PREFIX + "wrong_package";
  public static final String DUPLICATE_PARAMETER_DEFINITION = ISSUE_CODE_PREFIX + "duplicate_parameter_definition";

  private IssueCodes() {
    // No instantiation.
  }

}

/* Copyright (c) Avaloq License AG */