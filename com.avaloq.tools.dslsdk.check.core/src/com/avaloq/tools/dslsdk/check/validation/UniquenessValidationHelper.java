/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.validation;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;


/**
 * Defines utility methods for validating different flavors of uniqueness in an ECore Model,
 * to be used directly with Xtext (in a Java Validator).
 * 
 * @param <T>
 *          type of the objects that can be duplicated in the context, subtype of EObject
 */
public class UniquenessValidationHelper<T extends EObject> {

  private final Function<T, QualifiedName> nameFunction;

  /**
   * Creates a Uniqueness validation helper.
   * 
   * @param nameFunction
   *          a function that returns a representation of a T object that can be compared by means of equals
   */
  public UniquenessValidationHelper(final Function<T, QualifiedName> nameFunction) {
    super();
    if (nameFunction == null) {
      throw new IllegalArgumentException("nameFunction can't be null"); //$NON-NLS-1$
    }
    this.nameFunction = nameFunction;
  }

  /**
   * Find and returns duplicate objects from a candidate list (iterable).
   * 
   * @param possiblyDuplicateObjects
   *          an Iterable into which to look for duplicates
   * @return a set of duplicate objects
   */
  public Set<T> findDuplicates(final Iterable<T> possiblyDuplicateObjects) {
    if (possiblyDuplicateObjects == null) {
      return Collections.<T> emptySet();
    }

    final Map<QualifiedName, T> nameToEObjectMap = Maps.newHashMap();
    final Set<T> duplicateEObjects = Sets.newHashSet();

    for (final T object : possiblyDuplicateObjects) {
      if (!object.eIsProxy()) {
        final QualifiedName name = nameFunction.apply(object);

        if (nameToEObjectMap.containsKey(name)) {
          // Register both EObjects with name
          duplicateEObjects.add(object);
          duplicateEObjects.add(nameToEObjectMap.get(name));
        } else {
          // Store the name as first occurrence
          nameToEObjectMap.put(name, object);
        }
      }
    }
    return duplicateEObjects;
  }

  /**
   * Returns the nameFunction.
   * 
   * @return the name function
   */
  public Function<T, QualifiedName> getNameFunction() {
    return nameFunction;
  }

}

