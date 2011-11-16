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

import org.eclipse.xtext.naming.QualifiedName;


/**
 * Provides language specific constants for Check.
 */
public final class CheckConstants {
  public static final String GRAMMAR = "com.avaloq.tools.dslsdk.check.Check"; //$NON-NLS-1$
  public static final String FILE_EXTENSION = "check"; //$NON-NLS-1$

  public static final String IT = "it"; //$NON-NLS-1$
  public static final QualifiedName QNIT = QualifiedName.create(IT);

  private CheckConstants() {}
}

/* Copyright (c) Avaloq License AG */