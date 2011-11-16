/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.util;

/**
 * Utility Class for Check.
 */
public final class CheckUtil {

  private CheckUtil() {
    // private initializer
  }

  /**
   * Converts a string into an identifier by removing all characters that are not
   * allowed.
   * 
   * @param source
   *          any string
   * @return a string stripped from illegal characters
   */
  public static String toIdentifier(final String source) {
    StringBuilder result = new StringBuilder();
    if (source == null) {
      return null;
    } else if (source.length() == 0 || !Character.isJavaIdentifierStart(source.charAt(0))) {
      return "";
    }
    result.append(source.charAt(0));

    boolean space = false;
    for (Character c : source.substring(1).toCharArray()) {
      if (Character.isJavaIdentifierPart(c)) {
        result.append((space) ? Character.toUpperCase(c) : c);
      }
      space = Character.isWhitespace(c);
    }
    return result.toString();
  }

}

/* Copyright (c) Avaloq License AG */