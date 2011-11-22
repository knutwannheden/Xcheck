/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.scoping

import com.avaloq.tools.dslsdk.check.CheckConstants
import com.avaloq.tools.dslsdk.check.check.Check
import com.avaloq.tools.dslsdk.check.check.CheckCatalog
import com.avaloq.tools.dslsdk.check.check.CheckPackage$Literals
import com.avaloq.tools.dslsdk.check.check.Context
import com.avaloq.tools.dslsdk.check.check.FormalParameter
import com.avaloq.tools.dslsdk.check.check.XIssueExpression
import com.google.common.base.Predicates
import com.google.common.collect.Collections2
import com.google.common.collect.Iterables
import com.google.inject.Inject
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.IGrammarAccess
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.access.IJvmTypeProvider$Factory
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IResourceServiceProvider$Registry
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.MapBasedScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider


class CheckScopeProvider extends XbaseScopeProvider {

  @Inject IJvmTypeProvider$Factory jvmTypeProviderFactory

  override IScope getScope(EObject context, EReference reference) {
    switch (context) {
      XIssueExpression:
        if (reference == CheckPackage$Literals::XISSUE_EXPRESSION__MARKER_FEATURE) {
          var jvmTypeRef =
            if (context.markerObject!= null)
              typeProvider.getType(context.markerObject)
            else
              EcoreUtil2::getContainerOfType(context, typeof(Context)).contextType;

          if (jvmTypeRef != null) {
            val eClass = context.classForJvmType(jvmTypeRef.type);
            if (eClass != null) {
              var features = eClass.EAllStructuralFeatures
              val descriptions = Collections2::transform(features,  [f | EObjectDescription::create(QualifiedName::create(f.name), f)])
              return MapBasedScope::createScope(IScope::NULLSCOPE, descriptions);
            } else {
              return IScope::NULLSCOPE;
            }
          } else  {
            return IScope::NULLSCOPE;
          }
        }
        else if (reference == CheckPackage$Literals::XISSUE_EXPRESSION__CHECK) {
          // Make sure that only Checks of the current model can be referenced, and if the CheckCatalog includes
          // another CheckCatalog, then use that parent as parent scope

          val catalog = EcoreUtil2::getContainerOfType(context, typeof(CheckCatalog))
          val checks  = catalog.allChecks.filter(c|c.name != null).toList

          val descriptions = Collections2::transform(checks, [c|EObjectDescription::create(QualifiedName::create(c.name), c)])
          // Determine the parent scope; use NULLSCOPE if no included CheckCatalog is defined
          val parentScope  = if (catalog.includedCatalogs != null) getScope(catalog.includedCatalogs, reference) else IScope::NULLSCOPE

          return MapBasedScope::createScope(parentScope, Iterables::filter(descriptions, Predicates::notNull));
        }
      CheckCatalog:
//        if (reference == CheckPackage$Literals::CHECK_CATALOG__EPACKAGES) {
//             // TODO scope by nsURI
//          val reg = EPackage$Registry::INSTANCE
//          val descriptions = Collections2::transform(Sets::newHashSet(reg.keySet),
//          	[u | try { val p = reg.getEPackage(u) return EObjectDescription::create(QualifiedName::create(p.name), p)} catch (Exception ex) {null} ]
//          )
//          return MapBasedScope::createScope(IScope::NULLSCOPE, Iterables::filter(descriptions, Predicates::notNull));
//        }
//        else
         if (reference == CheckPackage$Literals::CHECK_CATALOG__GRAMMAR) {
          val reg = IResourceServiceProvider$Registry::INSTANCE
          val descriptions = Collections2::transform(reg.extensionToFactoryMap.keySet,
          	[e | {
          	  val dummyUri = URI::createURI("foo:/foo." + e)
          	  try {
          	    val g = reg.getResourceServiceProvider(dummyUri).get(typeof(IGrammarAccess)).grammar
          	    return EObjectDescription::create(QualifiedName::create(g.name), g)
          	  } catch (Exception ex) {
				//TODO this is ugly!
          	  }
          	}]
          )
          return MapBasedScope::createScope(IScope::NULLSCOPE, Iterables::filter(descriptions, Predicates::notNull));
        }
    }
    return super.getScope(context, reference);
  }


  def EClass classForJvmType(EObject context, JvmType jvmType) {
    val packages = ePackagesForCheckCatalog(EcoreUtil2::getContainerOfType(context, typeof(CheckCatalog))).filter(e|e!=null)
    for (p: packages) {
      for (c: p.getEClassifiers) {
        if (c instanceof EClass && c.instanceClassName.equals(jvmType.qualifiedName))
          return c as EClass
      }
    }
    return null
  }

  /*
   * Gets a list of EPackage instances.
   */
  def ePackagesForCheckCatalog(CheckCatalog catalog) {
    val grammar= catalog.grammar

    if (grammar == null) {
      return Collections::EMPTY_LIST;
    } else  {
      // get all meta model declarations
      val declarations = Collections2::transform(grammar.metamodelDeclarations, [m|m.EPackage])
      // get all Ns URIs from the meta models
      val nsUris = Collections2::transform(declarations, [d|d.nsURI])

      // query the EPackage Registry for all registered EPackages given extracted Ns URIs
      val registeredPackages = Collections2::transform(nsUris, [u|EPackage$Registry::INSTANCE.getEPackage(u)]).filter(e|e!=null)

      if (registeredPackages.empty) {
        return declarations // This should only happen if an EPackage is referenced but it is not present
                            // in the EPackage registry
      } else {
        return registeredPackages
      }
    }
  }

  override IScope createLocalVarScope(IScope parent, LocalVariableScopeContext scopeContext) {
    switch context: scopeContext.context {
      // for a check, we must add the parameters in the context
      Check : {
        val descriptions = context.formalParameters.map(parameter | parameter.createIEObjectDescription())
        // but these parameter have no type!
        return MapBasedScope::createScope(
            super.createLocalVarScope(parent, scopeContext), descriptions);
      }

       Context : {
        val jvmType = context.contextType?.type
          // for a context, we create a local implicit value "it" if no thisName is given.
        if (jvmType != null){
          val thisVar = if (context.it != null) QualifiedName::create(context.it) else CheckConstants::QNIT;

          return new SimpleScope(super.createLocalVarScope(parent, scopeContext),
            Collections::singleton(EObjectDescription::^create(thisVar, jvmType))
          )
        }
      }
    }
    return super.createLocalVarScope(parent, scopeContext)
  }


  def createIEObjectDescription(FormalParameter formalParameter) {
    // make sure a type provider is configured in the resource set.
//    val jvmTypesProvider = jvmTypeProviderFactory.findOrCreateTypeProvider(formalParameter.eResource.resourceSet)
//    var jvmType = jvmTypesProvider.findTypeByName(switch (formalParameter) {
//      BooleanParameter: { "boolean"}
//      IntParameter: {"int"}
//      StringParameter: {"java.lang.String"}
//      //EnumParameter:
//    })
    EObjectDescription::^create(QualifiedName::^create(formalParameter.parameter.name), formalParameter.parameter, null)
    //TODO: this doesn't work: we expect to link onto the "formal parameter", not onto its type (but it works)

  }

//  def createIEObjectDescription(JvmFormalParameter jvmFormalParameter) {
//    EObjectDescription::^create(QualifiedName::^create(jvmFormalParameter.name), jvmFormalParameter, null);
//  }
  //todo: scoping for the check implementation (e.g. the parameters are not visible)

  //todo: scope the allowed imports!


}

/* Copyright (c) Avaloq License AG */