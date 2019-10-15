/**
 */
package studyProgramStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.CourseGroup#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#getNumOfNeededCourses <em>Num Of Needed Courses</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#getStatus <em>Status</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#getLevelRestriction <em>Level Restriction</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#getField <em>Field</em>}</li>
 *   <li>{@link studyProgramStructure.CourseGroup#isFromField <em>From Field</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseFromLevel'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseFromLevel='if self.levelRestriction != null then self.courses.course.level==self.levelRestriction else endif' courseFromField='if self.field != null and self.fromField != null then if self.fromField then self.courses.course.code.startWith(self.field) else !self.courses.course.code.startWith(self.field) endif'"
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Num Of Needed Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Needed Courses</em>' attribute.
	 * @see #setNumOfNeededCourses(int)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_NumOfNeededCourses()
	 * @model required="true"
	 * @generated
	 */
	int getNumOfNeededCourses();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#getNumOfNeededCourses <em>Num Of Needed Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Needed Courses</em>' attribute.
	 * @see #getNumOfNeededCourses()
	 * @generated
	 */
	void setNumOfNeededCourses(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyProgramStructure.Semester#getCourseGroups <em>Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_Semester()
	 * @see studyProgramStructure.Semester#getCourseGroups
	 * @model opposite="courseGroups" required="true" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link studyProgramStructure.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link studyProgramStructure.CourseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see studyProgramStructure.CourseStatus
	 * @see #setStatus(CourseStatus)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_Status()
	 * @model required="true"
	 * @generated
	 */
	CourseStatus getStatus();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see studyProgramStructure.CourseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStatus value);

	/**
	 * Returns the value of the '<em><b>Level Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Restriction</em>' attribute.
	 * @see #setLevelRestriction(int)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_LevelRestriction()
	 * @model
	 * @generated
	 */
	int getLevelRestriction();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#getLevelRestriction <em>Level Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Restriction</em>' attribute.
	 * @see #getLevelRestriction()
	 * @generated
	 */
	void setLevelRestriction(int value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_Field()
	 * @model
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>From Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Field</em>' attribute.
	 * @see #setFromField(boolean)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getCourseGroup_FromField()
	 * @model
	 * @generated
	 */
	boolean isFromField();

	/**
	 * Sets the value of the '{@link studyProgramStructure.CourseGroup#isFromField <em>From Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Field</em>' attribute.
	 * @see #isFromField()
	 * @generated
	 */
	void setFromField(boolean value);

} // CourseGroup
