/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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