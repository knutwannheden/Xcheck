/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.checkcfg.generator

import com.avaloq.tools.dslsdk.check.generator.CheckGeneratorExtensions
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter
import com.google.inject.Inject


class GeneratorExtensions {
	
	@Inject extension CheckGeneratorExtensions checkGenerator
	
	def outputPath() {
	  '.settings'
	}
	
	def fileName(CheckConfiguration configuration) {
		'com.avaloq.tools.dslsdk.checkcfg.core.prefs'
	}
	
	def dispatch key(ConfiguredCheck check) {
	  check.check.severityKey
	}
	
	def dispatch key(ConfiguredParameter param) {
	  param.parameter.parameterKey
	}
	
	def severityValue(ConfiguredCheck check) {
	  if (check.severity.equals(com::avaloq::tools::dslsdk::checkcfg::checkcfg::SeverityKind::INHERIT)) {
	    return check.check.defaultSeverity.value
	  }
	  return check.severity.name.severityValue
	}
}