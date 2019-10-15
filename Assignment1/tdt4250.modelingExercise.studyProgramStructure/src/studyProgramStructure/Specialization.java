/**
 */
package studyProgramStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.Specialization#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.Specialization#getFurtherSpecializations <em>Further Specializations</em>}</li>
 *   <li>{@link studyProgramStructure.Specialization#getBaseSpecialization <em>Base Specialization</em>}</li>
 *   <li>{@link studyProgramStructure.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.Specialization#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasEnoughSemesters'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 hasEnoughSemesters='self.semesters -&gt; size() = self.numOfSemesters'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialization#getName <em>Name</em>}' attribute.
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
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization_NumOfSemesters()
	 * @model
	 * @generated
	 */
	int getNumOfSemesters();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialization#getNumOfSemesters <em>Num Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Semesters</em>' attribute.
	 * @see #getNumOfSemesters()
	 * @generated
	 */
	void setNumOfSemesters(int value);

	/**
	 * Returns the value of the '<em><b>Further Specializations</b></em>' reference list.
	 * The list contents are of type {@link studyProgramStructure.Specialization}.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Specialization#getBaseSpecialization <em>Base Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Specializations</em>' reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization_FurtherSpecializations()
	 * @see studyProgramStructure.Specialization#getBaseSpecialization
	 * @model opposite="baseSpecialization"
	 * @generated
	 */
	EList<Specialization> getFurtherSpecializations();

	/**
	 * Returns the value of the '<em><b>Base Specialization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Specialization#getFurtherSpecializations <em>Further Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Specialization</em>' reference.
	 * @see #setBaseSpecialization(Specialization)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization_BaseSpecialization()
	 * @see studyProgramStructure.Specialization#getFurtherSpecializations
	 * @model opposite="furtherSpecializations"
	 * @generated
	 */
	Specialization getBaseSpecialization();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialization#getBaseSpecialization <em>Base Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Specialization</em>' reference.
	 * @see #getBaseSpecialization()
	 * @generated
	 */
	void setBaseSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.Semester}.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Semester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization_Semesters()
	 * @see studyProgramStructure.Semester#getSpecialization
	 * @model opposite="specialization" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSpecialization_Program()
	 * @model required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Specialization#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // Specialization
