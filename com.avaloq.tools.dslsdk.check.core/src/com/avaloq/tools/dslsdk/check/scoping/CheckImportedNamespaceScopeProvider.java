/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.scoping;

import static java.util.Collections.singletonList;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.ScopeBasedSelectable;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;

import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.google.inject.Inject;


/**
 * Hugely :-) based on the Xtend2 version.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 * @author Sebastian Zarnekow - Improved support for nested types in connection with imports
 */
public class CheckImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {

  @Inject
  private IQualifiedNameConverter nameConverter;

  @Override
  protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    if (!(context instanceof CheckCatalog)) {
      return Collections.emptyList();
    }
    List<ImportNormalizer> importedNamespaceResolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase);
    if (!Strings.isEmpty(((CheckCatalog) context).getPackageName())) {
      importedNamespaceResolvers.add(new ImportNormalizer(nameConverter.toQualifiedName(((CheckCatalog) context).getPackageName()), true, ignoreCase));
    }
    return importedNamespaceResolvers;
  }

  @Override
  protected ImportNormalizer createImportedNamespaceResolver(final String namespace, final boolean ignoreCase) {
    if (Strings.isEmpty(namespace)) {
      return null;
    }
    QualifiedName importedNamespace = nameConverter.toQualifiedName(namespace);
    if (importedNamespace == null || importedNamespace.getSegmentCount() < 1) {
      return null;
    }
    boolean hasWildCard = ignoreCase ? importedNamespace.getLastSegment().equalsIgnoreCase(getWildCard())
        : importedNamespace.getLastSegment().equals(getWildCard());
    if (hasWildCard) {
      if (importedNamespace.getSegmentCount() <= 1) {
        return null;
      }
      return doCreateImportNormalizer(importedNamespace.skipLast(1), true, ignoreCase);
    } else {
      return doCreateImportNormalizer(importedNamespace, false, ignoreCase);
    }
  }

  @Override
  protected List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    return Collections.emptyList();
  }

  protected List<ImportNormalizer> getJavaLangImport() {
    return singletonList(new ImportNormalizer(QualifiedName.create("java", "lang"), true, false));
  }

  /**
   * Create an import normalizer.
   * 
   * @param importedNamespace
   *          iported namespace
   * @param wildcard
   *          wildcard
   * @param ignoreCase
   *          ignore case
   * @return an import normalizer
   */
  protected ImportNormalizer doCreateImportNormalizer(final QualifiedName importedNamespace, final boolean wildcard, final boolean ignoreCase) {
    return new ImportNormalizer(importedNamespace, wildcard, ignoreCase);
  }

  @Override
  protected IScope getLocalElementsScope(final IScope parent, final EObject context, final EReference reference) {
    IScope result = parent;
    ISelectable allDescriptions = getAllDescriptions(context.eResource());
    ScopeBasedSelectable parentSelectable = new ScopeBasedSelectable(parent);
    QualifiedName name = getQualifiedNameOfLocalElement(context);
    boolean ignoreCase = isIgnoreCase(reference);
    if (context instanceof CheckCatalog) {
      // explicitly add java.lang imports with correct import-selectable
      List<ImportNormalizer> javaLangImport = getJavaLangImport();
      result = createImportScope(result, javaLangImport, parentSelectable, reference.getEReferenceType(), isIgnoreCase(reference));
    }
    final List<ImportNormalizer> namespaceResolvers = getImportedNamespaceResolvers(context, ignoreCase);
    if (!namespaceResolvers.isEmpty()) {
      if (isRelativeImport() && name != null) {
        ImportNormalizer localNormalizer = doCreateImportNormalizer(name, true, ignoreCase);
        result = createImportScope(result, singletonList(localNormalizer), allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
      }
      result = createImportScope(result, namespaceResolvers, parentSelectable, reference.getEReferenceType(), isIgnoreCase(reference));
    }
    if (name != null) {
      ImportNormalizer localNormalizer = doCreateImportNormalizer(name, true, ignoreCase);
      result = createImportScope(result, singletonList(localNormalizer), allDescriptions, reference.getEReferenceType(), isIgnoreCase(reference));
    }
    return result;
  }

  @Override
  protected boolean isRelativeImport() {
    return false;
  }

  @Override
  protected ImportScope createImportScope(final IScope parent, final List<ImportNormalizer> namespaceResolvers, final ISelectable importFrom, final EClass type, final boolean ignoreCase) {
    return new ImportScope(namespaceResolvers, parent, importFrom, type, ignoreCase) {
      @Override
      protected IEObjectDescription getSingleLocalElementByName(final QualifiedName name) {
        if (name.getSegmentCount() > 1) {
          return null;
        }
        return super.getSingleLocalElementByName(name);
      }

      @Override
      protected Iterable<IEObjectDescription> getLocalElementsByName(final QualifiedName name) {
        if (name.getSegmentCount() > 1) {
          return Collections.emptyList();
        }
        return super.getLocalElementsByName(name);
      }
    };
  }
}

/* Copyright (c) Avaloq License AG */