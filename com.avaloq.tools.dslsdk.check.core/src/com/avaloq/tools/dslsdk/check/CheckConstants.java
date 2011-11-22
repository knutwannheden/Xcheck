/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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

