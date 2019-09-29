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
 *   <li>{@link studyProgramStructure.Semester#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link studyProgramStructure.Semester#getNeededCredits <em>Needed Credits</em>}</li>
 *   <li>{@link studyProgramStructure.Semester#getChosenCourses <em>Chosen Courses</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='creditsShouldBe30'"
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see #setSeason(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	String getSeason();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(String value);

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
	 * Returns the value of the '<em><b>Specialisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Specialisation#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' container reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_Specialisation()
	 * @see studyProgramStructure.Specialisation#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getSpecialisation <em>Specialisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' container reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Needed Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Credits</em>' attribute.
	 * @see #setNeededCredits(float)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_NeededCredits()
	 * @model
	 * @generated
	 */
	float getNeededCredits();

	/**
	 * Sets the value of the '{@link studyProgramStructure.Semester#getNeededCredits <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed Credits</em>' attribute.
	 * @see #getNeededCredits()
	 * @generated
	 */
	void setNeededCredits(float value);

	/**
	 * Returns the value of the '<em><b>Chosen Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.SemesterCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen Courses</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemester_ChosenCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemesterCourse> getChosenCourses();

} // Semester
