/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.check.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;


/**
 * Implements custom behavior for Check Catalogs.
 */
public class CheckCatalogImplCustom extends CheckCatalogImpl {

  @Override
  public EList<Check> getAllChecks() {
    final EList<Check> result = new BasicEList<Check>();
    result.addAll(Lists.newArrayList(Iterables.concat(this.getChecks(), Iterables.concat(Iterables.transform(this.getCategories(), //
        new Function<Category, Iterable<Check>>() {
          public Iterable<Check> apply(final Category from) {
            return from.getChecks();
          }
        })))));
    return result;
  }

}

