/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.core.test

import org.eclipse.xtext.junit4.*
import org.eclipse.xtext.junit4.util.*
import org.eclipse.xtext.resource.*

import org.junit.*
import org.junit.runner.*
import static org.junit.Assert.*

import com.google.inject.*

import com.avaloq.tools.dslsdk.check.*
import com.avaloq.tools.dslsdk.check.check.*

import com.avaloq.tools.dslsdk.check.core.test.util.*


@InjectWith(typeof(CheckUiInjectorProvider))
@RunWith(typeof(XtextRunner))
class BasicModelTest extends AbstractCheckTestCase {

	@Inject
  ParseHelper<CheckCatalog> parser

  @Inject
  CheckTestUtil util

  @Inject
  CheckModelUtil modelUtil

  /**
   * Tests that an empty model based on EPackage model reference can be created.
   */
  @Test
  def void testCreateEmptyModelWithPackageReference() {
    val model = parser.parse("package p catalog c {}")
    assertNotNull("CheckCatalog with EPackage reference successfully created", model);
  }

  /**
   * Tests that an empty model based on model reference by Xtext Grammar can be created.
   */
  @Test
  def void testCreateEmptyModelWithGrammarReference() {
    val model = parser.parse("package p catalog c for grammar com.avaloq.tools.dslsdk.check.Check {}")
    assertNotNull("CheckCatalog with Grammar reference successfully created", model);
  }

  /* Tests that an XIssueExpression takes message parameters. */
  @Test
  def void testXIssueExpressionMessageParameters() {
    val model = parser.parse(modelUtil.modelWithContext + "issue A on it  bind \"mp0\", \"mp1\"")
    assertEquals(2, util.getFirstInstanceOf(model, typeof(XIssueExpression)).messageParameters.size)
  }

  /* Tests that an XIssueExpression takes message parameters when a marker feature has been specified. */
  @Test
  def void testXIssueExpressionWithMarkerFeatureMessageParameters() {
    val model = parser.parse(modelUtil.modelWithContext + "issue A on x#name bind \"mp0\", \"mp1\"")
    assertEquals(2, util.getFirstInstanceOf(model, typeof(XIssueExpression)).messageParameters.size)
  }

  /* Tests that Checks documented with ML_COMMENTs have an inferred description field. */
  @Test
  @Ignore("Fails because CheckImplCustom uses the null resource description provider to get the document provider")
  def void testInferingOfDescription() {
    val check = util.getFirstInstanceOf(parser.parse(modelUtil.modelWithCheck), typeof(Check))
    assertEquals("No documentation.", check.description)
  }

  /* Tests that multi- and single-line comments are parsed in a model. */
  @Test
  def void testCommentsInModelParse() {
    val model = parser.parse(modelUtil.modelWithComments)
    assertFalse("Syntax errors not expected but occurred", (model.eResource as XtextResource).parseResult.hasSyntaxErrors)
  }
}