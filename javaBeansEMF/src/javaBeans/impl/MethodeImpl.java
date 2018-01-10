/**
 */
package javaBeans.impl;

import javaBeans.JavaBeansPackage;
import javaBeans.Methode;
import javaBeans.ModeAcces;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.impl.MethodeImpl#getModeAcces <em>Mode Acces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodeImpl extends ElementModeleImpl implements Methode {
	/**
	 * The default value of the '{@link #getModeAcces() <em>Mode Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeAcces()
	 * @generated
	 * @ordered
	 */
	protected static final ModeAcces MODE_ACCES_EDEFAULT = ModeAcces.PUBLIQUE;

	/**
	 * The cached value of the '{@link #getModeAcces() <em>Mode Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeAcces()
	 * @generated
	 * @ordered
	 */
	protected ModeAcces modeAcces = MODE_ACCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBeansPackage.Literals.METHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeAcces getModeAcces() {
		return modeAcces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeAcces(ModeAcces newModeAcces) {
		ModeAcces oldModeAcces = modeAcces;
		modeAcces = newModeAcces == null ? MODE_ACCES_EDEFAULT : newModeAcces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBeansPackage.METHODE__MODE_ACCES, oldModeAcces, modeAcces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBeansPackage.METHODE__MODE_ACCES:
				return getModeAcces();
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
			case JavaBeansPackage.METHODE__MODE_ACCES:
				setModeAcces((ModeAcces)newValue);
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
			case JavaBeansPackage.METHODE__MODE_ACCES:
				setModeAcces(MODE_ACCES_EDEFAULT);
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
			case JavaBeansPackage.METHODE__MODE_ACCES:
				return modeAcces != MODE_ACCES_EDEFAULT;
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
		result.append(" (modeAcces: ");
		result.append(modeAcces);
		result.append(')');
		return result.toString();
	}

} //MethodeImpl
