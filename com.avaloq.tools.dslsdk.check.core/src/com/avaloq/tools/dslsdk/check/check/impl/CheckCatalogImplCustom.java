/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

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

/* Copyright (c) Avaloq License AG */