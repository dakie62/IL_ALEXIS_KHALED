/**
 */
package javaBeans.impl;

import javaBeans.Archive;
import javaBeans.Composant;
import javaBeans.ElementModele;
import javaBeans.Evenement;
import javaBeans.JavaBeansFactory;
import javaBeans.JavaBeansPackage;
import javaBeans.Methode;
import javaBeans.ModeAcces;
import javaBeans.Paquetage;
import javaBeans.Primitive;
import javaBeans.Property;
import javaBeans.Propriete;
import javaBeans.ProprieteBean;
import javaBeans.ProprietePrimitive;

import javaBeans.util.JavaBeansValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaBeansPackageImpl extends EPackageImpl implements JavaBeansPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evenementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteBeanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementModeleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprietePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proprieteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paquetageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeAccesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see javaBeans.JavaBeansPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaBeansPackageImpl() {
		super(eNS_URI, JavaBeansFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JavaBeansPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaBeansPackage init() {
		if (isInited) return (JavaBeansPackage)EPackage.Registry.INSTANCE.getEPackage(JavaBeansPackage.eNS_URI);

		// Obtain or create and register package
		JavaBeansPackageImpl theJavaBeansPackage = (JavaBeansPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaBeansPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaBeansPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJavaBeansPackage.createPackageContents();

		// Initialize created meta-data
		theJavaBeansPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theJavaBeansPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return JavaBeansValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theJavaBeansPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaBeansPackage.eNS_URI, theJavaBeansPackage);
		return theJavaBeansPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvenement() {
		return evenementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProprieteBean() {
		return proprieteBeanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProprieteBean_Composant() {
		return (EReference)proprieteBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementModele() {
		return elementModeleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementModele_Nom() {
		return (EAttribute)elementModeleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementModele_Proprietaire() {
		return (EReference)elementModeleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposant() {
		return composantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Proprietes() {
		return (EReference)composantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Methodes() {
		return (EReference)composantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Declenche() {
		return (EReference)composantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposant_Ecoute() {
		return (EReference)composantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProprietePrimitive() {
		return proprietePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProprietePrimitive_Primitive() {
		return (EAttribute)proprietePrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropriete() {
		return proprieteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropriete_Property() {
		return (EAttribute)proprieteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchive() {
		return archiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchive_Paquetage() {
		return (EReference)archiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethode() {
		return methodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethode_ModeAcces() {
		return (EAttribute)methodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaquetage() {
		return paquetageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaquetage_Elements() {
		return (EReference)paquetageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeAcces() {
		return modeAccesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitive() {
		return primitiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProperty() {
		return propertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBeansFactory getJavaBeansFactory() {
		return (JavaBeansFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		evenementEClass = createEClass(EVENEMENT);

		proprieteBeanEClass = createEClass(PROPRIETE_BEAN);
		createEReference(proprieteBeanEClass, PROPRIETE_BEAN__COMPOSANT);

		elementModeleEClass = createEClass(ELEMENT_MODELE);
		createEAttribute(elementModeleEClass, ELEMENT_MODELE__NOM);
		createEReference(elementModeleEClass, ELEMENT_MODELE__PROPRIETAIRE);

		composantEClass = createEClass(COMPOSANT);
		createEReference(composantEClass, COMPOSANT__PROPRIETES);
		createEReference(composantEClass, COMPOSANT__METHODES);
		createEReference(composantEClass, COMPOSANT__DECLENCHE);
		createEReference(composantEClass, COMPOSANT__ECOUTE);

		proprietePrimitiveEClass = createEClass(PROPRIETE_PRIMITIVE);
		createEAttribute(proprietePrimitiveEClass, PROPRIETE_PRIMITIVE__PRIMITIVE);

		proprieteEClass = createEClass(PROPRIETE);
		createEAttribute(proprieteEClass, PROPRIETE__PROPERTY);

		archiveEClass = createEClass(ARCHIVE);
		createEReference(archiveEClass, ARCHIVE__PAQUETAGE);

		methodeEClass = createEClass(METHODE);
		createEAttribute(methodeEClass, METHODE__MODE_ACCES);

		paquetageEClass = createEClass(PAQUETAGE);
		createEReference(paquetageEClass, PAQUETAGE__ELEMENTS);

		// Create enums
		modeAccesEEnum = createEEnum(MODE_ACCES);
		primitiveEEnum = createEEnum(PRIMITIVE);
		propertyEEnum = createEEnum(PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evenementEClass.getESuperTypes().add(this.getElementModele());
		proprieteBeanEClass.getESuperTypes().add(this.getPropriete());
		composantEClass.getESuperTypes().add(this.getElementModele());
		proprietePrimitiveEClass.getESuperTypes().add(this.getPropriete());
		proprieteEClass.getESuperTypes().add(this.getElementModele());
		archiveEClass.getESuperTypes().add(this.getElementModele());
		methodeEClass.getESuperTypes().add(this.getElementModele());
		paquetageEClass.getESuperTypes().add(this.getElementModele());

		// Initialize classes, features, and operations; add parameters
		initEClass(evenementEClass, Evenement.class, "Evenement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proprieteBeanEClass, ProprieteBean.class, "ProprieteBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProprieteBean_Composant(), this.getComposant(), null, "composant", null, 0, 1, ProprieteBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementModeleEClass, ElementModele.class, "ElementModele", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementModele_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, ElementModele.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementModele_Proprietaire(), this.getPaquetage(), this.getPaquetage_Elements(), "proprietaire", null, 0, 1, ElementModele.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantEClass, Composant.class, "Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposant_Proprietes(), this.getPropriete(), null, "proprietes", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Methodes(), this.getMethode(), null, "methodes", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Declenche(), this.getEvenement(), null, "declenche", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Ecoute(), this.getEvenement(), null, "ecoute", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proprietePrimitiveEClass, ProprietePrimitive.class, "ProprietePrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProprietePrimitive_Primitive(), this.getPrimitive(), "primitive", null, 0, 1, ProprietePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proprieteEClass, Propriete.class, "Propriete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropriete_Property(), this.getProperty(), "property", null, 1, 1, Propriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archiveEClass, Archive.class, "Archive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchive_Paquetage(), this.getPaquetage(), null, "paquetage", null, 0, -1, Archive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodeEClass, Methode.class, "Methode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethode_ModeAcces(), this.getModeAcces(), "modeAcces", null, 1, 1, Methode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paquetageEClass, Paquetage.class, "Paquetage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaquetage_Elements(), this.getElementModele(), this.getElementModele_Proprietaire(), "elements", null, 0, -1, Paquetage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeAccesEEnum, ModeAcces.class, "ModeAcces");
		addEEnumLiteral(modeAccesEEnum, ModeAcces.PUBLIQUE);
		addEEnumLiteral(modeAccesEEnum, ModeAcces.PRIVEE);
		addEEnumLiteral(modeAccesEEnum, ModeAcces.PROTEGE);

		initEEnum(primitiveEEnum, Primitive.class, "Primitive");
		addEEnumLiteral(primitiveEEnum, Primitive.BOOLEAN);
		addEEnumLiteral(primitiveEEnum, Primitive.BYTE);
		addEEnumLiteral(primitiveEEnum, Primitive.CHAR);
		addEEnumLiteral(primitiveEEnum, Primitive.SHORT);
		addEEnumLiteral(primitiveEEnum, Primitive.INT);
		addEEnumLiteral(primitiveEEnum, Primitive.LONG);
		addEEnumLiteral(primitiveEEnum, Primitive.FLOAT);
		addEEnumLiteral(primitiveEEnum, Primitive.DOUBLE);

		initEEnum(propertyEEnum, Property.class, "Property");
		addEEnumLiteral(propertyEEnum, Property.SIMPLE);
		addEEnumLiteral(propertyEEnum, Property.INDEXEE);
		addEEnumLiteral(propertyEEnum, Property.LIÉE);
		addEEnumLiteral(propertyEEnum, Property.CONTRAINTE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (evenementEClass, 
		   source, 
		   new String[] {
			 "constraints", "conventionNommage"
		   });	
		addAnnotation
		  (elementModeleEClass, 
		   source, 
		   new String[] {
			 "constraints", "motsReserves"
		   });	
		addAnnotation
		  (composantEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniciteNomProprietes uniciteNomMethodes"
		   });	
		addAnnotation
		  (proprieteEClass, 
		   source, 
		   new String[] {
			 "constraints", "conventionNommage"
		   });	
		addAnnotation
		  (methodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "conventionNommage"
		   });	
		addAnnotation
		  (paquetageEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniciteNoms conventionNommage"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (evenementEClass, 
		   source, 
		   new String[] {
			 "conventionNommage", "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()"
		   });	
		addAnnotation
		  (elementModeleEClass, 
		   source, 
		   new String[] {
			 "motsReserves", "self.nom <> \'class\' and self.nom <> \'paquetage\'\n\t\tand self.nom <> \'composant\' and self.nom <> \'proprietePrimitive\'\n\t\tand self.nom <> \'propriete\' and self.nom <> \'archive\' and self.nom <> \'methode\'"
		   });	
		addAnnotation
		  (composantEClass, 
		   source, 
		   new String[] {
			 "uniciteNomProprietes", "self.proprietes->forAll( e1,e2 : Propriete |\n\t\t\te1.nom = e2.nom implies e1=e2)",
			 "uniciteNomMethodes", "self.methodes->forAll( e1,e2 : Methode|\n\t\t\te1.nom = e2.nom implies e1=e2)"
		   });	
		addAnnotation
		  (proprieteEClass, 
		   source, 
		   new String[] {
			 "conventionNommage", "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()"
		   });	
		addAnnotation
		  (methodeEClass, 
		   source, 
		   new String[] {
			 "conventionNommage", "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()"
		   });	
		addAnnotation
		  (paquetageEClass, 
		   source, 
		   new String[] {
			 "uniciteNoms", "self.elements->forAll( e1, e2 : ElementModele |\n\t\t\t\t\t\t\te1.nom = e2.nom implies e1=e2)",
			 "conventionNommage", "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getElementModele_Nom(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard"
		   });	
		addAnnotation
		  (getPropriete_Property(), 
		   source, 
		   new String[] {
			 "processing", "skip"
		   });
	}

} //JavaBeansPackageImpl
