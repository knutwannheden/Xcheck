/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;


/**
 * Support routines for Xtend file TransformUtil.ext.
 */
public class TransformUtil {

  /**
   * Private constructor.
   */
  protected TransformUtil() {
    // Nothing to do (but keep Checkstyle happy.)
  }

  /**
   * Maps Ecore type names to the corresponding Ecore object instance.
   * 
   * @param ecoreTypeName
   *          The name of the Ecore primitive type to be mapped to its
   *          instance. Permitted values are EString, EInt, EIntegerObject, EBoolean, EBooleanObject, EChar,
   *          ELong, EShort, EDouble, EDate, EFloat.
   *          Note that the use of EBooleanObject is discouraged, since we want to avoid 3-states logic.
   * @return the corresponding EDataType instance if permitted ecoreTypeName,
   *         else null
   */
  public static Object mapType(final String ecoreTypeName) {
    if (ecoreTypeName == null) {
      return null;
    }
    final EcorePackage ecorePkg = EcorePackage.eINSTANCE;
    if ("EString".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEString();
    } else if ("EInt".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEInt();
    } else if ("EIntegerObject".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEIntegerObject();
    } else if ("EBoolean".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEBoolean();
    } else if ("EBooleanObject".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEBooleanObject();
    } else if ("EChar".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEChar();
    } else if ("ELong".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getELong();
    } else if ("EShort".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEShort();
    } else if ("EDouble".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEDouble();
    } else if ("EDate".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEDate();
    } else if ("EFloat".equals(ecoreTypeName)) { //$NON-NLS-1$
      return ecorePkg.getEFloat();
    } else {
      return null;
    }
  }

  /**
   * Sets structural features whose type is {@link org.eclipse.emf.ecore.EEnum} unsettable.
   * 
   * @param source
   *          the class whose features are inspected and made unsettable if the type is EEnum
   */
  public static void setEEnumsUnsettable(final EClass source) {
    for (final EStructuralFeature feature : source.getEStructuralFeatures()) {
      if (feature.getEType() instanceof EEnum) {
        feature.setUnsettable(true);
      }
    }

  }

}

