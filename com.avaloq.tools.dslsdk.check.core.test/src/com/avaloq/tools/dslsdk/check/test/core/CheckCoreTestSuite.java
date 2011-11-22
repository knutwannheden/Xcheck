/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.test.core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.avaloq.tools.dslsdk.check.core.test.BasicModelTest;
import com.avaloq.tools.dslsdk.check.core.test.CheckScopingTest;
import com.avaloq.tools.dslsdk.check.validation.CheckJavaValidatorUtilTest;
import com.avaloq.tools.dslsdk.check.validation.CheckValidationTest;


/**
 * Empty class serving only as holder for JUnit4 annotations.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({BasicModelTest.class, CheckScopingTest.class, CheckValidationTest.class, CheckJavaValidatorUtilTest.class})
public class CheckCoreTestSuite {

}

/* Copyright (c) Avaloq License AG */