/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
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