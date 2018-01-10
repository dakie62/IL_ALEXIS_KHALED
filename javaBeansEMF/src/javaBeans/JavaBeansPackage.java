/**
 */
package javaBeans;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see javaBeans.JavaBeansFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface JavaBeansPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaBeans";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///javaBeans.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaBeans";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaBeansPackage eINSTANCE = javaBeans.impl.JavaBeansPackageImpl.init();

	/**
	 * The meta object id for the '{@link javaBeans.impl.ArchiveImpl <em>Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.ArchiveImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getArchive()
	 * @generated
	 */
	int ARCHIVE = 6;

	/**
	 * The meta object id for the '{@link javaBeans.impl.ElementModeleImpl <em>Element Modele</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.ElementModeleImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getElementModele()
	 * @generated
	 */
	int ELEMENT_MODELE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MODELE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MODELE__PROPRIETAIRE = 1;

	/**
	 * The number of structural features of the '<em>Element Modele</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MODELE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Modele</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MODELE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.EvenementImpl <em>Evenement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.EvenementImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getEvenement()
	 * @generated
	 */
	int EVENEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__NOM = ELEMENT_MODELE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__PROPRIETAIRE = ELEMENT_MODELE__PROPRIETAIRE;

	/**
	 * The number of structural features of the '<em>Evenement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT_FEATURE_COUNT = ELEMENT_MODELE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evenement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT_OPERATION_COUNT = ELEMENT_MODELE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.ProprieteImpl <em>Propriete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.ProprieteImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getPropriete()
	 * @generated
	 */
	int PROPRIETE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__NOM = ELEMENT_MODELE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__PROPRIETAIRE = ELEMENT_MODELE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__PROPERTY = ELEMENT_MODELE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_FEATURE_COUNT = ELEMENT_MODELE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_OPERATION_COUNT = ELEMENT_MODELE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.ProprieteBeanImpl <em>Propriete Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.ProprieteBeanImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getProprieteBean()
	 * @generated
	 */
	int PROPRIETE_BEAN = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_BEAN__NOM = PROPRIETE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_BEAN__PROPRIETAIRE = PROPRIETE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_BEAN__PROPERTY = PROPRIETE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_BEAN__COMPOSANT = PROPRIETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propriete Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_BEAN_FEATURE_COUNT = PROPRIETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Propriete Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_BEAN_OPERATION_COUNT = PROPRIETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.ComposantImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__NOM = ELEMENT_MODELE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PROPRIETAIRE = ELEMENT_MODELE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PROPRIETES = ELEMENT_MODELE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__METHODES = ELEMENT_MODELE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declenche</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__DECLENCHE = ELEMENT_MODELE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ecoute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__ECOUTE = ELEMENT_MODELE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = ELEMENT_MODELE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = ELEMENT_MODELE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.ProprietePrimitiveImpl <em>Propriete Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.ProprietePrimitiveImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getProprietePrimitive()
	 * @generated
	 */
	int PROPRIETE_PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_PRIMITIVE__NOM = PROPRIETE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_PRIMITIVE__PROPRIETAIRE = PROPRIETE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_PRIMITIVE__PROPERTY = PROPRIETE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_PRIMITIVE__PRIMITIVE = PROPRIETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Propriete Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_PRIMITIVE_FEATURE_COUNT = PROPRIETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Propriete Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_PRIMITIVE_OPERATION_COUNT = PROPRIETE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__NOM = ELEMENT_MODELE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__PROPRIETAIRE = ELEMENT_MODELE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Paquetage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE__PAQUETAGE = ELEMENT_MODELE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FEATURE_COUNT = ELEMENT_MODELE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_OPERATION_COUNT = ELEMENT_MODELE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.MethodeImpl <em>Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.MethodeImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getMethode()
	 * @generated
	 */
	int METHODE = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__NOM = ELEMENT_MODELE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__PROPRIETAIRE = ELEMENT_MODELE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Mode Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__MODE_ACCES = ELEMENT_MODELE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_FEATURE_COUNT = ELEMENT_MODELE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_OPERATION_COUNT = ELEMENT_MODELE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.impl.PaquetageImpl <em>Paquetage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.impl.PaquetageImpl
	 * @see javaBeans.impl.JavaBeansPackageImpl#getPaquetage()
	 * @generated
	 */
	int PAQUETAGE = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETAGE__NOM = ELEMENT_MODELE__NOM;

	/**
	 * The feature id for the '<em><b>Proprietaire</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETAGE__PROPRIETAIRE = ELEMENT_MODELE__PROPRIETAIRE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETAGE__ELEMENTS = ELEMENT_MODELE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paquetage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETAGE_FEATURE_COUNT = ELEMENT_MODELE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paquetage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETAGE_OPERATION_COUNT = ELEMENT_MODELE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaBeans.ModeAcces <em>Mode Acces</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.ModeAcces
	 * @see javaBeans.impl.JavaBeansPackageImpl#getModeAcces()
	 * @generated
	 */
	int MODE_ACCES = 9;

	/**
	 * The meta object id for the '{@link javaBeans.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.Primitive
	 * @see javaBeans.impl.JavaBeansPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 10;

	/**
	 * The meta object id for the '{@link javaBeans.Property <em>Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaBeans.Property
	 * @see javaBeans.impl.JavaBeansPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;


	/**
	 * Returns the meta object for class '{@link javaBeans.Evenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evenement</em>'.
	 * @see javaBeans.Evenement
	 * @generated
	 */
	EClass getEvenement();

	/**
	 * Returns the meta object for class '{@link javaBeans.ProprieteBean <em>Propriete Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete Bean</em>'.
	 * @see javaBeans.ProprieteBean
	 * @generated
	 */
	EClass getProprieteBean();

	/**
	 * Returns the meta object for the reference '{@link javaBeans.ProprieteBean#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composant</em>'.
	 * @see javaBeans.ProprieteBean#getComposant()
	 * @see #getProprieteBean()
	 * @generated
	 */
	EReference getProprieteBean_Composant();

	/**
	 * Returns the meta object for class '{@link javaBeans.ElementModele <em>Element Modele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Modele</em>'.
	 * @see javaBeans.ElementModele
	 * @generated
	 */
	EClass getElementModele();

	/**
	 * Returns the meta object for the attribute '{@link javaBeans.ElementModele#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see javaBeans.ElementModele#getNom()
	 * @see #getElementModele()
	 * @generated
	 */
	EAttribute getElementModele_Nom();

	/**
	 * Returns the meta object for the container reference '{@link javaBeans.ElementModele#getProprietaire <em>Proprietaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Proprietaire</em>'.
	 * @see javaBeans.ElementModele#getProprietaire()
	 * @see #getElementModele()
	 * @generated
	 */
	EReference getElementModele_Proprietaire();

	/**
	 * Returns the meta object for class '{@link javaBeans.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see javaBeans.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the containment reference list '{@link javaBeans.Composant#getProprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proprietes</em>'.
	 * @see javaBeans.Composant#getProprietes()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Proprietes();

	/**
	 * Returns the meta object for the containment reference list '{@link javaBeans.Composant#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodes</em>'.
	 * @see javaBeans.Composant#getMethodes()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Methodes();

	/**
	 * Returns the meta object for the reference list '{@link javaBeans.Composant#getDeclenche <em>Declenche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Declenche</em>'.
	 * @see javaBeans.Composant#getDeclenche()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Declenche();

	/**
	 * Returns the meta object for the reference list '{@link javaBeans.Composant#getEcoute <em>Ecoute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecoute</em>'.
	 * @see javaBeans.Composant#getEcoute()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Ecoute();

	/**
	 * Returns the meta object for class '{@link javaBeans.ProprietePrimitive <em>Propriete Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete Primitive</em>'.
	 * @see javaBeans.ProprietePrimitive
	 * @generated
	 */
	EClass getProprietePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link javaBeans.ProprietePrimitive#getPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see javaBeans.ProprietePrimitive#getPrimitive()
	 * @see #getProprietePrimitive()
	 * @generated
	 */
	EAttribute getProprietePrimitive_Primitive();

	/**
	 * Returns the meta object for class '{@link javaBeans.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete</em>'.
	 * @see javaBeans.Propriete
	 * @generated
	 */
	EClass getPropriete();

	/**
	 * Returns the meta object for the attribute '{@link javaBeans.Propriete#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see javaBeans.Propriete#getProperty()
	 * @see #getPropriete()
	 * @generated
	 */
	EAttribute getPropriete_Property();

	/**
	 * Returns the meta object for class '{@link javaBeans.Archive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive</em>'.
	 * @see javaBeans.Archive
	 * @generated
	 */
	EClass getArchive();

	/**
	 * Returns the meta object for the containment reference list '{@link javaBeans.Archive#getPaquetage <em>Paquetage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paquetage</em>'.
	 * @see javaBeans.Archive#getPaquetage()
	 * @see #getArchive()
	 * @generated
	 */
	EReference getArchive_Paquetage();

	/**
	 * Returns the meta object for class '{@link javaBeans.Methode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methode</em>'.
	 * @see javaBeans.Methode
	 * @generated
	 */
	EClass getMethode();

	/**
	 * Returns the meta object for the attribute '{@link javaBeans.Methode#getModeAcces <em>Mode Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode Acces</em>'.
	 * @see javaBeans.Methode#getModeAcces()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_ModeAcces();

	/**
	 * Returns the meta object for class '{@link javaBeans.Paquetage <em>Paquetage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquetage</em>'.
	 * @see javaBeans.Paquetage
	 * @generated
	 */
	EClass getPaquetage();

	/**
	 * Returns the meta object for the containment reference list '{@link javaBeans.Paquetage#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see javaBeans.Paquetage#getElements()
	 * @see #getPaquetage()
	 * @generated
	 */
	EReference getPaquetage_Elements();

	/**
	 * Returns the meta object for enum '{@link javaBeans.ModeAcces <em>Mode Acces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode Acces</em>'.
	 * @see javaBeans.ModeAcces
	 * @generated
	 */
	EEnum getModeAcces();

	/**
	 * Returns the meta object for enum '{@link javaBeans.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see javaBeans.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

	/**
	 * Returns the meta object for enum '{@link javaBeans.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property</em>'.
	 * @see javaBeans.Property
	 * @generated
	 */
	EEnum getProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaBeansFactory getJavaBeansFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link javaBeans.impl.EvenementImpl <em>Evenement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.EvenementImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getEvenement()
		 * @generated
		 */
		EClass EVENEMENT = eINSTANCE.getEvenement();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.ProprieteBeanImpl <em>Propriete Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.ProprieteBeanImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getProprieteBean()
		 * @generated
		 */
		EClass PROPRIETE_BEAN = eINSTANCE.getProprieteBean();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPRIETE_BEAN__COMPOSANT = eINSTANCE.getProprieteBean_Composant();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.ElementModeleImpl <em>Element Modele</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.ElementModeleImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getElementModele()
		 * @generated
		 */
		EClass ELEMENT_MODELE = eINSTANCE.getElementModele();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_MODELE__NOM = eINSTANCE.getElementModele_Nom();

		/**
		 * The meta object literal for the '<em><b>Proprietaire</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MODELE__PROPRIETAIRE = eINSTANCE.getElementModele_Proprietaire();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.ComposantImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Proprietes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__PROPRIETES = eINSTANCE.getComposant_Proprietes();

		/**
		 * The meta object literal for the '<em><b>Methodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__METHODES = eINSTANCE.getComposant_Methodes();

		/**
		 * The meta object literal for the '<em><b>Declenche</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__DECLENCHE = eINSTANCE.getComposant_Declenche();

		/**
		 * The meta object literal for the '<em><b>Ecoute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__ECOUTE = eINSTANCE.getComposant_Ecoute();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.ProprietePrimitiveImpl <em>Propriete Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.ProprietePrimitiveImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getProprietePrimitive()
		 * @generated
		 */
		EClass PROPRIETE_PRIMITIVE = eINSTANCE.getProprietePrimitive();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE_PRIMITIVE__PRIMITIVE = eINSTANCE.getProprietePrimitive_Primitive();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.ProprieteImpl <em>Propriete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.ProprieteImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getPropriete()
		 * @generated
		 */
		EClass PROPRIETE = eINSTANCE.getPropriete();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRIETE__PROPERTY = eINSTANCE.getPropriete_Property();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.ArchiveImpl <em>Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.ArchiveImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getArchive()
		 * @generated
		 */
		EClass ARCHIVE = eINSTANCE.getArchive();

		/**
		 * The meta object literal for the '<em><b>Paquetage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIVE__PAQUETAGE = eINSTANCE.getArchive_Paquetage();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.MethodeImpl <em>Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.MethodeImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getMethode()
		 * @generated
		 */
		EClass METHODE = eINSTANCE.getMethode();

		/**
		 * The meta object literal for the '<em><b>Mode Acces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__MODE_ACCES = eINSTANCE.getMethode_ModeAcces();

		/**
		 * The meta object literal for the '{@link javaBeans.impl.PaquetageImpl <em>Paquetage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.impl.PaquetageImpl
		 * @see javaBeans.impl.JavaBeansPackageImpl#getPaquetage()
		 * @generated
		 */
		EClass PAQUETAGE = eINSTANCE.getPaquetage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETAGE__ELEMENTS = eINSTANCE.getPaquetage_Elements();

		/**
		 * The meta object literal for the '{@link javaBeans.ModeAcces <em>Mode Acces</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.ModeAcces
		 * @see javaBeans.impl.JavaBeansPackageImpl#getModeAcces()
		 * @generated
		 */
		EEnum MODE_ACCES = eINSTANCE.getModeAcces();

		/**
		 * The meta object literal for the '{@link javaBeans.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.Primitive
		 * @see javaBeans.impl.JavaBeansPackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link javaBeans.Property <em>Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaBeans.Property
		 * @see javaBeans.impl.JavaBeansPackageImpl#getProperty()
		 * @generated
		 */
		EEnum PROPERTY = eINSTANCE.getProperty();

	}

} //JavaBeansPackage
