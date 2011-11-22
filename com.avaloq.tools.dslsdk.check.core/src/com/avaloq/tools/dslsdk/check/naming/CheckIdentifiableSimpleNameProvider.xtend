/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.naming

import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import com.avaloq.tools.dslsdk.check.CheckConstants

class CheckIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {

	def dispatch getSimpleName(JvmType element) {
		return CheckConstants::IT;
	}

	def dispatch getSimpleName(JvmIdentifiableElement element) {
		return super.getSimpleName(element);
	}

}

/* Copyright (c) Avaloq License AG */