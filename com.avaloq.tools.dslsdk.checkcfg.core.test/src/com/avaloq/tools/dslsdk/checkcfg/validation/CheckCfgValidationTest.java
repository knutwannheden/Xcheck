/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.checkcfg.validation;

import junit.framework.TestCase;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.avaloq.tools.dslsdk.checkcfg.CheckCfgUiInjectorProvider;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage;
import com.avaloq.tools.dslsdk.checkcfg.util.CheckCfgModelUtil;
import com.google.inject.Inject;


/**
 * Performs validations on Check Configuration models.
 */
@InjectWith(CheckCfgUiInjectorProvider.class)
@RunWith(XtextRunner.class)
public class CheckCfgValidationTest extends TestCase {

  @Inject
  private ValidationTestHelper helper;

  @Inject
  private ParseHelper<CheckConfiguration> parser;

  @Inject
  private CheckCfgModelUtil modelUtil;

  /**
   * Tests {@link CheckCfgJavaValidator#checkDisabledCheckIsNotConfigured(com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck)}.
   * <p>
   * A warning is raised if a disabled check has configured parameters.
   * </p>
   * 
   * @throws Exception
   *           if a problem occurred parsing the test model
   */
  @Test
  public void testDisabledCheckIsNotConfigured() throws Exception { // NOPMD
    CheckConfiguration model = parser.parse(modelUtil.basicModelWithDisabledTest() + " (val = 0)");
    helper.assertWarning(model, CheckcfgPackage.Literals.CONFIGURED_CHECK, IssueCodes.DISABLED_CHECK_NOT_CONFIGURED);
  }

}

/* Copyright (c) Avaloq License AG */