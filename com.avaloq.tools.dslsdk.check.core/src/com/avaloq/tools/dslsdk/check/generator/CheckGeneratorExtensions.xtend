/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.generator

import com.avaloq.tools.dslsdk.check.CheckConstants
import com.avaloq.tools.dslsdk.check.check.Check
import com.avaloq.tools.dslsdk.check.check.CheckCatalog
import com.avaloq.tools.dslsdk.check.check.Context
import com.avaloq.tools.dslsdk.check.check.FormalParameter
import com.avaloq.tools.dslsdk.check.check.Implementation
import com.avaloq.tools.dslsdk.check.check.SeverityKind
import com.avaloq.tools.dslsdk.check.check.TriggerKind
import com.avaloq.tools.dslsdk.check.check.XGuardExpression
import com.avaloq.tools.dslsdk.check.check.XIssueExpression
import com.google.inject.Inject
import java.util.Collections
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.validation.CheckType
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XCasePart
import org.eclipse.xtext.xbase.XDoWhileExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XForLoopExpression
import org.eclipse.xtext.xbase.XIfExpression
import org.eclipse.xtext.xbase.XInstanceOfExpression
import org.eclipse.xtext.xbase.XReturnExpression
import org.eclipse.xtext.xbase.XSwitchExpression
import org.eclipse.xtext.xbase.XThrowExpression
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter


class CheckGeneratorExtensions {
  
  @Inject
  XbaseInterpreter interpreter

  def shortName(JvmTypeReference r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendType(r.type, builder)
    builder.toString
  }

  def catalogClassName(CheckCatalog c) {
    c.name + "CheckCatalog"
  }

  def validatorFileName(CheckCatalog c) {
    c.packageName.folderName + "/" + c.validatorClassName() + ".java"
  }

  def catalogFileName(CheckCatalog c) {
    c.packageName.folderName + "/" + c.catalogClassName() + ".java"
  }
  
  def <T extends EObject> T parent(EObject object, Class<T> c) {
    EcoreUtil2::getContainerOfType(object, c)
  }

  def String preferenceInitializerClassName(CheckCatalog c) {
    c.name + "PreferenceInitializer"
  }

  def String issueCodesClassName(CheckCatalog c) {
    c.name + "IssueCodes"
  }
  
  def String qualifiedPreferenceInitializerClassName(CheckCatalog c) {
    c.packageName + '.' + c.name + "PreferenceInitializer"
  }
  
  def String quickfixClassName(CheckCatalog c) {
    c.name + "QuickfixProvider"
  }

  def String qualifiedPreferenceInitializerFileName(CheckCatalog c) {
    c.packageName.folderName + "/" + c.preferenceInitializerClassName + ".java"
  }
  
  def String qualifiedIssueCodesFileName(CheckCatalog c) {
    c.packageName.folderName + "/" + c.issueCodesClassName + ".java"
  }
  
  def String qualifiedQuickfixClassName(CheckCatalog c) {
    c.packageName + '.' + c.name + "QuickfixProvider"
  }

  def String qualifiedQuickfixFileName(CheckCatalog c) {
    c.packageName.folderName + "/" + c.quickfixClassName + ".java"
  }
  
  def qualifiedValidatorClassName(CheckCatalog c) {
    c.packageName + '.' + c.name + "CheckImpl"
  }

  def validatorClassName(CheckCatalog c) {
    c.name+"CheckImpl"
  }

  def dispatch String qualifiedIssueCodeName(XIssueExpression i) {
    val result = issueCodeName(i)
    if (result == null) {
      null
    } else {
      i.parent(typeof(CheckCatalog)).issueCodesClassName + '.' + result
    }
  }

  def dispatch String qualifiedIssueCodeName(Context c) {
    c.parent(typeof(CheckCatalog)).issueCodesClassName + '.' + issueCodeName(c)
  }
  
  def dispatch String issueCodeName(Context c) {
    var String result
    if (c.eContainer instanceof Check) {
      val check = c.eContainer as Check
      result = 
        check.name.splitCamelCase.toUpperCase + '_' + 
        c.contextType.simpleName.toUpperCase + '_' +
        check.contexts.indexOf(c)
    }
    result
  }
  
  def dispatch String issueCodeName(XIssueExpression i) {
    if (i.issueCode != null) {
      i.issueCode.splitCamelCase.toUpperCase
    } else {
      val context = i.parent(typeof(Context)) 
      if (context != null) {
        issueCodeName(context)
      } else {
        null
      }
    }
  }
  
  /* Converts a string such as "AbcDef" to "ABC_DEF". */
  def String splitCamelCase(String s) {
    s.replaceAll(
      String::format("%s|%s|%s",
        "(?<=[A-Z])(?=[A-Z][a-z])",
        "(?<=[^A-Z])(?=[A-Z])",
        "(?<=[A-Za-z])(?=[^A-Za-z])"
      ),
      "_"
    )
  }

  def folderName(String javaPackageName) {
    if(javaPackageName != null) javaPackageName.replace('.', '/') else ""
  }

  def methodName(Context context) {
    (switch container: context.eContainer {
      Check: container.name
      Implementation: container.name
    } + context.contextType.simpleName).toFirstLower
  }

  def thisParameterName(Context context) {
    if(context.it!=null) "_" + CheckConstants::IT/*context.thisName*/ else "_" + CheckConstants::IT  //TODO see compiler.getVarName()!
  }


  def isInterface(JvmTypeReference typeRef) {
    (typeRef.type as JvmGenericType).isInterface
  }

  def checkType(Context context) {
    val kind = if (context.eContainer instanceof Check) {
       (context.eContainer as Check).kind
    } else {
      TriggerKind::FAST  //TODO handle the case of independent check implementations
    }

    return "CheckType."+switch (kind) {
      case TriggerKind::EXPENSIVE : CheckType::EXPENSIVE
      case TriggerKind::NORMAL: CheckType::NORMAL
      case TriggerKind::FAST: CheckType::FAST
      }.toString
  }

  def issues(Check check) {
    check.contexts.map(c|c.issues).flatten
  }
  
  def issues(Context context) {
    if (context.constraint == null) <XIssueExpression>emptyList else context.constraint.issues
  }

  def issuedChecks(Context context) {
	  issues(context).map(i|i.issuedCheck)
  }

  def issuedCheck (XIssueExpression expression) {
    if (expression.check != null) {
      expression.check
    } else {
      val containerCheck = EcoreUtil2::getContainerOfType(expression, typeof(Check))
      if (containerCheck != null) {
        containerCheck
        //TODO we obviously need a validation in the language so that there is always a value here!
      }
    }
  }

  // TODO: there are too many casts to Iterable<Check>, it seems there is a bug in Xtend wrt. the returned type of flatten

  def dispatch issues (XExpression expression) {
    <XIssueExpression>emptyList as Iterable<XIssueExpression>
  }


  def dispatch issues (XBlockExpression expression) {
    expression.expressions.map(x |x.issues).flatten as Iterable<XIssueExpression>
  }


  def dispatch issues (XIssueExpression expression) {
  	Collections::singletonList(expression)
  }


  def dispatch issues (XIfExpression expression)  {
    newLinkedList(
      if (expression.^if == null) <XIssueExpression>emptyList else expression.^if.issues,
      if (expression.^then == null) <XIssueExpression>emptyList else expression.^then.issues,
      if (expression.^else == null) <XIssueExpression>emptyList else expression.^else.issues
    ).flatten as Iterable<XIssueExpression>
  }

  def dispatch issues (XDoWhileExpression expression)  {
    newLinkedList(
      if (expression.^predicate == null) <XIssueExpression>emptyList else expression.predicate.issues,
      if (expression.^body == null) <XIssueExpression>emptyList else expression.body.issues
    ).flatten as Iterable<XIssueExpression>
  }


  def dispatch issues (XForLoopExpression expression)  {
    newLinkedList(
      if (expression.forExpression == null) <XIssueExpression>emptyList else expression.forExpression.issues,
      if (expression.eachExpression == null) <XIssueExpression>emptyList else expression.eachExpression.issues
    ).flatten as Iterable<XIssueExpression>
  }


  def dispatch issues (XGuardExpression expression)  {
    if (expression.guard == null) <XIssueExpression>emptyList else expression.guard.issues as Iterable<XIssueExpression>
  }


  def dispatch issues (XInstanceOfExpression expression)  {
    if (expression.expression == null) <XIssueExpression>emptyList else expression.expression.issues as Iterable<XIssueExpression>
  }

  def dispatch issues (XReturnExpression expression)  {
    if (expression.expression == null) <XIssueExpression>emptyList else expression.expression.issues as Iterable<XIssueExpression>
  }

  def dispatch issues(XSwitchExpression expression)  {
    newLinkedList(
      if (expression.^switch == null) <XIssueExpression>emptyList else expression.^switch.issues,
      if (expression.cases   == null) <XIssueExpression>emptyList else expression.cases.map(c|c.issues).flatten
    ).flatten as Iterable<XIssueExpression>
  }

  // no dispatch here: XCasePart is not an XExpression...
  def issues (XCasePart casePart) {
    newLinkedList (
      if (casePart.^case == null) <XIssueExpression>emptyList else  casePart.^case.issues,
      if (casePart.^then == null) <XIssueExpression>emptyList else  casePart.then.issues
    ).flatten as Iterable<XIssueExpression>
  }

  def dispatch issues(XThrowExpression expression)  {
    if (expression.expression == null) <XIssueExpression>emptyList else expression.expression.issues as Iterable<XIssueExpression>
  }

  def dispatch issues(XVariableDeclaration expression)  {
    if (expression.right == null) <XIssueExpression>emptyList else expression.right.issues as Iterable<XIssueExpression>
  }

  def dispatch issues(XTryCatchFinallyExpression expression)  {
    if (expression.expression == null) <XIssueExpression>emptyList else expression.expression.issues as Iterable<XIssueExpression>
  }

  def dispatch String key(Check check) {
    val catalog = check.parent(typeof(CheckCatalog))
    catalog.name + '.' + check.name
  }

  def dispatch String key(FormalParameter param) {
    val catalog = param.parent(typeof(CheckCatalog))
    val check = param.eContainer as Check
    catalog.name + '.' + check.name + '.' + param.parameter.name
  }
  
  def String severityKey(Check check) {
    check.key.toUpperCase + '$SEVERITY'
  }
  
  def String parameterKey(FormalParameter param) {
    param.key.toUpperCase + '$PARAMETER'
  }
  
  def severityValue(String severityName) {
    // enum names are lower case
    SeverityKind::getByName(severityName.toLowerCase).value
  }
  
  /* Get the name of the getter in the configuration store */
  def String configurationStoreGetterName(FormalParameter parameter) {
  	preferenceServiceLookupOperation(parameter)
  }
  
  /* Gets typed operation names for getting values from Eclipse preferences. */
  def String preferenceServiceLookupOperation(FormalParameter parameter) {
    val result = interpreter.evaluate(parameter.defaultValue).result
    switch result {
      Boolean : "getBoolean"
      Integer : "getInt"
      default : "getString" 
    }
  }
  
  /* Gets typed operation names for putting values in Eclipse preferences. */
  def String preferenceServicePutOperation(FormalParameter parameter) {
    val result = interpreter.evaluate(parameter.defaultValue).result
    switch result {
      Boolean : "putBoolean"
      Integer : "putInt"
      default : "put" 
    }
  }
  
  /* 
   * Gets the IProject which is associated with a given EObject or <code>null</code>
   * if none could be determined.
   */
  def IProject projectForObject(EObject object) {
    val res = object.eResource
    if (res.URI.platform) {
      val IFile file = ResourcesPlugin::workspace.root.findMember(res.URI.toPlatformString(true)) as IFile
      return file.project
    }
    return null
  }
  
  /* Gets the name of the project in which given object is contained. */
  def String bundleName(EObject object) {
    val proj = object.projectForObject
    if (proj != null) {
      return proj.name
    }
    return null
  }
  
}

/* Copyright (c) Avaloq License AG */