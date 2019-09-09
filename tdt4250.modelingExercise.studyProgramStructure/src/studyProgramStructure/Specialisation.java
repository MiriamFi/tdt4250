/**
 */
package studyProgramStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.Specialisation#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.Specialisation#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.Specialisation#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Num Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Semesters</em>' attribute.
	 * @see #setNumOfSemesters(int)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialisation_NumOfSemesters()
	 * @model
	 * @generated
	 */
	int getNumOfSemesters();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialisation#getNumOfSemesters <em>Num Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Semesters</em>' attribute.
	 * @see #getNumOfSemesters()
	 * @generated
	 */
	void setNumOfSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Semester#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference.
	 * @see #setSemesters(Semester)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialisation_Semesters()
	 * @see studyProgramStructure.Semester#getSpecialisation
	 * @model opposite="specialisation" containment="true"
	 * @generated
	 */
	Semester getSemesters();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialisation#getSemesters <em>Semesters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semesters</em>' containment reference.
	 * @see #getSemesters()
	 * @generated
	 */
	void setSemesters(Semester value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Program#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialisation_Program()
	 * @see studyProgramStructure.Program#getSpecialisations
	 * @model opposite="specialisations" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialisation#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // Specialisation
