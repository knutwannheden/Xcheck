/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.util;

import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XIntLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.util.XExpressionHelper;


/**
 * The expression helper class provides a workaround for a known bug.
 */
public class CheckExpressionHelper extends XExpressionHelper {

  /** {@inheritDoc} */
  @Override
  public boolean isLiteral(final XExpression expr) {
    // CHECKSTYLE:OFF
    // dirty workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=350748
    return expr.eClass() instanceof XClosure || expr.eClass() instanceof XBooleanLiteral || expr.eClass() instanceof XIntLiteral
        || expr.eClass() instanceof XNullLiteral || expr.eClass() instanceof XStringLiteral || expr.eClass() instanceof XTypeLiteral;
    // CHECKSTYLE:ON
  }

}

/* Copyright (c) Avaloq License AG */