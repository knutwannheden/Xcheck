/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.generator;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.avaloq.tools.dslsdk.check.CheckConstants;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.Context;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.check.check.XGuardExpression;
import com.avaloq.tools.dslsdk.check.check.XIssueExpression;
import com.google.inject.Inject;


/**
 * The Check compiler used for generating Java code from Check models.
 */
@SuppressWarnings("restriction")
// CHECKSTYLE:CONSTANTS-OFF
public class CheckCompiler extends XbaseCompiler {

  @Inject
  private CheckGeneratorExtensions generatorExtensions;

  /** {@inheritDoc} */
  public String compile(final Context context, final ImportManager importManager) {
    StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(importManager);
    // registerThis(context, appendable);
    // for(JvmFormalParameter param: operation.eContainer()) {
    // appendable.declareVariable(param, param.getName());
    // }
    return compile(context.getConstraint(), appendable, getTypeReferences().getTypeForName("void", context)).toString();
  }

  /** {@inheritDoc} */
  public String compile(final FormalParameter parameter, final ImportManager importManager) {
    StringBuilderBasedAppendable appendable = new StringBuilderBasedAppendable(importManager);
    return compile(parameter.getDefaultValue(), appendable, parameter.getParameter().getParameterType()).toString();
  }

  // protected void registerThis(Context context, StringBuilderBasedAppendable appendable) {
  // //TODO register this as the checkcatalog associated type (see also getVarName below!)
  //
  // // Set<EObject> elements = associations.getJvmElements(operation);
  // // JvmOperation jvmOp = (JvmOperation) elements.iterator().next();
  // // appendable.declareVariable(jvmOp.getDeclaringType(), "it");
  // }

  /** {@inheritDoc} */
  @Override
  protected boolean isVariableDeclarationRequired(final XExpression expression, final IAppendable b) {
    if (expression instanceof XAbstractFeatureCall && ((XAbstractFeatureCall) expression).getFeature() instanceof JvmGenericType) {
      return false;
    }
    return super.isVariableDeclarationRequired(expression, b);
  }

  /** {@inheritDoc} */
  @Override
  protected String getVarName(final Object expression, final IAppendable appendable) {
    if (expression instanceof JvmGenericType) {
      return "_" + CheckConstants.IT; // TODO find the right reference (using an injected CheckGeneratorExtensions.thisParameterName)
    }
    return super.getVarName(expression, appendable);
  }

  @Override
  // CHECKSTYLE:OFF
  protected void _toJavaStatement(final XAbstractFeatureCall expr, final IAppendable b, final boolean isReferenced) {
    if (expr.getFeature().eContainer() instanceof FormalParameter) {
      // TODO check if correct
      // nothing to do
    } else {
      super._toJavaStatement(expr, b, isReferenced);
    }
    // CHECKSTYLE:ON
  }

  @Override
  // CHECKSTYLE:OFF
  protected void _toJavaExpression(final XAbstractFeatureCall expr, final IAppendable b) {
    // CHECKSTYLE:ON
    if (expr.getFeature().eContainer() instanceof FormalParameter) {
      // TODO check if correct
      Check check = EcoreUtil2.getContainerOfType(expr.getFeature(), Check.class);
      b.append("get").append(Strings.toFirstUpper(check.getName())).append("(").append("_" + CheckConstants.IT).append(")").append(".get").append(Strings.toFirstUpper(expr.getFeature().getSimpleName())).append("()");
    } else {
      super._toJavaExpression(expr, b);
    }
  }

  /** {@inheritDoc} */
  // CHECKSTYLE:OFF
  protected void _toJavaStatement(final XGuardExpression expr, final IAppendable b, final boolean isReferenced) {
    // CHECKSTYLE:ON
    // if (isReferenced)
    // declareLocalVariable(expr, b);
    internalToJavaStatement(expr.getGuard(), b, true);
    b.append("\nif (!(");
    internalToJavaExpression(expr.getGuard(), b);
    b.append(")) {").increaseIndentation();
    b.append("\nreturn; ");
    b.decreaseIndentation().append("\n}");
  }

  /** {@inheritDoc} */
  // CHECKSTYLE:OFF
  protected void _toJavaExpression(final XGuardExpression expr, final IAppendable b) {
    // CHECKSTYLE:ON
    b.append(getVarName(expr, b));
  }

  /** {@inheritDoc} */
  // CHECKSTYLE:OFF
  protected void _toJavaStatement(final XIssueExpression expr, final IAppendable b, final boolean isReferenced) { // NOPMD NPath complexity
    // CHECKSTYLE:ON
    XExpression markerObject = expr.getMarkerObject();
    for (XExpression param : expr.getMessageParameters()) {
      internalToJavaStatement(param, b, true);
      b.append("\n");
    }

    if (markerObject != null) {
      internalToJavaStatement(markerObject, b, true);
      b.append("\n");
    }

    XExpression markerIndex = expr.getMarkerIndex();
    if (markerIndex != null) {
      internalToJavaStatement(markerIndex, b, true);
      b.append("\n");
    }

    b.append("final ");
    b.append(getTypeReferences().findDeclaredType(EObject.class, expr)).append(" ");
    String variable = b.declareVariable(expr, "ctx");
    b.append(variable).append(" = ");
    if (markerObject != null) {
      internalToJavaExpression(markerObject, b);
    } else {
      b.append("_" + CheckConstants.IT);
    }
    b.append(";\n");

    for (XExpression data : expr.getIssueData()) {
      internalToJavaStatement(data, b, true);
      b.append("\n");
    }

    b.append("get").append(StringExtensions.toFirstUpper(generatorExtensions.issuedCheck(expr).getName())).append("(").append("_" + CheckConstants.IT).append(")");
    b.append(".accept(");
    if (!expr.getMessageParameters().isEmpty()) {
      b.append("new Object[] { ");
      for (XExpression param : expr.getMessageParameters()) {
        internalToJavaExpression(param, b);
        b.append(", ");
      }
      b.append("}, ");
    }
    b.append(variable);

    b.append(", ");
    EStructuralFeature markerFeature = expr.getMarkerFeature();
    if (markerFeature != null) {
      b.append(findEPackageInterfaceType(markerFeature, expr));
      b.append(".eINSTANCE.get").append(markerFeature.getEContainingClass().getName()).append("_").append(Strings.toFirstUpper(markerFeature.getName())).append("()");
    } else {
      b.append("null");
    }

    b.append(", ");
    if (markerIndex != null) {
      internalToJavaExpression(markerIndex, b);
    } else {
      b.append(getTypeReferences().findDeclaredType(ValidationMessageAcceptor.class, expr)).append(".INSIGNIFICANT_INDEX");
    }

    // issue codes
    b.append(", ");
    b.append(generatorExtensions.qualifiedIssueCodeName(expr));

    // issue data
    for (XExpression data : expr.getIssueData()) {
      b.append(", ");
      internalToJavaExpression(data, b);
    }

    b.append(");\n");
  }

  /** {@inheritDoc} */
  // CHECKSTYLE:OFF
  protected JvmType findEPackageInterfaceType(final ENamedElement element, final EObject context) {
    // CHECKSTYLE:ON
    EPackage ePackage = EcoreUtil2.getContainerOfType(element, EPackage.class);
    return getTypeReferences().findDeclaredType(ePackage.getClass().getInterfaces()[0], context);
  }

  /** {@inheritDoc} */
  // CHECKSTYLE:OFF
  protected void _toJavaExpression(final XIssueExpression expr, final IAppendable b) {
    // CHECKSTYLE:ON
    b.append(getVarName(expr, b));
  }

}

/* Copyright (c) Avaloq License AG */