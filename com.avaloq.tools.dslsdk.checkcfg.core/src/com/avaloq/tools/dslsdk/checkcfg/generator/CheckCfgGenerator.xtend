/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.checkcfg.generator

import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class CheckCfgGenerator implements IGenerator {
	
	@Inject extension GeneratorExtensions generatorExtensions
  
  @Inject
  XbaseInterpreter interpreter
  
  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    if (fsa instanceof AbstractFileSystemAccess) {
      (fsa as AbstractFileSystemAccess).setOutputPath(outputPath)
    }
    for (configuration:resource.allContentsIterable.filter(typeof(CheckConfiguration))) {
      fsa.generateFile(configuration.fileName, configuration.compile)
    }
  }
  
  def compile(CheckConfiguration config) {
    val allChecks = config.catalogConfigurations.map(cat|cat.checkConfigurations).flatten
    val allParams = allChecks.map(c|c.parameterConfigurations).flatten
    ''' 
    # Configured severities
    «FOR c:allChecks»
    «c.key»=«c.severityValue»
    «ENDFOR»
    
    # Configured parameters
    «FOR p:allParams»
    «val value = interpreter.evaluate(p.newValue).result»
    «var result = switch value {String : "\"" + value + "\"" default : value}»
    «p.key»=«result»
    «ENDFOR»
    '''
  }
}
