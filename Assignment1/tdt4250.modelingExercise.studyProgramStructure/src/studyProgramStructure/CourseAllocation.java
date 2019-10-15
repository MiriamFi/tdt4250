/**
 */
package studyProgramStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.CourseAllocation#getGrade <em>Grade</em>}</li>
 *   <li>{@link studyProgramStructure.CourseAllocation#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseAllocation()
 * @model
 * @generated
 */
public interface CourseAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The default value is <code>"A"</code>.
	 * The literals are from the enumeration {@link studyProgramStructure.Grade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see studyProgramStructure.Grade
	 * @see #setGrade(Grade)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseAllocation_Grade()
	 * @model default="A"
	 * @generated
	 */
	Grade getGrade();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseAllocation#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see studyProgramStructure.Grade
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(Grade value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseAllocation_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseAllocation#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CourseAllocation
