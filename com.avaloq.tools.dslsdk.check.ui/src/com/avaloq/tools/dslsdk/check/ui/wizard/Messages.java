/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.wizard;

import org.eclipse.osgi.util.NLS;


/**
 * The messages used for the wizards.
 */
// CHECKSTYLE:OFF
public final class Messages extends NLS {

  private static final String BUNDLE_NAME = "com.avaloq.tools.dslsdk.check.ui.wizard.messages"; //$NON-NLS-1$

  public static String PROJECT_WIZARD_TITLE;
  public static String CATALOG_WIZARD_TITLE;
  public static String PROJECT_WIZARD_WINDOW_TITLE;
  public static String CATALOG_WIZARD_WINDOW_TITLE;

  public static String CATALOG_WIZARD_DESCRIPTION;
  public static String PROJECT_WIZARD_DESCRIPTION;

  public static String CATALOG_FIELD_NAME_LABEL;
  public static String GRAMMAR_FIELD_NAME_LABEL;
  public static String PROJECT_NAME_LABEL;
  public static String PACKAGE_NAME_LABEL;

  public static String CHOOSE_GRAMMAR_ID;
  public static String EXTENSION_MODIFICATION_READONLY;
  public static String NO_CHARSET_DEFINED;
  public static String NO_PROJECT_DEFINED;

  public static String PROJECT_WIZARD_COMPLETE;
  public static String CATALOG_WIZARD_COMPLETE;

  static {
    // Initialize the resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  /**
   * Prevents instantiation.
   */
  private Messages() { // NOPMD
    // Do nothing.
  }

}
// CHECKSTYLE:ON

/* Copyright (c) Avaloq License AG */