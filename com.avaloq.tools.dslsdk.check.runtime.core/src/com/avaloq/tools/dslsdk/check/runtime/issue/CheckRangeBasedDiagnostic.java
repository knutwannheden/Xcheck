/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.avaloq.tools.dslsdk.check.runtime.issue;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.AbstractValidationDiagnostic;
import org.eclipse.xtext.validation.CheckType;

import com.google.common.collect.ImmutableList;


// FIXME this class is a copy of org.eclipse.xtext.validation.RangeBasedDiagnostic
// Only copied because it is not accessible
/**
 * A validation diagnostic that is associated with a range.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
// CHECKSTYLE:OFF this class is a copy
public class CheckRangeBasedDiagnostic extends AbstractValidationDiagnostic {

  private final int offset;
  private final int length;

  protected CheckRangeBasedDiagnostic(final int severity, final String message, final EObject source, final int offset, final int length, final CheckType checkType, final String issueCode, final String[] issueData) {
    super(severity, message, source, checkType, issueCode, issueData);
    this.offset = offset;
    this.length = length;
  }

  public List<?> getData() {
    if (getIssueData() == null) {
      return ImmutableList.of(getSourceEObject(), offset, length);
    } else {
      return ImmutableList.of(getSourceEObject(), offset, length, getIssueData());
    }
  }

  public int getOffset() {
    return offset;
  }

  public int getLength() {
    return length;
  }

  @Override
  public String getSource() {
    return super.getSource() + "@[" + offset + ":" + length + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder(super.toString());
    result.append("@[").append(offset).append(":").append(length).append("]"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    return result.toString();
  }

}
