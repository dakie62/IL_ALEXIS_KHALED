/**
 */
package javaBeans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paquetage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.Paquetage#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getPaquetage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniciteNoms conventionNommage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniciteNoms='self.elements->forAll( e1, e2 : ElementModele |\n\t\t\t\t\t\t\te1.nom = e2.nom implies e1=e2)' conventionNommage='self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()'"
 * @generated
 */
public interface Paquetage extends ElementModele {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link javaBeans.ElementModele}.
	 * It is bidirectional and its opposite is '{@link javaBeans.ElementModele#getProprietaire <em>Proprietaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see javaBeans.JavaBeansPackage#getPaquetage_Elements()
	 * @see javaBeans.ElementModele#getProprietaire
	 * @model opposite="proprietaire" containment="true"
	 * @generated
	 */
	EList<ElementModele> getElements();

} // Paquetage
