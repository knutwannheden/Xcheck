/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.check.check.impl;

import com.avaloq.tools.dslsdk.check.check.Category;
import com.avaloq.tools.dslsdk.check.check.Check;
import com.avaloq.tools.dslsdk.check.check.CheckCatalog;
import com.avaloq.tools.dslsdk.check.check.CheckPackage;
import com.avaloq.tools.dslsdk.check.check.Implementation;
import com.avaloq.tools.dslsdk.check.check.Import;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.Grammar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getIncludedCatalogs <em>Included Catalogs</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getImplementations <em>Implementations</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.CheckCatalogImpl#getChecks <em>Checks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckCatalogImpl extends DocumentedImplCustom implements CheckCatalog
{
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected Grammar grammar;

	/**
	 * The cached value of the '{@link #getIncludedCatalogs() <em>Included Catalogs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedCatalogs()
	 * @generated
	 * @ordered
	 */
	protected CheckCatalog includedCatalogs;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> implementations;

	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> checks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckCatalogImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CheckPackage.Literals.CHECK_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName()
	{
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName)
	{
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CHECK_CATALOG__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<Import>(Import.class, this, CheckPackage.CHECK_CATALOG__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal()
	{
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal)
	{
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CHECK_CATALOG__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CHECK_CATALOG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar getGrammar()
	{
		if (grammar != null && grammar.eIsProxy())
		{
			InternalEObject oldGrammar = (InternalEObject)grammar;
			grammar = (Grammar)eResolveProxy(oldGrammar);
			if (grammar != oldGrammar)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckPackage.CHECK_CATALOG__GRAMMAR, oldGrammar, grammar));
			}
		}
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar basicGetGrammar()
	{
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammar(Grammar newGrammar)
	{
		Grammar oldGrammar = grammar;
		grammar = newGrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CHECK_CATALOG__GRAMMAR, oldGrammar, grammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckCatalog getIncludedCatalogs()
	{
		if (includedCatalogs != null && includedCatalogs.eIsProxy())
		{
			InternalEObject oldIncludedCatalogs = (InternalEObject)includedCatalogs;
			includedCatalogs = (CheckCatalog)eResolveProxy(oldIncludedCatalogs);
			if (includedCatalogs != oldIncludedCatalogs)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckPackage.CHECK_CATALOG__INCLUDED_CATALOGS, oldIncludedCatalogs, includedCatalogs));
			}
		}
		return includedCatalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckCatalog basicGetIncludedCatalogs()
	{
		return includedCatalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludedCatalogs(CheckCatalog newIncludedCatalogs)
	{
		CheckCatalog oldIncludedCatalogs = includedCatalogs;
		includedCatalogs = newIncludedCatalogs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CHECK_CATALOG__INCLUDED_CATALOGS, oldIncludedCatalogs, includedCatalogs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories()
	{
		if (categories == null)
		{
			categories = new EObjectContainmentEList<Category>(Category.class, this, CheckPackage.CHECK_CATALOG__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getImplementations()
	{
		if (implementations == null)
		{
			implementations = new EObjectContainmentEList<Implementation>(Implementation.class, this, CheckPackage.CHECK_CATALOG__IMPLEMENTATIONS);
		}
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getChecks()
	{
		if (checks == null)
		{
			checks = new EObjectContainmentEList<Check>(Check.class, this, CheckPackage.CHECK_CATALOG__CHECKS);
		}
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getAllChecks()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case CheckPackage.CHECK_CATALOG__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case CheckPackage.CHECK_CATALOG__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case CheckPackage.CHECK_CATALOG__IMPLEMENTATIONS:
				return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
			case CheckPackage.CHECK_CATALOG__CHECKS:
				return ((InternalEList<?>)getChecks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case CheckPackage.CHECK_CATALOG__PACKAGE_NAME:
				return getPackageName();
			case CheckPackage.CHECK_CATALOG__IMPORTS:
				return getImports();
			case CheckPackage.CHECK_CATALOG__FINAL:
				return isFinal();
			case CheckPackage.CHECK_CATALOG__NAME:
				return getName();
			case CheckPackage.CHECK_CATALOG__GRAMMAR:
				if (resolve) return getGrammar();
				return basicGetGrammar();
			case CheckPackage.CHECK_CATALOG__INCLUDED_CATALOGS:
				if (resolve) return getIncludedCatalogs();
				return basicGetIncludedCatalogs();
			case CheckPackage.CHECK_CATALOG__CATEGORIES:
				return getCategories();
			case CheckPackage.CHECK_CATALOG__IMPLEMENTATIONS:
				return getImplementations();
			case CheckPackage.CHECK_CATALOG__CHECKS:
				return getChecks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CheckPackage.CHECK_CATALOG__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__FINAL:
				setFinal((Boolean)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__NAME:
				setName((String)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__GRAMMAR:
				setGrammar((Grammar)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__INCLUDED_CATALOGS:
				setIncludedCatalogs((CheckCatalog)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__IMPLEMENTATIONS:
				getImplementations().clear();
				getImplementations().addAll((Collection<? extends Implementation>)newValue);
				return;
			case CheckPackage.CHECK_CATALOG__CHECKS:
				getChecks().clear();
				getChecks().addAll((Collection<? extends Check>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case CheckPackage.CHECK_CATALOG__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case CheckPackage.CHECK_CATALOG__IMPORTS:
				getImports().clear();
				return;
			case CheckPackage.CHECK_CATALOG__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case CheckPackage.CHECK_CATALOG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CheckPackage.CHECK_CATALOG__GRAMMAR:
				setGrammar((Grammar)null);
				return;
			case CheckPackage.CHECK_CATALOG__INCLUDED_CATALOGS:
				setIncludedCatalogs((CheckCatalog)null);
				return;
			case CheckPackage.CHECK_CATALOG__CATEGORIES:
				getCategories().clear();
				return;
			case CheckPackage.CHECK_CATALOG__IMPLEMENTATIONS:
				getImplementations().clear();
				return;
			case CheckPackage.CHECK_CATALOG__CHECKS:
				getChecks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case CheckPackage.CHECK_CATALOG__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case CheckPackage.CHECK_CATALOG__IMPORTS:
				return imports != null && !imports.isEmpty();
			case CheckPackage.CHECK_CATALOG__FINAL:
				return final_ != FINAL_EDEFAULT;
			case CheckPackage.CHECK_CATALOG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CheckPackage.CHECK_CATALOG__GRAMMAR:
				return grammar != null;
			case CheckPackage.CHECK_CATALOG__INCLUDED_CATALOGS:
				return includedCatalogs != null;
			case CheckPackage.CHECK_CATALOG__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case CheckPackage.CHECK_CATALOG__IMPLEMENTATIONS:
				return implementations != null && !implementations.isEmpty();
			case CheckPackage.CHECK_CATALOG__CHECKS:
				return checks != null && !checks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", final: ");
		result.append(final_);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CheckCatalogImpl
