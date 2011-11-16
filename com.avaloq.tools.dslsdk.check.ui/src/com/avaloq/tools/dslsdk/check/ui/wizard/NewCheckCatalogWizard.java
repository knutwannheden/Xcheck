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

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.util.FileOpener;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import com.avaloq.tools.dslsdk.check.ui.labeling.CheckImages;
import com.google.inject.Inject;


/**
 * Wizard for creating a new Check file.
 */
public class NewCheckCatalogWizard extends XtextNewProjectWizard {

  private static final Logger LOGGER = Logger.getLogger(NewCheckCatalogWizard.class);

  @Inject
  private FileOpener fileOpener;

  /** The page. */
  private final NewCheckCatalogWizardPage catalogPage;

  /**
   * Instantiates a new new check file wizard.
   * 
   * @param images
   *          the shared images
   * @param page
   *          the new file wizard page
   */
  @Inject
  public NewCheckCatalogWizard(final CheckImages images, final NewCheckCatalogWizardPage catalogPage, final ICheckCatalogCreator creator) {
    super(creator);
    this.catalogPage = catalogPage;
    Image image = images.forCheckCatalog();
    setDefaultPageImageDescriptor(ImageDescriptor.createFromImage(image));
    setWindowTitle(Messages.CATALOG_WIZARD_WINDOW_TITLE);
  }

  /** {@inheritDoc} */
  @Override
  public void addPages() {
    super.addPages();
    catalogPage.init(selection); // from parent class
    addPage(catalogPage);
  }

  @Override
  protected void doFinish(final IProjectInfo projectInfo, final IProgressMonitor monitor) {
    getCreator().setProjectInfo(getProjectInfo());
    try {
      getCreator().run(monitor);
      fileOpener.selectAndReveal(getCreator().getResult());
      fileOpener.openFileToEdit(getShell(), getCreator().getResult());
    } catch (final InvocationTargetException e) {
      LOGGER.error(e.getMessage(), e);
    } catch (final InterruptedException e) {
      LOGGER.error(e.getMessage(), e);
    }
  }

  /**
   * Get the project info instance from the new file page. It contains all information except for the project name.
   * 
   * @return the project info instance
   */
  @Override
  public IProjectInfo getProjectInfo() {
    CheckProjectInfo projectInfo = new CheckProjectInfo();
    projectInfo = catalogPage.getProjectInfo();
    return projectInfo;
  }

}

/* Copyright (c) Avaloq License AG */