/**
 */
package javaBeans.impl;

import javaBeans.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaBeansFactoryImpl extends EFactoryImpl implements JavaBeansFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaBeansFactory init() {
		try {
			JavaBeansFactory theJavaBeansFactory = (JavaBeansFactory)EPackage.Registry.INSTANCE.getEFactory(JavaBeansPackage.eNS_URI);
			if (theJavaBeansFactory != null) {
				return theJavaBeansFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaBeansFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBeansFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaBeansPackage.EVENEMENT: return createEvenement();
			case JavaBeansPackage.PROPRIETE_BEAN: return createProprieteBean();
			case JavaBeansPackage.ELEMENT_MODELE: return createElementModele();
			case JavaBeansPackage.COMPOSANT: return createComposant();
			case JavaBeansPackage.PROPRIETE_PRIMITIVE: return createProprietePrimitive();
			case JavaBeansPackage.PROPRIETE: return createPropriete();
			case JavaBeansPackage.ARCHIVE: return createArchive();
			case JavaBeansPackage.METHODE: return createMethode();
			case JavaBeansPackage.PAQUETAGE: return createPaquetage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JavaBeansPackage.MODE_ACCES:
				return createModeAccesFromString(eDataType, initialValue);
			case JavaBeansPackage.PRIMITIVE:
				return createPrimitiveFromString(eDataType, initialValue);
			case JavaBeansPackage.PROPERTY:
				return createPropertyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JavaBeansPackage.MODE_ACCES:
				return convertModeAccesToString(eDataType, instanceValue);
			case JavaBeansPackage.PRIMITIVE:
				return convertPrimitiveToString(eDataType, instanceValue);
			case JavaBeansPackage.PROPERTY:
				return convertPropertyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evenement createEvenement() {
		EvenementImpl evenement = new EvenementImpl();
		return evenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprieteBean createProprieteBean() {
		ProprieteBeanImpl proprieteBean = new ProprieteBeanImpl();
		return proprieteBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementModele createElementModele() {
		ElementModeleImpl elementModele = new ElementModeleImpl();
		return elementModele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprietePrimitive createProprietePrimitive() {
		ProprietePrimitiveImpl proprietePrimitive = new ProprietePrimitiveImpl();
		return proprietePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriete createPropriete() {
		ProprieteImpl propriete = new ProprieteImpl();
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Methode createMethode() {
		MethodeImpl methode = new MethodeImpl();
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquetage createPaquetage() {
		PaquetageImpl paquetage = new PaquetageImpl();
		return paquetage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeAcces createModeAccesFromString(EDataType eDataType, String initialValue) {
		ModeAcces result = ModeAcces.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeAccesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitiveFromString(EDataType eDataType, String initialValue) {
		Primitive result = Primitive.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createPropertyFromString(EDataType eDataType, String initialValue) {
		Property result = Property.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBeansPackage getJavaBeansPackage() {
		return (JavaBeansPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaBeansPackage getPackage() {
		return JavaBeansPackage.eINSTANCE;
	}

} //JavaBeansFactoryImpl
