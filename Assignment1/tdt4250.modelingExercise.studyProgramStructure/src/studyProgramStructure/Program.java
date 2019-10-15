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
 *   <li>{@link studyProgramStructure.Program#getNumOfSemestersForBaseSpecialization <em>Num Of Semesters For Base Specialization</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.Program#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='programHasEnoughSemesters baseSpecializationHasEnoughSemesters'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 baseSpecializationHasEnoughSemesters='self.semesters -&gt; size() == self.numOfSemestersForBaseSpecialization'"
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Num Of Semesters For Base Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Semesters For Base Specialization</em>' attribute.
	 * @see #setNumOfSemestersForBaseSpecialization(int)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_NumOfSemestersForBaseSpecialization()
	 * @model
	 * @generated
	 */
	int getNumOfSemestersForBaseSpecialization();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Program#getNumOfSemestersForBaseSpecialization <em>Num Of Semesters For Base Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Semesters For Base Specialization</em>' attribute.
	 * @see #getNumOfSemestersForBaseSpecialization()
	 * @generated
	 */
	void setNumOfSemestersForBaseSpecialization(int value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.Specialization}.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Specialization#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Specializations()
	 * @see studyProgramStructure.Specialization#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.Semester}.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_Semesters()
	 * @see studyProgramStructure.Semester#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Num Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Semesters</em>' attribute.
	 * @see #setNumOfSemesters(int)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getProgram_NumOfSemesters()
	 * @model required="true"
	 * @generated
	 */
	int getNumOfSemesters();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Program#getNumOfSemesters <em>Num Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Semesters</em>' attribute.
	 * @see #getNumOfSemesters()
	 * @generated
	 */
	void setNumOfSemesters(int value);

} // Program
