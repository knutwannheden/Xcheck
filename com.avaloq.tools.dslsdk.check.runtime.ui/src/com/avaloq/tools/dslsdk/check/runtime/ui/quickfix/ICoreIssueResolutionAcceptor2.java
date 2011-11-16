/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.ui.quickfix;

import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreIssueResolutionAcceptor;
import com.google.inject.ImplementedBy;


/**
 * This is a hack: interface only added in order to define the ImplementedBy binding.
 * This plug-in should probably define create an injector and define a module that declares
 * how instances of ICoreIssueResolutionAcceptor should be created.
 */
@ImplementedBy(CoreIssueResolutionAcceptor.class)
public interface ICoreIssueResolutionAcceptor2 extends ICoreIssueResolutionAcceptor {
  // Deliberately empty
}

/* Copyright (c) Avaloq License AG */