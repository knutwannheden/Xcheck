/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.typing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.avaloq.tools.dslsdk.check.check.CheckPackage;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.check.check.XGuardExpression;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.google.inject.Singleton;


/**
 * The type provider for the Check language.
 */
@Singleton
@SuppressWarnings("restriction")
public class CheckTypeProvider extends XbaseTypeProvider {
  // CHECKSTYLE:OFF

  @Override
  protected JvmTypeReference type(final XExpression expression, final JvmTypeReference rawExpectation, final boolean rawType) {
    if (expression instanceof Context) {
      return _type((Context) expression, rawExpectation, rawType);
    } else if (expression instanceof XGuardExpression) {
      return _type((XGuardExpression) expression, rawExpectation, rawType);
    } else if (expression instanceof XIssueExpression) {
      return _type((XIssueExpression) expression, rawExpectation, rawType);
    }
    return super.type(expression, rawExpectation, rawType);
  }

  @Override
  protected JvmTypeReference expectedType(final EObject container, final EReference reference, final int index, final boolean rawType) {
    if (container instanceof Context) {
      Context context = (Context) container;
      return _expectedType(context, reference, index, rawType);
    } else if (container instanceof XGuardExpression) {
      return _expectedType((XGuardExpression) container, reference, index, rawType);
    } else if (container instanceof XIssueExpression) {
      return _expectedType((XIssueExpression) container, reference, index, rawType);
    } else if (container instanceof FormalParameter) {
      return _expectedType((FormalParameter) container, reference, index, rawType);
    }
    return super.expectedType(container, reference, index, rawType);
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _expectedType(final Context expression, final EReference reference, final int index, final boolean rawType) {
    if (reference == CheckPackage.Literals.CONTEXT__CONSTRAINT) {
      return getTypeReferences().getTypeForName(Void.TYPE, expression.getConstraint()); // the context constraint is void
    }
    return null; // no expectations
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _type(final Context expression, final JvmTypeReference rawExpectation, final boolean rawType) {
    return getPrimitiveVoid(expression.getConstraint());
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _expectedType(final XGuardExpression expression, final EReference reference, final int index, final boolean rawType) {
    if (reference == CheckPackage.Literals.XGUARD_EXPRESSION__GUARD) {
      return getTypeReferences().getTypeForName(Boolean.TYPE, expression);
    }
    return getExpectedType(expression, rawType);
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _type(final XGuardExpression expression, final JvmTypeReference rawExpectation, final boolean rawType) {
    return getPrimitiveVoid(expression);
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _expectedType(final XIssueExpression expression, final EReference reference, final int index, final boolean rawType) {
    if (reference == CheckPackage.Literals.XISSUE_EXPRESSION__MARKER_OBJECT) {
      return getTypeReferences().wildCardExtends(getTypeReferences().getTypeForName(EObject.class, expression));
    }
    if (reference == CheckPackage.Literals.XISSUE_EXPRESSION__MARKER_INDEX) {
      return getTypeReferences().getTypeForName(Integer.TYPE, expression);
    }
    // TODO: really String? actually NLS.bind takes any object
    if (reference == CheckPackage.Literals.XISSUE_EXPRESSION__MESSAGE_PARAMETERS) {
      return getTypeReferences().getTypeForName(String.class, expression);
    }
    // issue data can only be Strings (see Xtext documentation)
    if (reference == CheckPackage.Literals.XISSUE_EXPRESSION__ISSUE_DATA) {
      return getTypeReferences().getTypeForName(String.class, expression);
    }
    return null; // no expectation
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _expectedType(final FormalParameter parameter, final EReference reference, final int index, final boolean rawType) {
    if (reference == CheckPackage.Literals.FORMAL_PARAMETER__DEFAULT_VALUE) {
      return parameter.getParameter().getParameterType();
    }
    return null; // no expectation
  }

  /** {@inheritDoc} */
  protected JvmTypeReference _type(final XIssueExpression expression, final JvmTypeReference rawExpectation, final boolean rawType) {
    return getPrimitiveVoid(expression);
  }

}
// CHECKSTYLE:ON

/* Copyright (c) Avaloq License AG */