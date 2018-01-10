/**
 */
package javaBeans.impl;

import javaBeans.ElementModele;
import javaBeans.JavaBeansPackage;
import javaBeans.Paquetage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Modele</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.impl.ElementModeleImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link javaBeans.impl.ElementModeleImpl#getProprietaire <em>Proprietaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementModeleImpl extends MinimalEObjectImpl.Container implements ElementModele {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementModeleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBeansPackage.Literals.ELEMENT_MODELE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBeansPackage.ELEMENT_MODELE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquetage getProprietaire() {
		if (eContainerFeatureID() != JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE) return null;
		return (Paquetage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProprietaire(Paquetage newProprietaire, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProprietaire, JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProprietaire(Paquetage newProprietaire) {
		if (newProprietaire != eInternalContainer() || (eContainerFeatureID() != JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE && newProprietaire != null)) {
			if (EcoreUtil.isAncestor(this, newProprietaire))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProprietaire != null)
				msgs = ((InternalEObject)newProprietaire).eInverseAdd(this, JavaBeansPackage.PAQUETAGE__ELEMENTS, Paquetage.class, msgs);
			msgs = basicSetProprietaire(newProprietaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE, newProprietaire, newProprietaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProprietaire((Paquetage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				return basicSetProprietaire(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				return eInternalContainer().eInverseRemove(this, JavaBeansPackage.PAQUETAGE__ELEMENTS, Paquetage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBeansPackage.ELEMENT_MODELE__NOM:
				return getNom();
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				return getProprietaire();
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
			case JavaBeansPackage.ELEMENT_MODELE__NOM:
				setNom((String)newValue);
				return;
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				setProprietaire((Paquetage)newValue);
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
			case JavaBeansPackage.ELEMENT_MODELE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				setProprietaire((Paquetage)null);
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
			case JavaBeansPackage.ELEMENT_MODELE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case JavaBeansPackage.ELEMENT_MODELE__PROPRIETAIRE:
				return getProprietaire() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //ElementModeleImpl
