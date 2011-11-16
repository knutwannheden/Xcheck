/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

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