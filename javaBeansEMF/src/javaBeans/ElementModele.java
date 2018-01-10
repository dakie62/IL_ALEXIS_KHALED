/**
 */
package javaBeans;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Modele</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.ElementModele#getNom <em>Nom</em>}</li>
 *   <li>{@link javaBeans.ElementModele#getProprietaire <em>Proprietaire</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getElementModele()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='motsReserves'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot motsReserves='self.nom <> \'class\' and self.nom <> \'paquetage\'\n\t\tand self.nom <> \'composant\' and self.nom <> \'proprietePrimitive\'\n\t\tand self.nom <> \'propriete\' and self.nom <> \'archive\' and self.nom <> \'methode\''"
 * @generated
 */
public interface ElementModele extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see javaBeans.JavaBeansPackage#getElementModele_Nom()
	 * @model extendedMetaData="kind='attributeWildcard'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link javaBeans.ElementModele#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Proprietaire</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link javaBeans.Paquetage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proprietaire</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proprietaire</em>' container reference.
	 * @see #setProprietaire(Paquetage)
	 * @see javaBeans.JavaBeansPackage#getElementModele_Proprietaire()
	 * @see javaBeans.Paquetage#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	Paquetage getProprietaire();

	/**
	 * Sets the value of the '{@link javaBeans.ElementModele#getProprietaire <em>Proprietaire</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proprietaire</em>' container reference.
	 * @see #getProprietaire()
	 * @generated
	 */
	void setProprietaire(Paquetage value);

} // ElementModele
