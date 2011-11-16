/*
 * Copyright (c) Avaloq Licence AG
 * Schwerzistrasse 6, 8807 Freienbach, Switzerland, http://www.avaloq.com
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Avaloq License AG.
 * You shall not disclose whole or parts of it and shall use it only in accordance with the terms of the
 * license agreement you entered into with Avaloq License AG.
 */
package com.avaloq.tools.dslsdk.check.generator;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;


/**
 * The generator which is called by the Check compiler.
 */
public class Main {

  private static final Logger LOGGER = Logger.getLogger(Main.class);

  /**
   * Initiates code generation.
   * 
   * @param args
   *          the arguments
   */
  public static void main(final String[] args) {
    if (args.length == 0) {
      LOGGER.error("Aborting: no path to EMF resource provided!");
      return;
    }
    Injector injector = new com.avaloq.tools.dslsdk.check.CheckStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
    Main main = injector.getInstance(Main.class);
    main.runGenerator(args[0]);
  }

  @Inject
  private Provider<ResourceSet> resourceSetProvider;

  @Inject
  private IResourceValidator validator;

  @Inject
  private IGenerator generator;

  @Inject
  private JavaIoFileSystemAccess fileAccess;

  /**
   * Runs the generator and validates given resource.
   * 
   * @param resourceURI
   *          the string
   */
  protected void runGenerator(final String resourceURI) {
    // load the resource
    ResourceSet set = resourceSetProvider.get();
    Resource resource = set.getResource(URI.createURI(resourceURI), true);

    // validate the resource
    List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
    if (!list.isEmpty()) {
      for (Issue issue : list) {
        LOGGER.error(issue);
      }
      return;
    }

    // configure and start the generator
    fileAccess.setOutputPath("src-gen/");
    generator.doGenerate(resource, fileAccess);

    LOGGER.info("Code generation finished.");
  }
}

/* Copyright (c) Avaloq License AG */