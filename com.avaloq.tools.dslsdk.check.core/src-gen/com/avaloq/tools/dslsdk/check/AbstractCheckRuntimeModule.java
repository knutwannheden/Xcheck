/*
 * generated by Xtext
 */
package com.avaloq.tools.dslsdk.check;

import java.util.Properties;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {com.avaloq.tools.dslsdk.check.CheckRuntimeModule}
 */
 @SuppressWarnings("all")
public abstract class AbstractCheckRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "com/avaloq/tools/dslsdk/check/Check.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("com.avaloq.tools.dslsdk.check.Check");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("check");
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return com.avaloq.tools.dslsdk.check.services.CheckGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.parseTreeConstructor.ParseTreeConstructorFragment
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor> bindIParseTreeConstructor() {
		return com.avaloq.tools.dslsdk.check.parseTreeConstruction.CheckParsetreeConstructor.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return com.avaloq.tools.dslsdk.check.parser.antlr.CheckParser.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return com.avaloq.tools.dslsdk.check.parser.antlr.CheckAntlrTokenFileProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return com.avaloq.tools.dslsdk.check.parser.antlr.internal.InternalCheckLexer.class;
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public com.google.inject.Provider<com.avaloq.tools.dslsdk.check.parser.antlr.internal.InternalCheckLexer> provideInternalCheckLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(com.avaloq.tools.dslsdk.check.parser.antlr.internal.InternalCheckLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(com.avaloq.tools.dslsdk.check.parser.antlr.internal.InternalCheckLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends com.avaloq.tools.dslsdk.check.validation.CheckJavaValidator> bindCheckJavaValidator() {
		return com.avaloq.tools.dslsdk.check.validation.CheckJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIgnoreCaseLinking(com.google.inject.Binder binder) {
		binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return com.avaloq.tools.dslsdk.check.formatting.CheckFormatter.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.IContainer.Manager> bindIContainer$Manager() {
		return org.eclipse.xtext.resource.containers.StateBasedContainerManager.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE)).to(org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public java.lang.ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public org.eclipse.xtext.common.types.TypesFactory bindTypesFactoryToInstance() {
		return org.eclipse.xtext.common.types.TypesFactory.eINSTANCE;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
		return org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory.class;
	}

	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
		return org.eclipse.xtext.common.types.xtext.ClasspathBasedTypeScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.interpreter.IEvaluationContext> bindIEvaluationContext() {
		return org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationContext.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter> bindIExpressionInterpreter() {
		return org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return org.eclipse.xtext.xbase.XbaseQualifiedNameConverter.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.typing.ITypeProvider> bindITypeProvider() {
		return org.eclipse.xtext.xbase.typing.XbaseTypeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.conversion.IValueConverterService> bindIValueConverterService() {
		return org.eclipse.xtext.xbase.conversion.XbaseValueConverterService.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public void configureLinkingIScopeProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(org.eclipse.xtext.linking.LinkingScopeProviderBinding.class).to(org.eclipse.xtext.xbase.linking.XbaseLinkingScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider.class);
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return org.eclipse.xtext.xbase.scoping.XbaseScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
		return org.eclipse.xtext.xbase.linking.XbaseLazyLinker.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.util.TypeConformanceComputer> bindTypeConformanceComputer() {
		return org.eclipse.xtext.xbase.typing.XbaseTypeConformanceComputer.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.resource.XtextResource> bindXtextResource() {
		return org.eclipse.xtext.xbase.resource.XbaseResource.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends org.eclipse.xtext.xbase.validation.JvmTypeReferencesValidator> bindJvmTypeReferencesValidator() {
		return org.eclipse.xtext.xbase.validation.JvmTypeReferencesValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.resource.IDerivedStateComputer> bindIDerivedStateComputer() {
		return org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.resource.IResourceDescription.Manager> bindIResourceDescription$Manager() {
		return org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return org.eclipse.xtext.xbase.compiler.JvmModelGenerator.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public org.eclipse.xtext.xtype.XtypeFactory bindXtypeFactoryToInstance() {
		return org.eclipse.xtext.xtype.XtypeFactory.eINSTANCE;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.common.types.util.TypeArgumentContextProvider> bindTypeArgumentContextProvider() {
		return org.eclipse.xtext.xbase.typing.XbaseTypeArgumentContextProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.resource.ILocationInFileProvider> bindILocationInFileProvider() {
		return org.eclipse.xtext.xbase.jvmmodel.JvmLocationInFileProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.resource.EObjectAtOffsetHelper> bindEObjectAtOffsetHelper() {
		return org.eclipse.xtext.xbase.jvmmodel.JvmEObjectAtOffsetHelper.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return org.eclipse.xtext.xbase.jvmmodel.JvmGlobalScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.xbase.XbaseGeneratorFragment
	public Class<? extends org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer> bindIJvmModelInferrer() {
		return com.avaloq.tools.dslsdk.check.jvmmodel.CheckJvmModelInferrer.class;
	}

}