/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.checkcfg.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredParameter;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;


/**
 * Configures the Check Configuration scope provider.
 */
@SuppressWarnings("restriction")
public class CheckCfgScopeProvider extends XbaseScopeProvider {

  private static final Function<Check, String> CHECK_TO_STRING_NAME_FUNCTION = new Function<Check, String>() {
    public String apply(final Check from) {
      return from.getName();
    }
  };
  private static final Function<FormalParameter, String> PARAMETER_TO_STRING_NAME_FUNCTION = new Function<FormalParameter, String>() {
    public String apply(final FormalParameter from) {
      return from.getParameter().getName();
    }
  };

  /**
   * Gets a collection of {@link IEObjectDescription object descriptions} of type T. The names of
   * returned object descriptions are addressed using given name function.
   * 
   * @param <T>
   *          the generic type
   * @param elements
   *          the elements
   * @param nameFunction
   *          the name function
   * @return the objects
   */
  private <T extends EObject> Iterable<IEObjectDescription> getObjects(final Iterable<T> elements, final Function<T, String> nameFunction) {
    Iterable<IEObjectDescription> transform = Iterables.transform(elements, new Function<T, IEObjectDescription>() {
      public IEObjectDescription apply(final T instance) {
        QualifiedName qualifiedName = QualifiedName.create(nameFunction.apply(instance));
        return EObjectDescription.create(qualifiedName, instance);
      }
    });
    return transform;
  }

  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (reference == CheckcfgPackage.Literals.CONFIGURED_CHECK__CHECK) {
      // Note that context object can be either a configured check (if 'optional' keyword has been provided
      // so that a new instance is created and the configured catalog does not contain any configured checks
      // yet) or a configured catalog (in all other cases)

      final ConfiguredCatalog configuredCatalog = (ConfiguredCatalog) ((context instanceof ConfiguredCatalog) ? context
          : EcoreUtil2.getContainerOfType(context, ConfiguredCatalog.class));
      if (configuredCatalog == null || configuredCatalog.getCatalog() == null) {
        return IScope.NULLSCOPE;
      }
      CheckCatalog catalog = configuredCatalog.getCatalog();
      if (catalog.eIsProxy()) { // TODO check if proxy resolution can (or should) be omitted
        catalog = (CheckCatalog) EcoreUtil.resolve(catalog, configuredCatalog);
      }
      return new SimpleScope(getObjects(catalog.getAllChecks(), CHECK_TO_STRING_NAME_FUNCTION));
    } else if (reference == CheckcfgPackage.Literals.CONFIGURED_PARAMETER__PARAMETER) {
      // Note that context object can be either a configured check or a configured parameter (same reasoning
      // as above)

      final ConfiguredCheck configuredCheck = context instanceof ConfiguredParameter ? (ConfiguredCheck) context.eContainer()
          : EcoreUtil2.getContainerOfType(context, ConfiguredCheck.class);
      if (configuredCheck == null) {
        return IScope.NULLSCOPE;
      }
      Check check = configuredCheck.getCheck();
      if (check.eIsProxy()) { // TODO check if proxy resolution can (or should) be omitted
        check = (Check) EcoreUtil.resolve(check, context);
      }
      return new SimpleScope(getObjects(check.getFormalParameters(), PARAMETER_TO_STRING_NAME_FUNCTION));
    }
    return super.getScope(context, reference);
  }

}

/* Copyright (c) Avaloq License AG */