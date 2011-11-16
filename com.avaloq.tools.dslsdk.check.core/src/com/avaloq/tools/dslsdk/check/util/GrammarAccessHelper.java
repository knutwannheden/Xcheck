/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.util;

import org.eclipse.xtext.IGrammarAccess;


/**
 * Utility operation for Grammar Access.
 */
public class GrammarAccessHelper extends GrammarHelper {

  /** The grammar access. */
  private final IGrammarAccess grammarAccess;

  public GrammarAccessHelper(final IGrammarAccess grammarAccess) {
    super(grammarAccess.getGrammar());
    this.grammarAccess = grammarAccess;
  }

  /**
   * Gets the bundle symbolic name.
   * 
   * @return the bundle symbolic name
   */
  public String getBundleSymbolicName() {
    Class<?> c = grammarAccess.getClass();
    return getBundleSymbolicName(c);
  }

}

/* Copyright (c) Avaloq License AG */