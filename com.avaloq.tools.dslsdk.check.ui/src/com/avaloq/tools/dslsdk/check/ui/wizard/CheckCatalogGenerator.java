/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.check.ui.wizard;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;

import com.google.inject.Singleton;


/**
 * The Class CheckFileGeneratorUtil.
 */
@Singleton
public class CheckCatalogGenerator {

  private static final Logger LOGGER = Logger.getLogger(CheckCatalogGenerator.class);

  private static final String DEFAULT_UTF_8_ENCODING = "UTF-8"; //$NON-NLS-1$

  /**
   * Generates a check file. Calls an Xpand template.
   * 
   * @param path
   *          the path used for the output file destination
   * @param projectInfo
   *          the project info
   */
  public void generateCheckFile(final IPath path, final CheckProjectInfo projectInfo) {
    OutputImpl output = new OutputImpl();
    output.addOutlet(new Outlet(false, getEncoding(), null, true, path.toOSString()));

    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
    execCtx.getResourceManager().setFileEncoding(getEncoding());
    execCtx.registerMetaModel(new JavaBeansMetaModel());

    XpandFacade facade = XpandFacade.create(execCtx);
    facade.evaluate("com::avaloq::tools::dslsdk::check::ui::wizard::CheckNewProject::main", projectInfo); //$NON-NLS-1$
  }

  /**
   * Generates a default quickfix provider.
   * 
   * @param path
   *          the path
   * @param projectInfo
   *          the project info
   */
  public void generateDefaultQuickfixProvider(final IPath path, final CheckProjectInfo projectInfo) {
    OutputImpl output = new OutputImpl();
    output.addOutlet(new Outlet(false, getEncoding(), null, true, path.toOSString()));

    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
    execCtx.getResourceManager().setFileEncoding(getEncoding());
    execCtx.registerMetaModel(new JavaBeansMetaModel());

    XpandFacade facade = XpandFacade.create(execCtx);
    facade.evaluate("com::avaloq::tools::dslsdk::check::ui::wizard::CheckQuickfixProvider::main", projectInfo); //$NON-NLS-1$
  }

  /**
   * Gets the encoding.
   * 
   * @return the encoding
   */
  public String getEncoding() {
    try {
      return ResourcesPlugin.getWorkspace().getRoot().getDefaultCharset();
    } catch (CoreException e) {

      LOGGER.error(Messages.NO_CHARSET_DEFINED);
      return DEFAULT_UTF_8_ENCODING; // TODO set default, return default
    }
  }
}

