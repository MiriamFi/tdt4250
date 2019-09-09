/**
 */
package studyProgramStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.Program#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getCode <em>Code</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getDegree <em>Degree</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Program#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Num Of Semesters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Semesters</em>' attribute list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_NumOfSemesters()
	 * @model
	 * @generated
	 */
	EList<Integer> getNumOfSemesters();

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Degree()
	 * @model
	 * @generated
	 */
	String getDegree();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Program#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(String value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.Specialisation}.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Specialisation#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Specialisations()
	 * @see studyProgramStructure.Specialisation#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference.
	 * @see #setSemesters(Semester)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Semesters()
	 * @see studyProgramStructure.Semester#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	Semester getSemesters();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Program#getSemesters <em>Semesters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semesters</em>' containment reference.
	 * @see #getSemesters()
	 * @generated
	 */
	void setSemesters(Semester value);

} // Program
