/**
 */
package studyProgramStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.SemesterCourse#getStatus <em>Status</em>}</li>
 *   <li>{@link studyProgramStructure.SemesterCourse#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getSemesterCourse()
 * @model
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemesterCourse_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link studyProgramStructure.SemesterCourse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference.
	 * @see #setCourse(Course)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getSemesterCourse_Course()
	 * @model containment="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyProgramStructure.SemesterCourse#getCourse <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' containment reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // SemesterCourse
