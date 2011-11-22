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

import com.avaloq.tools.dslsdk.check.runtime.issue.ICheckQuickfixImpl.Registry;
import com.avaloq.tools.dslsdk.check.runtime.quickfix.ICoreQuickfixProvider;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.inject.Provider;


/**
 * Provides a registry of Check quickfix providers. Is required for the standalone builder
 * since extension points cannot be used in a non-Eclipse environment.
 */
public class CheckQuickfixImplRegistryImpl implements Registry {

  private final Multimap<String, Object> map = HashMultimap.create();

  public Multimap<String, Object> getLanguageToProviderMap() {
    return map;
  }

  /** {@inheritDoc} */
  @SuppressWarnings("unchecked")
  public Collection<ICoreQuickfixProvider> getProviders(final String language) {
    Collection<Object> providers = map.get(language);
    for (Object v : Sets.newHashSet(providers)) {
      if (v instanceof Provider<?>) {
        providers.remove(v); // TODO document why remove then add
        final ICoreQuickfixProvider provider = ((Provider<ICoreQuickfixProvider>) v).get();
        if (provider != null) { // may be null if specified target class could not be found
          providers.add(provider);
        }
      }
    }
    return (Collection<ICoreQuickfixProvider>) (Collection<?>) providers;
  }

}

