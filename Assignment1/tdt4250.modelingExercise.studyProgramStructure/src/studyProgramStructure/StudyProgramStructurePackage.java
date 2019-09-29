/**
 */
package studyProgramStructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see studyProgramStructure.StudyProgramStructureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface StudyProgramStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyProgramStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tdt4250/modelingExercise/studyProgramStructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tdt4250.modelingExercise.studyProgramStructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyProgramStructurePackage eINSTANCE = studyProgramStructure.impl.StudyProgramStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.CourseImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.ProgramImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CODE = 1;

	/**
	 * The feature id for the '<em><b>Num Of Semesters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NUM_OF_SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DEGREE = 3;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALISATIONS = 4;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMESTERS = 5;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.SpecialisationImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Num Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NUM_OF_SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__PROGRAM = 3;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.SemesterImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEASON = 1;

	/**
	 * The feature id for the '<em><b>Course Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALISATION = 4;

	/**
	 * The feature id for the '<em><b>Needed Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NEEDED_CREDITS = 5;

	/**
	 * The feature id for the '<em><b>Chosen Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__CHOSEN_COURSES = 6;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.CourseGroupImpl <em>Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.CourseGroupImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getCourseGroup()
	 * @generated
	 */
	int COURSE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Num Of Needed Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__NUM_OF_NEEDED_COURSES = 2;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Level Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__LEVEL_RESTRICTION = 4;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__FIELD = 5;

	/**
	 * The feature id for the '<em><b>From Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP__FROM_FIELD = 6;

	/**
	 * The number of structural features of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.StudyPlanImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 5;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__PROGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.impl.SemesterCourseImpl <em>Semester Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.impl.SemesterCourseImpl
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getSemesterCourse()
	 * @generated
	 */
	int SEMESTER_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__COURSE = 1;

	/**
	 * The number of structural features of the '<em>Semester Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semester Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link studyProgramStructure.degrees <em>degrees</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see studyProgramStructure.degrees
	 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getdegrees()
	 * @generated
	 */
	int DEGREES = 7;


	/**
	 * Returns the meta object for class '{@link studyProgramStructure.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see studyProgramStructure.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyProgramStructure.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see studyProgramStructure.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see studyProgramStructure.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see studyProgramStructure.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link studyProgramStructure.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see studyProgramStructure.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyProgramStructure.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Program#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see studyProgramStructure.Program#getCode()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Code();

	/**
	 * Returns the meta object for the attribute list '{@link studyProgramStructure.Program#getNumOfSemesters <em>Num Of Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Num Of Semesters</em>'.
	 * @see studyProgramStructure.Program#getNumOfSemesters()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_NumOfSemesters();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Program#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see studyProgramStructure.Program#getDegree()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Degree();

	/**
	 * Returns the meta object for the containment reference list '{@link studyProgramStructure.Program#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see studyProgramStructure.Program#getSpecialisations()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specialisations();

	/**
	 * Returns the meta object for the containment reference '{@link studyProgramStructure.Program#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semesters</em>'.
	 * @see studyProgramStructure.Program#getSemesters()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Semesters();

	/**
	 * Returns the meta object for class '{@link studyProgramStructure.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see studyProgramStructure.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyProgramStructure.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Specialisation#getNumOfSemesters <em>Num Of Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Semesters</em>'.
	 * @see studyProgramStructure.Specialisation#getNumOfSemesters()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_NumOfSemesters();

	/**
	 * Returns the meta object for the containment reference '{@link studyProgramStructure.Specialisation#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semesters</em>'.
	 * @see studyProgramStructure.Specialisation#getSemesters()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Semesters();

	/**
	 * Returns the meta object for the container reference '{@link studyProgramStructure.Specialisation#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see studyProgramStructure.Specialisation#getProgram()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Program();

	/**
	 * Returns the meta object for class '{@link studyProgramStructure.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see studyProgramStructure.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see studyProgramStructure.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Semester#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see studyProgramStructure.Semester#getSeason()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Season();

	/**
	 * Returns the meta object for the containment reference list '{@link studyProgramStructure.Semester#getCourseGroups <em>Course Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Groups</em>'.
	 * @see studyProgramStructure.Semester#getCourseGroups()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseGroups();

	/**
	 * Returns the meta object for the container reference '{@link studyProgramStructure.Semester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see studyProgramStructure.Semester#getProgram()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Program();

	/**
	 * Returns the meta object for the container reference '{@link studyProgramStructure.Semester#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specialisation</em>'.
	 * @see studyProgramStructure.Semester#getSpecialisation()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialisation();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.Semester#getNeededCredits <em>Needed Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needed Credits</em>'.
	 * @see studyProgramStructure.Semester#getNeededCredits()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_NeededCredits();

	/**
	 * Returns the meta object for the containment reference list '{@link studyProgramStructure.Semester#getChosenCourses <em>Chosen Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chosen Courses</em>'.
	 * @see studyProgramStructure.Semester#getChosenCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_ChosenCourses();

	/**
	 * Returns the meta object for class '{@link studyProgramStructure.CourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Group</em>'.
	 * @see studyProgramStructure.CourseGroup
	 * @generated
	 */
	EClass getCourseGroup();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.CourseGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see studyProgramStructure.CourseGroup#getName()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link studyProgramStructure.CourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see studyProgramStructure.CourseGroup#getCourses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Courses();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.CourseGroup#getNumOfNeededCourses <em>Num Of Needed Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Needed Courses</em>'.
	 * @see studyProgramStructure.CourseGroup#getNumOfNeededCourses()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_NumOfNeededCourses();

	/**
	 * Returns the meta object for the container reference '{@link studyProgramStructure.CourseGroup#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see studyProgramStructure.CourseGroup#getSemester()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EReference getCourseGroup_Semester();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.CourseGroup#getLevelRestriction <em>Level Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Restriction</em>'.
	 * @see studyProgramStructure.CourseGroup#getLevelRestriction()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_LevelRestriction();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.CourseGroup#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see studyProgramStructure.CourseGroup#getField()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_Field();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.CourseGroup#isFromField <em>From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Field</em>'.
	 * @see studyProgramStructure.CourseGroup#isFromField()
	 * @see #getCourseGroup()
	 * @generated
	 */
	EAttribute getCourseGroup_FromField();

	/**
	 * Returns the meta object for class '{@link studyProgramStructure.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see studyProgramStructure.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the containment reference '{@link studyProgramStructure.StudyPlan#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programs</em>'.
	 * @see studyProgramStructure.StudyPlan#getPrograms()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Programs();

	/**
	 * Returns the meta object for class '{@link studyProgramStructure.SemesterCourse <em>Semester Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Course</em>'.
	 * @see studyProgramStructure.SemesterCourse
	 * @generated
	 */
	EClass getSemesterCourse();

	/**
	 * Returns the meta object for the attribute '{@link studyProgramStructure.SemesterCourse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see studyProgramStructure.SemesterCourse#getStatus()
	 * @see #getSemesterCourse()
	 * @generated
	 */
	EAttribute getSemesterCourse_Status();

	/**
	 * Returns the meta object for the containment reference '{@link studyProgramStructure.SemesterCourse#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course</em>'.
	 * @see studyProgramStructure.SemesterCourse#getCourse()
	 * @see #getSemesterCourse()
	 * @generated
	 */
	EReference getSemesterCourse_Course();

	/**
	 * Returns the meta object for enum '{@link studyProgramStructure.degrees <em>degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>degrees</em>'.
	 * @see studyProgramStructure.degrees
	 * @generated
	 */
	EEnum getdegrees();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyProgramStructureFactory getStudyProgramStructureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.CourseImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.ProgramImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CODE = eINSTANCE.getProgram_Code();

		/**
		 * The meta object literal for the '<em><b>Num Of Semesters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NUM_OF_SEMESTERS = eINSTANCE.getProgram_NumOfSemesters();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__DEGREE = eINSTANCE.getProgram_Degree();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALISATIONS = eINSTANCE.getProgram_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SEMESTERS = eINSTANCE.getProgram_Semesters();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.SpecialisationImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Num Of Semesters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NUM_OF_SEMESTERS = eINSTANCE.getSpecialisation_NumOfSemesters();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTERS = eINSTANCE.getSpecialisation_Semesters();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__PROGRAM = eINSTANCE.getSpecialisation_Program();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.SemesterImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEASON = eINSTANCE.getSemester_Season();

		/**
		 * The meta object literal for the '<em><b>Course Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_GROUPS = eINSTANCE.getSemester_CourseGroups();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAM = eINSTANCE.getSemester_Program();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALISATION = eINSTANCE.getSemester_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Needed Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NEEDED_CREDITS = eINSTANCE.getSemester_NeededCredits();

		/**
		 * The meta object literal for the '<em><b>Chosen Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__CHOSEN_COURSES = eINSTANCE.getSemester_ChosenCourses();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.CourseGroupImpl <em>Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.CourseGroupImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getCourseGroup()
		 * @generated
		 */
		EClass COURSE_GROUP = eINSTANCE.getCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__NAME = eINSTANCE.getCourseGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__COURSES = eINSTANCE.getCourseGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Num Of Needed Courses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__NUM_OF_NEEDED_COURSES = eINSTANCE.getCourseGroup_NumOfNeededCourses();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_GROUP__SEMESTER = eINSTANCE.getCourseGroup_Semester();

		/**
		 * The meta object literal for the '<em><b>Level Restriction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__LEVEL_RESTRICTION = eINSTANCE.getCourseGroup_LevelRestriction();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__FIELD = eINSTANCE.getCourseGroup_Field();

		/**
		 * The meta object literal for the '<em><b>From Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_GROUP__FROM_FIELD = eINSTANCE.getCourseGroup_FromField();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.StudyPlanImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__PROGRAMS = eINSTANCE.getStudyPlan_Programs();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.impl.SemesterCourseImpl <em>Semester Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.impl.SemesterCourseImpl
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getSemesterCourse()
		 * @generated
		 */
		EClass SEMESTER_COURSE = eINSTANCE.getSemesterCourse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_COURSE__STATUS = eINSTANCE.getSemesterCourse_Status();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE__COURSE = eINSTANCE.getSemesterCourse_Course();

		/**
		 * The meta object literal for the '{@link studyProgramStructure.degrees <em>degrees</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see studyProgramStructure.degrees
		 * @see studyProgramStructure.impl.StudyProgramStructurePackageImpl#getdegrees()
		 * @generated
		 */
		EEnum DEGREES = eINSTANCE.getdegrees();

	}

} //StudyProgramStructurePackage
