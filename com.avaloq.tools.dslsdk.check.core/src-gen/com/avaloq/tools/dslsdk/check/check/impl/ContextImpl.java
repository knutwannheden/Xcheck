/**
 * <copyright>
 * </copyright>
 *

 */
package com.avaloq.tools.dslsdk.check.check.impl;

import com.avaloq.tools.dslsdk.check.check.CheckPackage;
import com.avaloq.tools.dslsdk.check.check.Context;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.ContextImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.ContextImpl#getIt <em>It</em>}</li>
 *   <li>{@link com.avaloq.tools.dslsdk.check.check.impl.ContextImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends DocumentedImplCustom implements Context
{
	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference contextType;

	/**
	 * The default value of the '{@link #getIt() <em>It</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIt()
	 * @generated
	 * @ordered
	 */
	protected static final String IT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIt() <em>It</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIt()
	 * @generated
	 * @ordered
	 */
	protected String it = IT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected XExpression constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl()
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
		return CheckPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getContextType()
	{
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextType(JvmTypeReference newContextType, NotificationChain msgs)
	{
		JvmTypeReference oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckPackage.CONTEXT__CONTEXT_TYPE, oldContextType, newContextType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(JvmTypeReference newContextType)
	{
		if (newContextType != contextType)
		{
			NotificationChain msgs = null;
			if (contextType != null)
				msgs = ((InternalEObject)contextType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckPackage.CONTEXT__CONTEXT_TYPE, null, msgs);
			if (newContextType != null)
				msgs = ((InternalEObject)newContextType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckPackage.CONTEXT__CONTEXT_TYPE, null, msgs);
			msgs = basicSetContextType(newContextType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CONTEXT__CONTEXT_TYPE, newContextType, newContextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIt()
	{
		return it;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIt(String newIt)
	{
		String oldIt = it;
		it = newIt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CONTEXT__IT, oldIt, it));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getConstraint()
	{
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(XExpression newConstraint, NotificationChain msgs)
	{
		XExpression oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CheckPackage.CONTEXT__CONSTRAINT, oldConstraint, newConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(XExpression newConstraint)
	{
		if (newConstraint != constraint)
		{
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CheckPackage.CONTEXT__CONSTRAINT, null, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CheckPackage.CONTEXT__CONSTRAINT, null, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckPackage.CONTEXT__CONSTRAINT, newConstraint, newConstraint));
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
			case CheckPackage.CONTEXT__CONTEXT_TYPE:
				return basicSetContextType(null, msgs);
			case CheckPackage.CONTEXT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
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
			case CheckPackage.CONTEXT__CONTEXT_TYPE:
				return getContextType();
			case CheckPackage.CONTEXT__IT:
				return getIt();
			case CheckPackage.CONTEXT__CONSTRAINT:
				return getConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CheckPackage.CONTEXT__CONTEXT_TYPE:
				setContextType((JvmTypeReference)newValue);
				return;
			case CheckPackage.CONTEXT__IT:
				setIt((String)newValue);
				return;
			case CheckPackage.CONTEXT__CONSTRAINT:
				setConstraint((XExpression)newValue);
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
			case CheckPackage.CONTEXT__CONTEXT_TYPE:
				setContextType((JvmTypeReference)null);
				return;
			case CheckPackage.CONTEXT__IT:
				setIt(IT_EDEFAULT);
				return;
			case CheckPackage.CONTEXT__CONSTRAINT:
				setConstraint((XExpression)null);
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
			case CheckPackage.CONTEXT__CONTEXT_TYPE:
				return contextType != null;
			case CheckPackage.CONTEXT__IT:
				return IT_EDEFAULT == null ? it != null : !IT_EDEFAULT.equals(it);
			case CheckPackage.CONTEXT__CONSTRAINT:
				return constraint != null;
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
		result.append(" (it: ");
		result.append(it);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
