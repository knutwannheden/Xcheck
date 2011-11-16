/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.runtime.quickfix;

/**
 * Indicates the attempt to access a non-existing position. The attempt has been
 * performed on a text store such as a document or string.
 * <p>
 * This class is not intended to be serialized.
 * </p>
 * <p>
 * This class is UI-independent.
 */
public class BadLocationException extends Exception {

  /**
   * Serial version UID for this class.
   * <p>
   * Note: This class is not intended to be serialized.
   * </p>
   * 
   * @since 3.1
   */
  private static final long serialVersionUID = 3257281452776370224L;

  /**
   * Creates a new bad location exception.
   */
  public BadLocationException() {
    super();
  }

  /**
   * Creates a new bad location exception.
   * 
   * @param message
   *          the exception message
   */
  public BadLocationException(final String message) {
    super(message);
  }

  /**
   * Creates a new bad location exception.
   * 
   * @param exception
   *          the cause for the exception
   */
  public BadLocationException(final Exception wrappedException) {
    super(wrappedException);
  }
}

/* Copyright (c) Avaloq License AG */