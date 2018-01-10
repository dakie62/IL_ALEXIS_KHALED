/**
 */
package javaBeans.util;

import java.util.Map;

import javaBeans.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see javaBeans.JavaBeansPackage
 * @generated
 */
public class JavaBeansValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JavaBeansValidator INSTANCE = new JavaBeansValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "javaBeans";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBeansValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return JavaBeansPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case JavaBeansPackage.EVENEMENT:
				return validateEvenement((Evenement)value, diagnostics, context);
			case JavaBeansPackage.PROPRIETE_BEAN:
				return validateProprieteBean((ProprieteBean)value, diagnostics, context);
			case JavaBeansPackage.ELEMENT_MODELE:
				return validateElementModele((ElementModele)value, diagnostics, context);
			case JavaBeansPackage.COMPOSANT:
				return validateComposant((Composant)value, diagnostics, context);
			case JavaBeansPackage.PROPRIETE_PRIMITIVE:
				return validateProprietePrimitive((ProprietePrimitive)value, diagnostics, context);
			case JavaBeansPackage.PROPRIETE:
				return validatePropriete((Propriete)value, diagnostics, context);
			case JavaBeansPackage.ARCHIVE:
				return validateArchive((Archive)value, diagnostics, context);
			case JavaBeansPackage.METHODE:
				return validateMethode((Methode)value, diagnostics, context);
			case JavaBeansPackage.PAQUETAGE:
				return validatePaquetage((Paquetage)value, diagnostics, context);
			case JavaBeansPackage.MODE_ACCES:
				return validateModeAcces((ModeAcces)value, diagnostics, context);
			case JavaBeansPackage.PRIMITIVE:
				return validatePrimitive((Primitive)value, diagnostics, context);
			case JavaBeansPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenement(Evenement evenement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(evenement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(evenement, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvenement_conventionNommage(evenement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the conventionNommage constraint of '<em>Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENEMENT__CONVENTION_NOMMAGE__EEXPRESSION = "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()";

	/**
	 * Validates the conventionNommage constraint of '<em>Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvenement_conventionNommage(Evenement evenement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.EVENEMENT,
				 evenement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "conventionNommage",
				 EVENEMENT__CONVENTION_NOMMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProprieteBean(ProprieteBean proprieteBean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(proprieteBean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(proprieteBean, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropriete_conventionNommage(proprieteBean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementModele(ElementModele elementModele, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementModele, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementModele, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(elementModele, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the motsReserves constraint of '<em>Element Modele</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENT_MODELE__MOTS_RESERVES__EEXPRESSION = "self.nom <> 'class' and self.nom <> 'paquetage'\n" +
		"\t\tand self.nom <> 'composant' and self.nom <> 'proprietePrimitive'\n" +
		"\t\tand self.nom <> 'propriete' and self.nom <> 'archive' and self.nom <> 'methode'";

	/**
	 * Validates the motsReserves constraint of '<em>Element Modele</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementModele_motsReserves(ElementModele elementModele, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.ELEMENT_MODELE,
				 elementModele,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "motsReserves",
				 ELEMENT_MODELE__MOTS_RESERVES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposant(Composant composant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposant_uniciteNomProprietes(composant, diagnostics, context);
		if (result || diagnostics != null) result &= validateComposant_uniciteNomMethodes(composant, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniciteNomProprietes constraint of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSANT__UNICITE_NOM_PROPRIETES__EEXPRESSION = "self.proprietes->forAll( e1,e2 : Propriete |\n" +
		"\t\t\te1.nom = e2.nom implies e1=e2)";

	/**
	 * Validates the uniciteNomProprietes constraint of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposant_uniciteNomProprietes(Composant composant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.COMPOSANT,
				 composant,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniciteNomProprietes",
				 COMPOSANT__UNICITE_NOM_PROPRIETES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniciteNomMethodes constraint of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSANT__UNICITE_NOM_METHODES__EEXPRESSION = "self.methodes->forAll( e1,e2 : Methode|\n" +
		"\t\t\te1.nom = e2.nom implies e1=e2)";

	/**
	 * Validates the uniciteNomMethodes constraint of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposant_uniciteNomMethodes(Composant composant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.COMPOSANT,
				 composant,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniciteNomMethodes",
				 COMPOSANT__UNICITE_NOM_METHODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProprietePrimitive(ProprietePrimitive proprietePrimitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(proprietePrimitive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(proprietePrimitive, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropriete_conventionNommage(proprietePrimitive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropriete(Propriete propriete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propriete, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(propriete, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropriete_conventionNommage(propriete, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the conventionNommage constraint of '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPRIETE__CONVENTION_NOMMAGE__EEXPRESSION = "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()";

	/**
	 * Validates the conventionNommage constraint of '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropriete_conventionNommage(Propriete propriete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.PROPRIETE,
				 propriete,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "conventionNommage",
				 PROPRIETE__CONVENTION_NOMMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchive(Archive archive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(archive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(archive, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(archive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethode(Methode methode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(methode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(methode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMethode_conventionNommage(methode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the conventionNommage constraint of '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METHODE__CONVENTION_NOMMAGE__EEXPRESSION = "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()";

	/**
	 * Validates the conventionNommage constraint of '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethode_conventionNommage(Methode methode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.METHODE,
				 methode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "conventionNommage",
				 METHODE__CONVENTION_NOMMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaquetage(Paquetage paquetage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paquetage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementModele_motsReserves(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePaquetage_uniciteNoms(paquetage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePaquetage_conventionNommage(paquetage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniciteNoms constraint of '<em>Paquetage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAQUETAGE__UNICITE_NOMS__EEXPRESSION = "self.elements->forAll( e1, e2 : ElementModele |\n" +
		"\t\t\t\t\t\t\te1.nom = e2.nom implies e1=e2)";

	/**
	 * Validates the uniciteNoms constraint of '<em>Paquetage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaquetage_uniciteNoms(Paquetage paquetage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.PAQUETAGE,
				 paquetage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniciteNoms",
				 PAQUETAGE__UNICITE_NOMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the conventionNommage constraint of '<em>Paquetage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAQUETAGE__CONVENTION_NOMMAGE__EEXPRESSION = "self.nom.substring(1,1) =  self.nom.substring(1,1).toLower()";

	/**
	 * Validates the conventionNommage constraint of '<em>Paquetage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaquetage_conventionNommage(Paquetage paquetage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(JavaBeansPackage.Literals.PAQUETAGE,
				 paquetage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "conventionNommage",
				 PAQUETAGE__CONVENTION_NOMMAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeAcces(ModeAcces modeAcces, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitive(Primitive primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //JavaBeansValidator
