/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.core.test

import com.avaloq.tools.dslsdk.check.CheckUiInjectorProvider
import com.avaloq.tools.dslsdk.check.check.Check
import com.avaloq.tools.dslsdk.check.check.CheckCatalog
import com.avaloq.tools.dslsdk.check.check.Implementation
import com.avaloq.tools.dslsdk.check.check.XIssueExpression
import com.avaloq.tools.dslsdk.check.core.test.util.CheckTestUtil
import com.google.common.collect.Lists
import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipse.xtext.ui.junit.util.IResourcesSetupUtil

@InjectWith(typeof(CheckUiInjectorProvider))
@RunWith(typeof(XtextRunner))
class CheckScopingTest extends AbstractCheckTestCase {

  @Inject ParseHelper<CheckCatalog> parser

  @Inject CheckTestUtil util

  /*
   * The model names are deliberately not including file extension, the actual resources
   * are also missing them. The reason for this is that if current development instance of
   * Eclipse has the Check runtime plugins installed, code will automatically be generated
   * for those resources. In order to avoid that the file extensions have been ommitted.
   */
  def List<String> getRequiredSourceFileNames() {
    Lists::newArrayList("CommonChecks", "SampleChecks")
  }

  def void initializeTestProject() {
    // a project must be created
    val p = getOrCreatePluginProject
    // sources are copied into the project and then built by the Xtext builder
    addSourcesToWorkspace(typeof(CheckScopingTest), requiredSourceFileNames)

    // wait for build to finish, otherwise included catalog may not be resolvable
    IResourcesSetupUtil::waitForAutoBuild
  }

  /*
   * Tests that Catalogs can be included in one another.
   */
  @Test
  def void testResolutionOfIncludedCatalog() {
    initializeTestProject

    // test that our model is available
    val sampleCheckModel = getModel("SampleChecks") as CheckCatalog

    // test that the included catalog exists and is resolved
    val includedCategory = sampleCheckModel.includedCatalogs
    assertNotNull("The included Category is not null", includedCategory)
    assertFalse("The included Category could be resolved", includedCategory.eIsProxy)
  }

  /*
   * Tests that a catalog may not reference checks (in implementations, 'def') which are
   * neither local nor included.
   */
  @Test
  def void testIllegalDirectionOfReference() {
    initializeTestProject

    // test that our model is available
    val model = getModel("CommonChecks") as CheckCatalog

    val illegalRefImpl = util.getFirstInstanceOf(model, typeof(Implementation))
    val issueExpr      = util.getFirstInstanceOf(illegalRefImpl, typeof(XIssueExpression))

    assertTrue("Referenced check cannot be resolved", issueExpr.check.eIsProxy)
    assertNull("Referenced check name is null", issueExpr.check.name)
  }

  /*
   * Tests that a check may be documented using a ML_COMMENT. The documentation is inferred
   * in the description field of a check.
   */
  @Test
  def void testCheckDescriptionIsInferred() {
    initializeTestProject
    val check = util.getFirstInstanceOf(getModel("CommonChecks"), typeof(Check))
    assertEquals("Referenced check cannot be resolved", "This check is javadoc-like commented.", check.description)
  }
}