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

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

import com.avaloq.tools.dslsdk.check.check.CheckPackage;
import com.google.inject.Inject;


/**
 * The linking service class for the Check language serves as a workaround for
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=350695.
 */
public class CheckLinkingService extends DefaultLinkingService {

  private static final Logger LOGGER = Logger.getLogger(CheckLinkingService.class);

  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;

  /**
   * Gets the linked objects.
   * 
   * @param context
   *          the context
   * @param ref
   *          the ref
   * @param node
   *          the node
   * @return the first element returned from the injected {@link org.eclipse.xtext.scoping.IScopeProvider} which matches the text of the passed
   *         {@link org.eclipse.xtext.nodemodel.impl.LeafNode}
   */
  @Override
  public List<EObject> getLinkedObjects(final EObject context, final EReference ref, final INode node) {
    final EClass requiredType = ref.getEReferenceType();
    if (requiredType == null) {
      return Collections.<EObject> emptyList();
    }

    final String crossRefString = getCrossRefNodeAsString(node);
    if (crossRefString != null && !crossRefString.equals("")) {
      if (LOGGER.isDebugEnabled()) {
        LOGGER.debug("before getLinkedObjects: node: '" + crossRefString + "'");
      }

      final IScope scope = getScope(context, ref);
      QualifiedName qualifiedLinkName = qualifiedNameConverter.toQualifiedName(crossRefString);
      if (ref == CheckPackage.Literals.CHECK_CATALOG__GRAMMAR) {
        qualifiedLinkName = QualifiedName.create(crossRefString);
      }
      IEObjectDescription eObjectDescription = scope.getSingleElement(qualifiedLinkName);
      if (LOGGER.isDebugEnabled()) {
        LOGGER.debug("after getLinkedObjects: node: '" + crossRefString + "' result: " + eObjectDescription);
      }
      if (eObjectDescription != null) {
        return Collections.singletonList(eObjectDescription.getEObjectOrProxy());
      }
    }
    return Collections.emptyList();
  }
}

/* Copyright (c) Avaloq License AG */