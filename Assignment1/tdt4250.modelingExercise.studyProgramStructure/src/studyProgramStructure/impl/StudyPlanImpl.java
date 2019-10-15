/**
 */
package studyProgramStructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyProgramStructure.CourseAllocation;
import studyProgramStructure.Semester;
import studyProgramStructure.Student;
import studyProgramStructure.StudyPlan;
import studyProgramStructure.StudyProgramStructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.impl.StudyPlanImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.StudyPlanImpl#getCourseAllocation <em>Course Allocation</em>}</li>
 *   <li>{@link studyProgramStructure.impl.StudyPlanImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getCourseAllocation() <em>Course Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseAllocation> courseAllocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramStructurePackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectResolvingEList<Semester>(Semester.class, this, StudyProgramStructurePackage.STUDY_PLAN__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseAllocation> getCourseAllocation() {
		if (courseAllocation == null) {
			courseAllocation = new EObjectContainmentEList<CourseAllocation>(CourseAllocation.class, this, StudyProgramStructurePackage.STUDY_PLAN__COURSE_ALLOCATION);
		}
		return courseAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (eContainerFeatureID() != StudyProgramStructurePackage.STUDY_PLAN__STUDENT) return null;
		return (Student)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Student newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, StudyProgramStructurePackage.STUDY_PLAN__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != StudyProgramStructurePackage.STUDY_PLAN__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, StudyProgramStructurePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.STUDY_PLAN__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Student)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramStructurePackage.STUDY_PLAN__COURSE_ALLOCATION:
				return ((InternalEList<?>)getCourseAllocation()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				return basicSetStudent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				return eInternalContainer().eInverseRemove(this, StudyProgramStructurePackage.STUDENT__STUDY_PLAN, Student.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgramStructurePackage.STUDY_PLAN__SEMESTERS:
				return getSemesters();
			case StudyProgramStructurePackage.STUDY_PLAN__COURSE_ALLOCATION:
				return getCourseAllocation();
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				return getStudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyProgramStructurePackage.STUDY_PLAN__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyProgramStructurePackage.STUDY_PLAN__COURSE_ALLOCATION:
				getCourseAllocation().clear();
				getCourseAllocation().addAll((Collection<? extends CourseAllocation>)newValue);
				return;
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				setStudent((Student)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyProgramStructurePackage.STUDY_PLAN__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyProgramStructurePackage.STUDY_PLAN__COURSE_ALLOCATION:
				getCourseAllocation().clear();
				return;
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				setStudent((Student)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyProgramStructurePackage.STUDY_PLAN__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyProgramStructurePackage.STUDY_PLAN__COURSE_ALLOCATION:
				return courseAllocation != null && !courseAllocation.isEmpty();
			case StudyProgramStructurePackage.STUDY_PLAN__STUDENT:
				return getStudent() != null;
		}
		return super.eIsSet(featureID);
	}

} //StudyPlanImpl
