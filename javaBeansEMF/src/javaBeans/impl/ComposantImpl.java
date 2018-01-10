/**
 */
package javaBeans.impl;

import java.util.Collection;

import javaBeans.Composant;
import javaBeans.Evenement;
import javaBeans.JavaBeansPackage;
import javaBeans.Methode;
import javaBeans.Propriete;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.impl.ComposantImpl#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link javaBeans.impl.ComposantImpl#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link javaBeans.impl.ComposantImpl#getDeclenche <em>Declenche</em>}</li>
 *   <li>{@link javaBeans.impl.ComposantImpl#getEcoute <em>Ecoute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends ElementModeleImpl implements Composant {
	/**
	 * The cached value of the '{@link #getProprietes() <em>Proprietes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProprietes()
	 * @generated
	 * @ordered
	 */
	protected EList<Propriete> proprietes;

	/**
	 * The cached value of the '{@link #getMethodes() <em>Methodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Methode> methodes;

	/**
	 * The cached value of the '{@link #getDeclenche() <em>Declenche</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclenche()
	 * @generated
	 * @ordered
	 */
	protected EList<Evenement> declenche;

	/**
	 * The cached value of the '{@link #getEcoute() <em>Ecoute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Evenement> ecoute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBeansPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propriete> getProprietes() {
		if (proprietes == null) {
			proprietes = new EObjectContainmentEList<Propriete>(Propriete.class, this, JavaBeansPackage.COMPOSANT__PROPRIETES);
		}
		return proprietes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Methode> getMethodes() {
		if (methodes == null) {
			methodes = new EObjectContainmentEList<Methode>(Methode.class, this, JavaBeansPackage.COMPOSANT__METHODES);
		}
		return methodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evenement> getDeclenche() {
		if (declenche == null) {
			declenche = new EObjectResolvingEList<Evenement>(Evenement.class, this, JavaBeansPackage.COMPOSANT__DECLENCHE);
		}
		return declenche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evenement> getEcoute() {
		if (ecoute == null) {
			ecoute = new EObjectResolvingEList<Evenement>(Evenement.class, this, JavaBeansPackage.COMPOSANT__ECOUTE);
		}
		return ecoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaBeansPackage.COMPOSANT__PROPRIETES:
				return ((InternalEList<?>)getProprietes()).basicRemove(otherEnd, msgs);
			case JavaBeansPackage.COMPOSANT__METHODES:
				return ((InternalEList<?>)getMethodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBeansPackage.COMPOSANT__PROPRIETES:
				return getProprietes();
			case JavaBeansPackage.COMPOSANT__METHODES:
				return getMethodes();
			case JavaBeansPackage.COMPOSANT__DECLENCHE:
				return getDeclenche();
			case JavaBeansPackage.COMPOSANT__ECOUTE:
				return getEcoute();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaBeansPackage.COMPOSANT__PROPRIETES:
				getProprietes().clear();
				getProprietes().addAll((Collection<? extends Propriete>)newValue);
				return;
			case JavaBeansPackage.COMPOSANT__METHODES:
				getMethodes().clear();
				getMethodes().addAll((Collection<? extends Methode>)newValue);
				return;
			case JavaBeansPackage.COMPOSANT__DECLENCHE:
				getDeclenche().clear();
				getDeclenche().addAll((Collection<? extends Evenement>)newValue);
				return;
			case JavaBeansPackage.COMPOSANT__ECOUTE:
				getEcoute().clear();
				getEcoute().addAll((Collection<? extends Evenement>)newValue);
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
			case JavaBeansPackage.COMPOSANT__PROPRIETES:
				getProprietes().clear();
				return;
			case JavaBeansPackage.COMPOSANT__METHODES:
				getMethodes().clear();
				return;
			case JavaBeansPackage.COMPOSANT__DECLENCHE:
				getDeclenche().clear();
				return;
			case JavaBeansPackage.COMPOSANT__ECOUTE:
				getEcoute().clear();
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
			case JavaBeansPackage.COMPOSANT__PROPRIETES:
				return proprietes != null && !proprietes.isEmpty();
			case JavaBeansPackage.COMPOSANT__METHODES:
				return methodes != null && !methodes.isEmpty();
			case JavaBeansPackage.COMPOSANT__DECLENCHE:
				return declenche != null && !declenche.isEmpty();
			case JavaBeansPackage.COMPOSANT__ECOUTE:
				return ecoute != null && !ecoute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposantImpl
