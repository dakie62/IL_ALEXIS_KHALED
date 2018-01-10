/**
 */
package javaBeans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.Composant#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link javaBeans.Composant#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link javaBeans.Composant#getDeclenche <em>Declenche</em>}</li>
 *   <li>{@link javaBeans.Composant#getEcoute <em>Ecoute</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getComposant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniciteNomProprietes uniciteNomMethodes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniciteNomProprietes='self.proprietes->forAll( e1,e2 : Propriete |\n\t\t\te1.nom = e2.nom implies e1=e2)' uniciteNomMethodes='self.methodes->forAll( e1,e2 : Methode|\n\t\t\te1.nom = e2.nom implies e1=e2)'"
 * @generated
 */
public interface Composant extends ElementModele {
	/**
	 * Returns the value of the '<em><b>Proprietes</b></em>' containment reference list.
	 * The list contents are of type {@link javaBeans.Propriete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proprietes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proprietes</em>' containment reference list.
	 * @see javaBeans.JavaBeansPackage#getComposant_Proprietes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propriete> getProprietes();

	/**
	 * Returns the value of the '<em><b>Methodes</b></em>' containment reference list.
	 * The list contents are of type {@link javaBeans.Methode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodes</em>' containment reference list.
	 * @see javaBeans.JavaBeansPackage#getComposant_Methodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Methode> getMethodes();

	/**
	 * Returns the value of the '<em><b>Declenche</b></em>' reference list.
	 * The list contents are of type {@link javaBeans.Evenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declenche</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declenche</em>' reference list.
	 * @see javaBeans.JavaBeansPackage#getComposant_Declenche()
	 * @model
	 * @generated
	 */
	EList<Evenement> getDeclenche();

	/**
	 * Returns the value of the '<em><b>Ecoute</b></em>' reference list.
	 * The list contents are of type {@link javaBeans.Evenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecoute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecoute</em>' reference list.
	 * @see javaBeans.JavaBeansPackage#getComposant_Ecoute()
	 * @model
	 * @generated
	 */
	EList<Evenement> getEcoute();

} // Composant
