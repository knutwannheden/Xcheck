/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider;

import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.google.inject.Inject;


/**
 * A sad and empty implementation of an hover provider.
 */
@SuppressWarnings("restriction")
// CHECKSTYLE:OFF
public class CheckHoverProvider extends XbaseHoverProvider {

  @Inject
  XbaseInterpreter interpreter;

  @Inject
  ILabelProvider labelProvider;

  @Override
  protected String getFirstLine(final EObject object) {
    if (object instanceof Check) {
      Check check = (Check) object;
      return "<b>" + check.getDefaultSeverity().getName() + " " + toHtml(labelProvider.getText(check)) + "</b>"
          + ((check.getId() == null) ? "" : " \"" + check.getLabel() + "\"");
    } else if (object instanceof CheckCatalog) {
      CheckCatalog catalog = (CheckCatalog) object;
      return "<b>" + toHtml(labelProvider.getText(catalog)) + "</b>" + ((catalog.getName() == null) ? "" : " \"" + catalog.getName() + "\"");
    }
    return super.getFirstLine(object);
  }

  @Override
  protected String getHoverInfoAsHtml(final EObject object) {
    if (!hasHover(object) || object.eIsProxy()) { // TODO object will be proxy in CA when referencing CheckCatalogs!
      return null;
    }

    if (object instanceof Check) {
      Check check = (Check) object;
      // a dispatcher would be nice
      StringBuffer buffer = new StringBuffer();
      buffer.append(getFirstLine(check));
      appendSection(buffer, "Description", check.getDescription());
      if (!check.getFormalParameters().isEmpty()) {
        buffer.append("<p><b>" + "Parameters" + ":</b></p>"); // NOPMD
        buffer.append("<table BORDER=1>");// NOPMD
        buffer.append("<tr>");// NOPMD
        buffer.append("<th><b>Type<b></th>");// NOPMD
        buffer.append("<th><b>Name<b></th>");// NOPMD
        buffer.append("<th><b>Default<b></th>");// NOPMD
        buffer.append("</tr>");
        for (FormalParameter parameter : check.getFormalParameters()) {
          buffer.append(" <tr>");// NOPMD
          buffer.append("<td>" + parameter.getParameter().getParameterType().getSimpleName() + "</td>");// NOPMD
          buffer.append("<td>" + parameter.getParameter().getName() + "</td>");// NOPMD
          buffer.append("<td>" + interpreter.evaluate(parameter.getDefaultValue()).getResult() + "</td>");// NOPMD
          buffer.append(" </tr>");// NOPMD
        }
        buffer.append("</table> ");
      }
      appendSection(buffer, "Message", check.getMessage());
      return buffer.toString();
    } else if (object instanceof CheckCatalog) {
      CheckCatalog catalog = (CheckCatalog) object;
      StringBuffer buffer = new StringBuffer();
      buffer.append(getFirstLine(catalog));
      appendSection(buffer, "Description", catalog.getDescription());
      return buffer.toString();
    }
    return super.getHoverInfoAsHtml(object);

  }

  private void appendSection(final StringBuffer buffer, final String title, final String content) {
    if (title != null && title.length() > 0) {
      buffer.append("<p><b>" + title + ":</b></p>");
    }
    if (content != null && content.length() > 0) {
      buffer.append("<p>" + content + "</p>");
    }
  }
}

/* Copyright (c) Avaloq License AG */