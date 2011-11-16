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