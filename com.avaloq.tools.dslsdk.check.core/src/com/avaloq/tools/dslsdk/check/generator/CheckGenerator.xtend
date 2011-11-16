/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.generator

import com.avaloq.tools.dslsdk.check.check.Check
import com.avaloq.tools.dslsdk.check.check.CheckCatalog
import com.avaloq.tools.dslsdk.check.check.Context
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class CheckGenerator implements IGenerator {

  @Inject 
  extension CheckGeneratorExtensions generatorExtensions

  @Inject 
  CheckCompiler checkCompiler

  /* Used for evaluating Xbase expressions. */
  @Inject
  XbaseInterpreter interpreter

  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
    for (catalog:resource.allContentsIterable.filter(typeof(CheckCatalog))) {
      fsa.generateFile(catalog.validatorFileName, catalog.compileValidator)
      fsa.generateFile(catalog.catalogFileName, catalog.compileCatalog)
      fsa.generateFile(catalog.qualifiedIssueCodesFileName, catalog.compileIssueCodes)
      fsa.generateFile(catalog.qualifiedPreferenceInitializerFileName, catalog.compilePreferenceInitializer)
    }
  }

  /*
   *    Validator Compiler
   */
  def compileValidator (CheckCatalog c) '''
    «val importManager = new ImportManager(true)»
    «/* first evaluate the body in order to collect the used types for the import section */
    val body = bodyValidator(c, importManager)»
    «IF !(c.packageName.isNullOrEmpty)»
    package «c.packageName»;

    «ENDIF»
    import org.eclipse.xtext.validation.Check;
    import org.eclipse.xtext.validation.CheckType;
    import com.avaloq.tools.dslsdk.check.runtime.issue.DefaultCheckImpl;
    
    import com.google.inject.Inject;

    «FOR i:importManager.imports»
    import «i»;
    «ENDFOR»

    «body»
  '''

  // TODO: we use a getter method for instances of nested catalog classes because of
  // a Guice instantiation problem
  def bodyValidator(CheckCatalog checkCatalog, ImportManager importManager) '''
  «checkCatalog.headerValidator»
  «var parentCheckImpl =
    if (checkCatalog.includedCatalogs != null) checkCatalog.includedCatalogs.validatorClassName
    else 'DefaultCheckImpl'»
  @SuppressWarnings("all")
  public class «checkCatalog.validatorClassName» extends «parentCheckImpl» {

    @Inject
    private «checkCatalog.catalogClassName» catalog;

    «val allChecks = checkCatalog.getAllChecks»
    «FOR check:allChecks»
    private «checkCatalog.catalogClassName».«check.name» «check.name.toFirstLower»;
    
    /** Gets the «checkCatalog.catalogClassName».«check.name» instance. */
    private «checkCatalog.catalogClassName».«check.name» get«check.name.toFirstUpper»(EObject context) {
      if («check.name.toFirstLower» == null) {
        «check.name.toFirstLower» = catalog.new «check.name»(getMessageAcceptor(), context);
      }
      return «check.name.toFirstLower»;
    }
    «ENDFOR»

    «FOR context:allChecks.map(c|c.contexts).flatten»
    «context(context, importManager)»
    «ENDFOR»
    «FOR implementation: checkCatalog.implementations»

    «context(implementation.context, importManager)»
    «ENDFOR»

  }
  '''

//TODO: we actually want one check per context type, which then call all check implementations!
//TODO: exception handling! (see the code generated for Valid, we must log the exceptions.)
//      «val optionalChecks = context.issuedChecks.filter(c|c.optional)»
//      «IF !optionalChecks.empty»
//      if (!(«FOR check:optionalChecks SEPARATOR " || "»«check.name.toFirstLower».isEnabled()«ENDFOR»)) return;
//      «ENDIF»

  def context(Context context, ImportManager importManager) '''
    «header(context)»
    @Check(«context.checkType»)
    public void «context.methodName»(«context.contextType.shortName(importManager)» «context.thisParameterName») {
      «checkCompiler.compile(context, importManager)»
    }
  '''


  /*
   *  Catalogue generator
   */
  def compileCatalog(CheckCatalog checkCatalog) '''
    «val importManager = new ImportManager(true)»
    «/* first evaluate the body in order to collect the used types for the import section */
    val body = bodyCatalog(checkCatalog, importManager)»
    «IF !(checkCatalog.packageName.isNullOrEmpty)»
    package «checkCatalog.packageName»;

    «ENDIF»
    import org.eclipse.core.runtime.Platform;
    import org.eclipse.osgi.util.NLS;
    import org.eclipse.emf.ecore.EObject;
    import org.eclipse.xtext.validation.ValidationMessageAcceptor;

    «FOR i:importManager.imports»
    import «i»;
    «ENDFOR»
    import com.avaloq.tools.dslsdk.check.runtime.issue.AbstractIssue;
    import com.avaloq.tools.dslsdk.check.runtime.issue.DefaultCheckCatalog;
    import com.avaloq.tools.dslsdk.check.runtime.issue.SeverityKind;

    import com.avaloq.tools.dslsdk.check.runtime.configuration.ICheckConfigurationStoreService;
    import com.google.inject.Inject;  

    «body»
  '''

  def bodyCatalog(CheckCatalog checkCatalog, ImportManager importManager) '''
    «checkCatalog.headerIssues»
    @SuppressWarnings("all")
    public class «checkCatalog.catalogClassName» extends DefaultCheckCatalog {
      
      @Inject
      protected ICheckConfigurationStoreService checkConfigurationStoreService; 

      «FOR check:checkCatalog.getAllChecks»

      «issue(check, importManager)»
      «ENDFOR»

    }
  '''

  def issue(Check check, ImportManager importManager) {
    val bundle = generatorExtensions.bundleName(check)
    val severityKey = generatorExtensions.severityKey(check)
    '''
    public class «check.name» extends AbstractIssue {
      
      /** Stores the context object for this check. */
      private final EObject context;

      public «check.name»(ValidationMessageAcceptor messageAcceptor, EObject context) {
        super(messageAcceptor);
        this.context = context;
      }

      «FOR parameter: check.formalParameters»
        «val operation   = generatorExtensions.configurationStoreGetterName(parameter)»
        «val parameterKey  = generatorExtensions.parameterKey(parameter)»
        «val value = interpreter.evaluate(parameter.defaultValue).result»
        «var result = switch value {String : "\"" + value + "\"" default : value}»
      /**
       * Gets the value for formal parameter <em>«parameter.parameter.name»</em>. The value returned is either
       * the default ({@code «value»}), as is set in the check definition, or the configured value, if
       * existing.
       * 
       * @return the value of this formal parameter
       */
      public «parameter.parameter.parameterType.shortName(importManager)» get«parameter.parameter.name.toFirstUpper»() {
        return checkConfigurationStoreService.getCheckConfigurationStore(context).«operation»("«bundle»", "«parameterKey»", «result»);
      } 
      
      «ENDFOR»
      /**
       * Gets the message associated with a violation of this check.
       *
       * @param bindings the message bindings
       * @return the message identifying a violation of this check
       */
      public String getMessage(Object... bindings) {
        return NLS.bind("«Strings::convertToJavaString(check.message)»", bindings);
      }

      /**
       * Gets the {@link SeverityKind severity kind} of check <em>«check.label»</em>. The severity kind returned
       * is either the default ({@code «check.defaultSeverity.name»}), as is set in the check definition, or the
       * configured value, if existing.
       * 
       * @return the severity kind of this check
       */
      public SeverityKind getSeverityKind() {
        final int result = checkConfigurationStoreService.getCheckConfigurationStore(context).getInt("«bundle»", "«severityKey»", «check.defaultSeverity.value»);
        if (SeverityKind.values().length > result) {
          return SeverityKind.values()[result];
        }
        return SeverityKind.values()[«check.defaultSeverity.value»]; // non-existing severity was configured, return default
      }
    }
    '''
  }


  /*
   * Headers
   */

   def header(Context context) '''
   /**
    *  «context.methodName».
    */
   '''

   def headerValidator(CheckCatalog catalog) '''
   /**
    *  Validator for «catalog.name».«IF catalog.includedCatalogs != null» Includes validations from its parent catalog.
    *
    * @see «catalog.includedCatalogs.validatorClassName»«ENDIF»
    */
   '''

  def headerIssues(CheckCatalog catalog) '''
   /**
    *  Issues for «catalog.name».
    */
   '''

   /*
    * Creates an IssueCodes file for a Check Catalog. Every Check Catalog will have its own file
    * of issue codes.
    */
  def compileIssueCodes(CheckCatalog catalog) {
    val allIssues  = catalog.allChecks.map(c|generatorExtensions.issues(c)).flatten // issues for all checks
    val issueNames = allIssues.map(i|generatorExtensions.issueCodeName(i)).toSet // unique issue code names
      
    '''
    «IF !(catalog.packageName.isNullOrEmpty)»
    package «catalog.packageName»;
    «ENDIF»
    
    /**
     * Issue codes which may be used to address validation issues (for instance in quickfixes).
     */
    @SuppressWarnings("all")
    public final class «catalog.issueCodesClassName» {
      
      // The prefix for all issue codes
      private static final String ISSUE_CODE_PREFIX = "«catalog.packageName».«catalog.issueCodesClassName».";
      
      «FOR name:issueNames»
      public static final String «name» = ISSUE_CODE_PREFIX + "«name.replaceAll("_", ".").toLowerCase»";
      «ENDFOR»
      
      private «catalog.issueCodesClassName»() {
        // Prevent instantiation.
      }
    }
    '''
  }
  
  /*
   * Creates contents for the generated preference initializer class. Defaults need to be created for
   * <ul>
   * <li>Check default severity value 
   * <li>Formal Parameter default value 
   * </ul>
   */
  def compilePreferenceInitializer(CheckCatalog catalog) {
    val allChecks = catalog.allChecks
    val allParams = allChecks.map(c|c.formalParameters).flatten
    
    '''
    «IF !(catalog.packageName.isNullOrEmpty)»
    package «catalog.packageName»;
    «ENDIF»
    
    import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
    import org.eclipse.core.runtime.preferences.IEclipsePreferences;
    import org.eclipse.core.runtime.preferences.InstanceScope;
    
    /**
     * Preference initializer for «catalog.name». Provides default values for configurable
     * properties.
     */
    @SuppressWarnings("all")
    public final class «catalog.preferenceInitializerClassName» extends AbstractPreferenceInitializer {
      
      private static final String RUNTIME_NODE_NAME = "«generatorExtensions.bundleName(catalog)»";
      
      /** Initialize defaults. */
      @Override
      public void initializeDefaultPreferences() {
        final IEclipsePreferences preferences = InstanceScope.INSTANCE.getNode(RUNTIME_NODE_NAME);
        
        // Check severities
        «FOR c:allChecks»
        preferences.putInt("«generatorExtensions.severityKey(c)»", «c.defaultSeverity.value»);
        «ENDFOR»
        
        // Formal parameters
        «FOR p:allParams»
        «val value = interpreter.evaluate(p.defaultValue).result»
        «val op = generatorExtensions.preferenceServicePutOperation(p)»
        «var result = switch value {String : "\"" + value + "\"" default : value}»
        preferences.«op»("«generatorExtensions.parameterKey(p)»", «result»);
        «ENDFOR»
      }
    
    }
    '''
  }
  
}

/* Copyright (c) Avaloq License AG */