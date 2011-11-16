/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.runtime.issue;

// This is a copy of the check SeverityKind, we duplicate this class to avoid a dependency on the DSL plug-in.
/**
 * The severity kind supported.
 */
public enum SeverityKind {
  ERROR,
  WARNING,
  INFO,
  IGNORE
}

/* Copyright (c) Avaloq License AG */