/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.registry;

import java.util.Collection;

import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckImpl;
import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckImpl.Registry;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.inject.Provider;


/**
 * Provides a registry of Check validators. Is required for the standalone builder
 * since extension points cannot be used in a non-Eclipse environment.
 */
public class CheckImplRegistryImpl implements Registry {

  private final Multimap<String, Object> map = HashMultimap.create();

  public Multimap<String, Object> getLanguageToValidatorMap() {
    return map;
  }

  /** {@inheritDoc} */
  @SuppressWarnings("unchecked")
  public Collection<ICheckImpl> getValidators(final String language) {
    Collection<Object> validators = map.get(language);
    for (Object v : Sets.newHashSet(validators)) {
      if (v instanceof Provider<?>) {
        validators.remove(v);
        final ICheckImpl validator = ((Provider<ICheckImpl>) v).get();
        if (validator != null) { // may be null if specified target class could not be found
          validators.add(validator);
        }
      }
    }
    return (Collection<ICheckImpl>) (Collection<?>) validators;
  }

}

/* Copyright (c) Avaloq License AG */