/**
 */
package javaBeans.impl;

import javaBeans.Composant;
import javaBeans.JavaBeansPackage;
import javaBeans.ProprieteBean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propriete Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.impl.ProprieteBeanImpl#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProprieteBeanImpl extends ProprieteImpl implements ProprieteBean {
	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected Composant composant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprieteBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBeansPackage.Literals.PROPRIETE_BEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant getComposant() {
		if (composant != null && composant.eIsProxy()) {
			InternalEObject oldComposant = (InternalEObject)composant;
			composant = (Composant)eResolveProxy(oldComposant);
			if (composant != oldComposant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaBeansPackage.PROPRIETE_BEAN__COMPOSANT, oldComposant, composant));
			}
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant basicGetComposant() {
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposant(Composant newComposant) {
		Composant oldComposant = composant;
		composant = newComposant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBeansPackage.PROPRIETE_BEAN__COMPOSANT, oldComposant, composant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBeansPackage.PROPRIETE_BEAN__COMPOSANT:
				if (resolve) return getComposant();
				return basicGetComposant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaBeansPackage.PROPRIETE_BEAN__COMPOSANT:
				setComposant((Composant)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaBeansPackage.PROPRIETE_BEAN__COMPOSANT:
				setComposant((Composant)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaBeansPackage.PROPRIETE_BEAN__COMPOSANT:
				return composant != null;
		}
		return super.eIsSet(featureID);
	}

} //ProprieteBeanImpl
