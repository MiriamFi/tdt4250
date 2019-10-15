/**
 */
package studyProgramStructure.util;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import studyProgramStructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyProgramStructure.StudyProgramStructurePackage
 * @generated
 */
public class StudyProgramStructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyProgramStructureValidator INSTANCE = new StudyProgramStructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyProgramStructure";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramStructureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyProgramStructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyProgramStructurePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyProgramStructurePackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case StudyProgramStructurePackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case StudyProgramStructurePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyProgramStructurePackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case StudyProgramStructurePackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyProgramStructurePackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case StudyProgramStructurePackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case StudyProgramStructurePackage.COURSE_ALLOCATION:
				return validateCourseAllocation((CourseAllocation)value, diagnostics, context);
			case StudyProgramStructurePackage.COURSE_STATUS:
				return validateCourseStatus((CourseStatus)value, diagnostics, context);
			case StudyProgramStructurePackage.GRADE:
				return validateGrade((Grade)value, diagnostics, context);
			case StudyProgramStructurePackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(program, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(program, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_programHasEnoughSemesters(program, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgram_baseSpecializationHasEnoughSemesters(program, diagnostics, context);
		return result;
	}

	/**
	 * Validates the programHasEnoughSemesters constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean validateProgram_programHasEnoughSemesters(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			int semesterSum = 0;
			semesterSum += program.getSemesters().size();
			boolean numOfSemestersIsValid = true;
			ArrayList<Integer> semesterSums = new ArrayList<Integer>();
			for(Specialization specialization : program.getSpecializations()) {
				if(specialization.getBaseSpecialization() == null) {
					semesterSums.addAll( this.sumSemestersInSpecializations(semesterSum, new ArrayList<Integer>(), specialization));
				}
			}
			for (int i = 0; i < semesterSums.size(); i++) {
				if(semesterSums.get(i) != program.getNumOfSemesters()) {
					numOfSemestersIsValid = false;
				}
			}
			if (!numOfSemestersIsValid) {
				if (diagnostics != null) {
					diagnostics.add
					(createDiagnostic
							(Diagnostic.ERROR,
									DIAGNOSTIC_SOURCE,
									0,
									"_UI_GenericConstraint_diagnostic",
									new Object[] { "programHasEnoughSemesters", getObjectLabel(program, context) },
									new Object[] { program },
									context));
				}
				return false;
			}
			return true;
		}catch(NullPointerException e) {
			return true;
		}}

	private ArrayList<Integer> sumSemestersInSpecializations(int semesterSum, ArrayList<Integer> semesterSums, Specialization specialization) {
		if(specialization.getFurtherSpecializations().isEmpty()) {
			semesterSums.add(semesterSum += specialization.getNumOfSemesters());
			return semesterSums;
		}

		for (Specialization furtherSpecialization : specialization.getFurtherSpecializations()) {
			return this.sumSemestersInSpecializations(semesterSum + specialization.getNumOfSemesters(), semesterSums, furtherSpecialization);
		}
		return new ArrayList<Integer>();
		
	}


	/**
	 * The cached validation expression for the baseSpecializationHasEnoughSemesters constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAM__BASE_SPECIALIZATION_HAS_ENOUGH_SEMESTERS__EEXPRESSION = "self.semesters -> size() == self.numOfSemestersForBaseSpecialization";

	/**
	 * Validates the baseSpecializationHasEnoughSemesters constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_baseSpecializationHasEnoughSemesters(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramStructurePackage.Literals.PROGRAM,
				 program,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "baseSpecializationHasEnoughSemesters",
				 PROGRAM__BASE_SPECIALIZATION_HAS_ENOUGH_SEMESTERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(specialization, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpecialization_hasEnoughSemesters(specialization, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasEnoughSemesters constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPECIALIZATION__HAS_ENOUGH_SEMESTERS__EEXPRESSION = "self.semesters -> size() = self.numOfSemesters";

	/**
	 * Validates the hasEnoughSemesters constraint of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization_hasEnoughSemesters(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyProgramStructurePackage.Literals.SPECIALIZATION,
				 specialization,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "hasEnoughSemesters",
				 SPECIALIZATION__HAS_ENOUGH_SEMESTERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_mandatoryCoursesWontExceedMandatoryCredits(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mandatoryCoursesWontExceedMandatoryCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean validateSemester_mandatoryCoursesWontExceedMandatoryCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
				// -> specify the condition that violates the constraint
				// -> verify the diagnostic details, including severity, code, and message
				// Ensure that you remove @generated or mark it @generated NOT
				
				float creditSum = 0;
				float neededCredits = 30;
				
				try {
				for(CourseGroup courseGroup: semester.getCourseGroups()) {
					if(courseGroup.getStatus().getName().equals("mandatory")) {
						for (Course course : courseGroup.getCourses()) {
							creditSum += course.getCredits();
						}
					}
				}
				if (creditSum > neededCredits) {
					if (diagnostics != null) {
						diagnostics.add
							(createDiagnostic
								(Diagnostic.ERROR,
								 DIAGNOSTIC_SOURCE,
								 0,
								 "_UI_GenericConstraint_diagnostic",
								 new Object[] { "mandatoryCoursesWontExceedMandatoryCredits", getObjectLabel(semester, context) },
								 new Object[] { semester },
								 context));
					}
					return false;
				}
				return true;
				}catch(NullPointerException e) {
					return true;
				}
			}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyPlan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyPlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyPlan_semesterIsValid(studyPlan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the semesterIsValid constraint of '<em>Study Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public boolean validateStudyPlan_semesterIsValid(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean semesterIsValid = true;
		try {
			for(Semester semester : studyPlan.getSemesters()){
				
				if(semester.getProgram() != null && semester.getProgram() != studyPlan.getStudent().getProgram()) {
					semesterIsValid = false;
				}
				if(studyPlan.getStudent().getSpecializations() != null && semester.getSpecialization() != null && !studyPlan.getStudent().getSpecializations().contains(semester.getSpecialization())) {
					semesterIsValid = false;
				}
			}
			if (!semesterIsValid) {
				if (diagnostics != null) {
					diagnostics.add
					(createDiagnostic
							(Diagnostic.ERROR,
									DIAGNOSTIC_SOURCE,
									0,
									"_UI_GenericConstraint_diagnostic",
									new Object[] { "semesterIsValid", getObjectLabel(studyPlan, context) },
									new Object[] { studyPlan },
									context));
				}
				return false;
			}
			return true;
		}catch(NullPointerException e) {
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseAllocation(CourseAllocation courseAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseAllocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStatus(CourseStatus courseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrade(Grade grade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyProgramStructureValidator
