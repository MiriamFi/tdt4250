/**
 */
package studyProgramStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link studyProgramStructure.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link studyProgramStructure.Semester#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link studyProgramStructure.Semester#getProgram <em>Program</em>}</li>
 *   <li>{@link studyProgramStructure.Semester#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mandatoryCoursesWontExceedMandatoryCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link studyProgramStructure.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see studyProgramStructure.Season
	 * @see #setSeason(Season)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_Season()
	 * @model required="true"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see studyProgramStructure.Season
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.CourseGroup}.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.CourseGroup#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_CourseGroups()
	 * @see studyProgramStructure.CourseGroup#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Program#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_Program()
	 * @see studyProgramStructure.Program#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' container reference.
	 * @see #setSpecialization(Specialization)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_Specialization()
	 * @see studyProgramStructure.Specialization#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getSpecialization <em>Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' container reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

} // Semester
