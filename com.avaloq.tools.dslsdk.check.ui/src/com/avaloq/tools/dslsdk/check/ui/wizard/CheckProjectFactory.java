/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */

package com.avaloq.tools.dslsdk.check.ui.wizard;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.ui.util.PluginProjectFactory;


/**
 * A factory for creating CustomCheckProject objects.
 */
// CHECKSTYLE:OFF
public class CheckProjectFactory extends PluginProjectFactory {
  // CHECKSTYLE:ON

  @Override
  protected void enhanceProject(final IProject project, final SubMonitor subMonitor, final Shell shell) throws CoreException {
    super.enhanceProject(project, subMonitor, shell);
    createPluginXML(project, subMonitor.newChild(1));
  }

  /**
   * Creates the initial {@code plugin.xml} file. Note that the file created is empty, actual contents
   * for Catalogs are created by the builder participant.
   * 
   * @param project
   *          the project
   * @param monitor
   *          the monitor
   * @throws CoreException
   *           the core exception
   */
  @SuppressWarnings("nls")
  private void createPluginXML(final IProject project, final IProgressMonitor monitor) throws CoreException {
    final StringBuilder content = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<?eclipse version=\"3.4\"?>\n");
    content.append("<plugin>\n</plugin>\n");

    SubMonitor subMonitor = SubMonitor.convert(monitor, 2);
    try {
      createFile("plugin.xml", project, content.toString(), subMonitor.newChild(1));
    } finally {
      subMonitor.done();
    }
  }

  /**
   * Overridden in order to change BundleVendor. {@inheritDoc}
   */
  @SuppressWarnings("nls")
  @Override
  protected void createManifest(final IProject project, final IProgressMonitor progressMonitor) throws CoreException {
    final StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
    content.append("Bundle-ManifestVersion: 2\n");
    content.append("Bundle-Name: " + projectName + "\n");
    content.append("Bundle-Vendor: %Bundle-Vendor\n");
    content.append("Bundle-Version: 1.0.0.qualifier\n");
    content.append("Bundle-SymbolicName: " + projectName + ";singleton:=true\n");
    if (null != activatorClassName) {
      content.append("Bundle-Activator: " + activatorClassName + "\n");
    }
    content.append("Bundle-ActivationPolicy: lazy\n");

    addToContent(content, requiredBundles, "Require-Bundle");
    addToContent(content, exportedPackages, "Export-Package");
    addToContent(content, importedPackages, "Import-Package");

    content.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");

    final IFolder metaInf = project.getFolder("META-INF");
    SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
    try {
      if (metaInf.exists()) {
        metaInf.delete(false, progressMonitor);
      }
      metaInf.create(false, true, subMonitor.newChild(1));
      createFile("MANIFEST.MF", metaInf, content.toString(), subMonitor.newChild(1));
    } finally {
      subMonitor.done();
    }
  }
}

/* Copyright (c) Avaloq License AG */