/**
 */
package studyProgramStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>degrees</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see studyProgramStructure.StudyProgramStructurePackage#getdegrees()
 * @model
 * @generated
 */
public enum degrees implements Enumerator {
	/**
	 * The '<em><b>Bachelor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR(0, "bachelor", "bachelor"), /**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(1, "master", "master"), /**
	 * The '<em><b>Integrated Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATED_MASTER(2, "integratedMaster", "integratedMaster")
	;

	/**
	 * The '<em><b>Bachelor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR
	 * @model name="bachelor"
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_VALUE = 0;

/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 1;

/**
	 * The '<em><b>Integrated Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTER
	 * @model name="integratedMaster"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATED_MASTER_VALUE = 2;

	/**
	 * An array of all the '<em><b>degrees</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final degrees[] VALUES_ARRAY =
		new degrees[] {
			BACHELOR,
			MASTER,
			INTEGRATED_MASTER,
		};

	/**
	 * A public read-only list of all the '<em><b>degrees</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<degrees> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>degrees</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static degrees get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			degrees result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>degrees</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static degrees getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			degrees result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>degrees</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static degrees get(int value) {
		switch (value) {
			case BACHELOR_VALUE: return BACHELOR;
			case MASTER_VALUE: return MASTER;
			case INTEGRATED_MASTER_VALUE: return INTEGRATED_MASTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private degrees(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //degrees
