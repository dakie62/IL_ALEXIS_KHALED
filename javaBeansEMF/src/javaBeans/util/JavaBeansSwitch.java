/**
 */
package javaBeans.util;

import javaBeans.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see javaBeans.JavaBeansPackage
 * @generated
 */
public class JavaBeansSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaBeansPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBeansSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaBeansPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaBeansPackage.EVENEMENT: {
				Evenement evenement = (Evenement)theEObject;
				T result = caseEvenement(evenement);
				if (result == null) result = caseElementModele(evenement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.PROPRIETE_BEAN: {
				ProprieteBean proprieteBean = (ProprieteBean)theEObject;
				T result = caseProprieteBean(proprieteBean);
				if (result == null) result = casePropriete(proprieteBean);
				if (result == null) result = caseElementModele(proprieteBean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.ELEMENT_MODELE: {
				ElementModele elementModele = (ElementModele)theEObject;
				T result = caseElementModele(elementModele);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.COMPOSANT: {
				Composant composant = (Composant)theEObject;
				T result = caseComposant(composant);
				if (result == null) result = caseElementModele(composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.PROPRIETE_PRIMITIVE: {
				ProprietePrimitive proprietePrimitive = (ProprietePrimitive)theEObject;
				T result = caseProprietePrimitive(proprietePrimitive);
				if (result == null) result = casePropriete(proprietePrimitive);
				if (result == null) result = caseElementModele(proprietePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.PROPRIETE: {
				Propriete propriete = (Propriete)theEObject;
				T result = casePropriete(propriete);
				if (result == null) result = caseElementModele(propriete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.ARCHIVE: {
				Archive archive = (Archive)theEObject;
				T result = caseArchive(archive);
				if (result == null) result = caseElementModele(archive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.METHODE: {
				Methode methode = (Methode)theEObject;
				T result = caseMethode(methode);
				if (result == null) result = caseElementModele(methode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaBeansPackage.PAQUETAGE: {
				Paquetage paquetage = (Paquetage)theEObject;
				T result = casePaquetage(paquetage);
				if (result == null) result = caseElementModele(paquetage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evenement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvenement(Evenement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propriete Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriete Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprieteBean(ProprieteBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Modele</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Modele</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementModele(ElementModele object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propriete Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriete Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProprietePrimitive(ProprietePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propriete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropriete(Propriete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive(Archive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethode(Methode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paquetage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paquetage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaquetage(Paquetage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JavaBeansSwitch
