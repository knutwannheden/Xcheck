/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.jvmmodel
 
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import com.avaloq.tools.dslsdk.check.check.CheckCatalog

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class CheckJvmModelInferrer extends AbstractModelInferrer {

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	def dispatch void infer(CheckCatalog element, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		
   		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
   		// An example based on the initial hellow world example could look like this:
   		
//   		acceptor.accept(element.toClass("my.company.greeting.MyGreetings") [
//   			for (greeting : element.greetings) {
//   				members += greeting.toMethod(greeting.name, greeting.newTypeRef(typeof(String))) [
//   					it.body ['''
//   						return "Hello «greeting.name»";
//   					''']
//   				]
//   			}
//   		])
   	}

//  def dispatch Iterable<JvmDeclaredType> transform(LabelledObject model) {
//      emptyList
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(FormalParameter model) {
//    emptyList
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(Check check) {
//    check.contexts.map(e|transform(e)).flatten
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(CheckCatalog model) {
//    model.categories.map(e|transform(e)).flatten
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(Category category) {
//    category.checks.map(e|transform(e)).flatten
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(Context context) {
//    val block = context.constraint as XBlockExpression
//    //var x = block.expressions.map(e|if (e instanceof XIssueExpression) transform(e as XIssueExpression)).flatten
////    val issues = block.expressions.filter(typeof(XIssueExpression)) as Iterable<XIssueExpression>
//    val issues = EcoreUtil2::eAllOfType(block, typeof(XIssueExpression))
//    val result = issues.map(e|transformIssue(e))
//    val s = result.size
//    emptyList
//  }
//
//  def transformIssue(XIssueExpression e) {
//    if (e.markerObject instanceof JvmGenericType) {
//      val g = e.markerObject as JvmGenericType
//    }
//    null
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(XIssueExpression expression) {
//    val jvmClass = typesFactory.createJvmGenericType
//
//
//
//    if (expression.markerObject != null && expression.markerFeature != null) {
//
//    }
//
//    newArrayList(jvmClass as JvmDeclaredType)
//  }
//
//  def void transformFeature(JvmGenericType type, EStructuralFeature feature) {
//    null
//  }
//
//  def dispatch void transform(Check check, JvmGenericType type) {
//    check.formalParameters.map(e | transform(e)).flatten
//
//    val jvmSetter = typesFactory.createJvmOperation
//    jvmSetter.simpleName = "set" + property.name.toFirstUpper
//
//    val parameter = typesFactory.createJvmFormalParameter
//    parameter.name = property.name.toFirstUpper
//    parameter.parameterType = cloneWithProxies(property.type)
//    jvmSetter.makePublic
//    jvmSetter.parameters += parameter
//    type.members += jvmSetter
//    property.associatePrimary(jvmSetter)
//  }
//
//  def dispatch Iterable<JvmDeclaredType> transform(FormalParameter parameter) {
//
//  }

}
