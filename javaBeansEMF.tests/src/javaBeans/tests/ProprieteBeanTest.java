/**
 */
package javaBeans.tests;

import javaBeans.JavaBeansFactory;
import javaBeans.ProprieteBean;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propriete Bean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProprieteBeanTest extends ProprieteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProprieteBeanTest.class);
	}

	/**
	 * Constructs a new Propriete Bean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProprieteBeanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Propriete Bean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProprieteBean getFixture() {
		return (ProprieteBean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaBeansFactory.eINSTANCE.createProprieteBean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProprieteBeanTest
