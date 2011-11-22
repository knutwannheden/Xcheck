/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.runtime.quickfix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Annotation for quickfix provider method implementations.
 * <p>
 * This class is a copy of Xtext's {@link org.eclipse.xtext.ui.editor.quickfix.Fix Fix} annotation.
 * <p>
 * This class is UI-independent.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface CoreFix {
  String value();
}

/* Copyright (c) Avaloq License AG */