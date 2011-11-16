/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl;

import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckConfiguration;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.CheckcfgPackage;
import com.avaloq.tools.dslsdk.checkcfg.checkcfg.ConfiguredCatalog;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl#getCatalogConfigurations <em>Catalog Configurations</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.checkcfg.checkcfg.impl.CheckConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckConfigurationImpl extends MinimalEObjectImpl.Container implements CheckConfiguration
{
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCatalogConfigurations() <em>Catalog Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfiguredCatalog> catalogConfigurations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConfigurationImpl()
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
		return CheckcfgPackage.Literals.CHECK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel)
	{
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckcfgPackage.CHECK_CONFIGURATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfiguredCatalog> getCatalogConfigurations()
	{
		if (catalogConfigurations == null)
		{
			catalogConfigurations = new EObjectContainmentEList<ConfiguredCatalog>(ConfiguredCatalog.class, this, CheckcfgPackage.CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS);
		}
		return catalogConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		// TODO: implement this method to return the 'Name' attribute
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
			case CheckcfgPackage.CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS:
				return ((InternalEList<?>)getCatalogConfigurations()).basicRemove(otherEnd, msgs);
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
			case CheckcfgPackage.CHECK_CONFIGURATION__LABEL:
				return getLabel();
			case CheckcfgPackage.CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS:
				return getCatalogConfigurations();
			case CheckcfgPackage.CHECK_CONFIGURATION__NAME:
				return getName();
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
			case CheckcfgPackage.CHECK_CONFIGURATION__LABEL:
				setLabel((String)newValue);
				return;
			case CheckcfgPackage.CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS:
				getCatalogConfigurations().clear();
				getCatalogConfigurations().addAll((Collection<? extends ConfiguredCatalog>)newValue);
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
			case CheckcfgPackage.CHECK_CONFIGURATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CheckcfgPackage.CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS:
				getCatalogConfigurations().clear();
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
			case CheckcfgPackage.CHECK_CONFIGURATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CheckcfgPackage.CHECK_CONFIGURATION__CATALOG_CONFIGURATIONS:
				return catalogConfigurations != null && !catalogConfigurations.isEmpty();
			case CheckcfgPackage.CHECK_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //CheckConfigurationImpl
