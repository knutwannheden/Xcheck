/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

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

