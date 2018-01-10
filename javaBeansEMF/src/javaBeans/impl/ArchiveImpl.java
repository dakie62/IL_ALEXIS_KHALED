/**
 */
package javaBeans.impl;

import java.util.Collection;

import javaBeans.Archive;
import javaBeans.JavaBeansPackage;
import javaBeans.Paquetage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.impl.ArchiveImpl#getPaquetage <em>Paquetage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchiveImpl extends ElementModeleImpl implements Archive {
	/**
	 * The cached value of the '{@link #getPaquetage() <em>Paquetage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaquetage()
	 * @generated
	 * @ordered
	 */
	protected EList<Paquetage> paquetage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBeansPackage.Literals.ARCHIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paquetage> getPaquetage() {
		if (paquetage == null) {
			paquetage = new EObjectContainmentEList<Paquetage>(Paquetage.class, this, JavaBeansPackage.ARCHIVE__PAQUETAGE);
		}
		return paquetage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaBeansPackage.ARCHIVE__PAQUETAGE:
				return ((InternalEList<?>)getPaquetage()).basicRemove(otherEnd, msgs);
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
			case JavaBeansPackage.ARCHIVE__PAQUETAGE:
				return getPaquetage();
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
			case JavaBeansPackage.ARCHIVE__PAQUETAGE:
				getPaquetage().clear();
				getPaquetage().addAll((Collection<? extends Paquetage>)newValue);
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
			case JavaBeansPackage.ARCHIVE__PAQUETAGE:
				getPaquetage().clear();
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
			case JavaBeansPackage.ARCHIVE__PAQUETAGE:
				return paquetage != null && !paquetage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchiveImpl
