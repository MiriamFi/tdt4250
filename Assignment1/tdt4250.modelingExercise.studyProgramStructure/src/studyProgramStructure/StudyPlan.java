/**
 */
package studyProgramStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.StudyPlan#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.StudyPlan#getCourseAllocation <em>Course Allocation</em>}</li>
 *   <li>{@link studyProgramStructure.StudyPlan#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getStudyPlan()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterIsValid'"
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link studyProgramStructure.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getStudyPlan_Semesters()
	 * @model
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Course Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link studyProgramStructure.CourseAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Allocation</em>' containment reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getStudyPlan_CourseAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseAllocation> getCourseAllocation();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getStudyPlan_Student()
	 * @see studyProgramStructure.Student#getStudyPlan
	 * @model opposite="studyPlan" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link studyProgramStructure.StudyPlan#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

} // StudyPlan
