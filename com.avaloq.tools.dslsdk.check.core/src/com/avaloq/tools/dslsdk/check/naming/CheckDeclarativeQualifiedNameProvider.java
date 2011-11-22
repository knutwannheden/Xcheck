/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.naming;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.google.inject.Inject;


/**
 * Configures qualified names for Check model elements.
 */
public class CheckDeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

  @Inject
  private IQualifiedNameConverter converter;

  /**
   * Creates a qualified name for a given JVM generic type.
   * 
   * @param type
   *          the type
   * @return the qualified name
   */
  QualifiedName qualifiedName(final JvmGenericType type) {
    return converter.toQualifiedName(type.getQualifiedName());
  }

  /**
   * Gets the qualified name for a {@link CheckCatalog Check Catalog}.
   * 
   * @param catalog
   *          the check catalog
   * @return the fully qualified name
   */
  QualifiedName qualifiedName(final CheckCatalog catalog) {
    return converter.toQualifiedName(catalog.getPackageName() + "." + catalog.getName());
  }

  /**
   * Creates a qualified name for a given Check instance. The first segment of the
   * qualified name corresponds to the parent catalog name.
   * 
   * @param check
   *          the check
   * @return the qualified name
   */
  QualifiedName qualifiedName(final Check check) {
    return converter.toQualifiedName(EcoreUtil2.getContainerOfType(check, CheckCatalog.class).getName() + "." + check.getName());
  }

}

