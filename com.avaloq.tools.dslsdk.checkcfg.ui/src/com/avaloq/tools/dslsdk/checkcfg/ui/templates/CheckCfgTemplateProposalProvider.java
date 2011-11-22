/*******************************************************************************
 * Copyright (c) 2011 Avaloq Licence AG, Schwerzistrasse 6, 8807 Freienbach, 
 * Switzerland, http://www.avaloq.com and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.avaloq.tools.dslsdk.checkcfg.ui.templates;

import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.FormalParameter;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCheck;
import com.avaloq.tools.dslsdk.checkcfg.ui.labeling.CheckCfgImages;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;


/**
 * The template proposal provider for Check Configuration templates.
 */
public class CheckCfgTemplateProposalProvider extends DefaultTemplateProposalProvider {

  @Inject
  private CheckCfgImages images;

  @Inject
  private IScopeProvider scopeProvider;

  private final TemplateStore templateStore;

  @Inject
  public CheckCfgTemplateProposalProvider(final TemplateStore templateStore, final ContextTypeRegistry registry, final ContextTypeIdHelper helper) {
    super(templateStore, registry, helper);
    this.templateStore = templateStore;
  }

  @Override
  public Image getImage(final Template template) {
    if (Strings.equal("CheckConfiguration", template.getName())) {
      return images.forCheckConfiguration();
    } else if (Strings.equal("ConfiguredCatalog", template.getName())) {
      return images.forConfiguredCatalog();
    }
    return super.getImage(template);
  }

  @Override
  protected void createTemplates(final TemplateContext templateContext, final ContentAssistContext context, final ITemplateAcceptor acceptor) {
    if (templateContext.getContextType().getId().equals("com.avaloq.tools.dslsdk.checkcfg.CheckCfg.ConfiguredCheck")) {
      addConfiguredCheckTemplates(templateContext, context, acceptor);
      return;
    } else if (templateContext.getContextType().getId().equals("com.avaloq.tools.dslsdk.checkcfg.CheckCfg.kw_catalog")) {
      addCatalogConfigurations(templateContext, context, acceptor);
    }
    TemplateContextType contextType = templateContext.getContextType();
    Template[] templates = templateStore.getTemplates(contextType.getId());
    for (Template template : templates) {

      if (!acceptor.canAcceptMoreTemplates()) {
        return;
      }
      if (validate(template, templateContext)) {
        acceptor.accept(createProposal(template, templateContext, context, getImage(template), getRelevance(template)));
      }
    }
  }

  /**
   * Adds the populated check configuration.
   * 
   * @param templateContext
   *          the template context
   * @param context
   *          the context
   * @param acceptor
   *          the acceptor
   */
  @SuppressWarnings("all")
  private void addCatalogConfigurations(final TemplateContext templateContext, final ContentAssistContext context, final ITemplateAcceptor acceptor) {
    if (context.getRootModel() instanceof CheckConfiguration) {
      final CheckConfiguration conf = (CheckConfiguration) context.getRootModel();
      Iterable<IEObjectDescription> allElements = scopeProvider.getScope(conf, CheckcfgPackage.Literals.CONFIGURED_CATALOG__CATALOG).getAllElements();

      StringBuilder builder = new StringBuilder();
      for (IEObjectDescription description : allElements) {
        if (description.getEObjectOrProxy() instanceof CheckCatalog) {
          CheckCatalog catalog = (CheckCatalog) description.getEObjectOrProxy();
          if (catalog.eIsProxy()) {
            catalog = (CheckCatalog) EcoreUtil.resolve(catalog, conf);
          }
          if (isCatalogConfigured(conf, catalog)) {
            continue;
          }

          builder.append("\ncatalog ").append(description.getQualifiedName()).append(" {\n");
          for (Check check : catalog.getAllChecks()) {
            builder.append("  inherit ").append(check.getName()).append("\n");
          }
        }
        builder.append("}\n");
      }

      if (builder.length() > 0) {
        builder.append("\n${cursor}");
        final String contextTypeId = templateContext.getContextType().getId();
        final String name = "Add configurable catalogs";
        final String description = "Create structure for configurable catalogs";

        Template t = new Template(name, description, contextTypeId, builder.toString(), true);
        TemplateProposal tp = createProposal(t, templateContext, context, images.forConfiguredCatalog(), getRelevance(t));
        acceptor.accept(tp);
      }
    }
  }

  /**
   * Checks if is catalog configured.
   * 
   * @param conf
   *          the check configuration
   * @param catalog
   *          the catalog
   * @return true, if is catalog configured
   */
  private boolean isCatalogConfigured(final CheckConfiguration conf, final CheckCatalog catalog) {
    try {
      Iterables.find(conf.getCatalogConfigurations(), new Predicate<ConfiguredCatalog>() {
        public boolean apply(final ConfiguredCatalog input) {
          return input.getCatalog() == catalog;
        }
      });
    } catch (NoSuchElementException e) {
      return false;
    }
    return true;
  }

  /**
   * Adds template proposals for all checks which may be referenced in current catalog configuration. Only proposals for checks
   * which have not yet been configured are provided.
   * 
   * @param templateContext
   *          the template context
   * @param context
   *          the context
   * @param acceptor
   *          the acceptor
   */
  private void addConfiguredCheckTemplates(final TemplateContext templateContext, final ContentAssistContext context, final ITemplateAcceptor acceptor) { // NOPMD
    ConfiguredCatalog configuredCatalog = EcoreUtil2.getContainerOfType(context.getCurrentModel(), ConfiguredCatalog.class);
    Iterable<String> aleadyConfiguredCheckNames = Iterables.filter(Iterables.transform(configuredCatalog.getCheckConfigurations(), new Function<ConfiguredCheck, String>() {
      public String apply(final ConfiguredCheck from) {
        if (from.getCheck() != null) {
          return from.getCheck().getName();
        }
        return null;
      }
    }), Predicates.notNull());
    for (final Check check : configuredCatalog.getCatalog().getAllChecks()) {
      // create a template on the fly
      final String checkName = check.getName();
      if (!check.isFinal() && !Iterables.contains(aleadyConfiguredCheckNames, checkName)) {

        // check if referenced check has configurable parameters
        String paramString = "";
        if (!check.getFormalParameters().isEmpty()) {
          StringBuilder params = new StringBuilder("(");
          for (final FormalParameter p : check.getFormalParameters()) {
            final String paramName = p.getParameter().getName();
            params.append(paramName).append(" = ").append("${new").append(StringExtensions.toFirstUpper(paramName)).append("Value}");
            params.append(", ");
          }
          if (params.length() > 2) {
            paramString = params.substring(0, params.length() - 2) + ")";
          }
        }

        final String severity = (configuredCatalog.getCatalog().isFinal() || check.isFinal()) ? "inherit " : "${inherit:Enum('SeverityKind')} ";
        final String description = "Configures the check \"" + check.getLabel() + "\"";
        final String contextTypeId = "com.avaloq.tools.dslsdk.checkcfg.CheckCfg.ConfiguredCheck." + checkName;
        final String pattern = severity + checkName + (paramString.length() == 0 ? "${cursor}" : " " + paramString + "${cursor}");

        Template t = new Template(checkName, description, contextTypeId, pattern, true);
        TemplateProposal tp = createProposal(t, templateContext, context, images.forConfiguredCheck(check.getDefaultSeverity()), getRelevance(t));
        acceptor.accept(tp);
      }
    }
  }

}

