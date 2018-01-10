/**
 */
package javaBeans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaBeans.Archive#getPaquetage <em>Paquetage</em>}</li>
 * </ul>
 *
 * @see javaBeans.JavaBeansPackage#getArchive()
 * @model
 * @generated
 */
public interface Archive extends ElementModele {
	/**
	 * Returns the value of the '<em><b>Paquetage</b></em>' containment reference list.
	 * The list contents are of type {@link javaBeans.Paquetage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paquetage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquetage</em>' containment reference list.
	 * @see javaBeans.JavaBeansPackage#getArchive_Paquetage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paquetage> getPaquetage();

} // Archive
