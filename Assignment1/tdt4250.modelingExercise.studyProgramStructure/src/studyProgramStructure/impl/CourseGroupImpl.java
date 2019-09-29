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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyProgramStructure.CourseGroup;
import studyProgramStructure.Semester;
import studyProgramStructure.SemesterCourse;
import studyProgramStructure.StudyProgramStructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#getNumOfNeededCourses <em>Num Of Needed Courses</em>}</li>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#getLevelRestriction <em>Level Restriction</em>}</li>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#getField <em>Field</em>}</li>
 *   <li>{@link studyProgramStructure.impl.CourseGroupImpl#isFromField <em>From Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterCourse> courses;

	/**
	 * The default value of the '{@link #getNumOfNeededCourses() <em>Num Of Needed Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfNeededCourses()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_NEEDED_COURSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfNeededCourses() <em>Num Of Needed Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfNeededCourses()
	 * @generated
	 * @ordered
	 */
	protected int numOfNeededCourses = NUM_OF_NEEDED_COURSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelRestriction() <em>Level Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_RESTRICTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevelRestriction() <em>Level Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRestriction()
	 * @generated
	 * @ordered
	 */
	protected int levelRestriction = LEVEL_RESTRICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected String field = FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #isFromField() <em>From Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROM_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFromField() <em>From Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFromField()
	 * @generated
	 * @ordered
	 */
	protected boolean fromField = FROM_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramStructurePackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.COURSE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemesterCourse> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<SemesterCourse>(SemesterCourse.class, this, StudyProgramStructurePackage.COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumOfNeededCourses() {
		return numOfNeededCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfNeededCourses(int newNumOfNeededCourses) {
		int oldNumOfNeededCourses = numOfNeededCourses;
		numOfNeededCourses = newNumOfNeededCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.COURSE_GROUP__NUM_OF_NEEDED_COURSES, oldNumOfNeededCourses, numOfNeededCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		if (eContainerFeatureID() != StudyProgramStructurePackage.COURSE_GROUP__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, StudyProgramStructurePackage.COURSE_GROUP__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != StudyProgramStructurePackage.COURSE_GROUP__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.COURSE_GROUP__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevelRestriction() {
		return levelRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevelRestriction(int newLevelRestriction) {
		int oldLevelRestriction = levelRestriction;
		levelRestriction = newLevelRestriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.COURSE_GROUP__LEVEL_RESTRICTION, oldLevelRestriction, levelRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(String newField) {
		String oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.COURSE_GROUP__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFromField() {
		return fromField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromField(boolean newFromField) {
		boolean oldFromField = fromField;
		fromField = newFromField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.COURSE_GROUP__FROM_FIELD, oldFromField, fromField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
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
			case StudyProgramStructurePackage.COURSE_GROUP__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				return basicSetSemester(null, msgs);
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
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				return eInternalContainer().eInverseRemove(this, StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS, Semester.class, msgs);
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
			case StudyProgramStructurePackage.COURSE_GROUP__NAME:
				return getName();
			case StudyProgramStructurePackage.COURSE_GROUP__COURSES:
				return getCourses();
			case StudyProgramStructurePackage.COURSE_GROUP__NUM_OF_NEEDED_COURSES:
				return getNumOfNeededCourses();
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				return getSemester();
			case StudyProgramStructurePackage.COURSE_GROUP__LEVEL_RESTRICTION:
				return getLevelRestriction();
			case StudyProgramStructurePackage.COURSE_GROUP__FIELD:
				return getField();
			case StudyProgramStructurePackage.COURSE_GROUP__FROM_FIELD:
				return isFromField();
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
			case StudyProgramStructurePackage.COURSE_GROUP__NAME:
				setName((String)newValue);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends SemesterCourse>)newValue);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__NUM_OF_NEEDED_COURSES:
				setNumOfNeededCourses((Integer)newValue);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__LEVEL_RESTRICTION:
				setLevelRestriction((Integer)newValue);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__FIELD:
				setField((String)newValue);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__FROM_FIELD:
				setFromField((Boolean)newValue);
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
			case StudyProgramStructurePackage.COURSE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__NUM_OF_NEEDED_COURSES:
				setNumOfNeededCourses(NUM_OF_NEEDED_COURSES_EDEFAULT);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)null);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__LEVEL_RESTRICTION:
				setLevelRestriction(LEVEL_RESTRICTION_EDEFAULT);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__FIELD:
				setField(FIELD_EDEFAULT);
				return;
			case StudyProgramStructurePackage.COURSE_GROUP__FROM_FIELD:
				setFromField(FROM_FIELD_EDEFAULT);
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
			case StudyProgramStructurePackage.COURSE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgramStructurePackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
			case StudyProgramStructurePackage.COURSE_GROUP__NUM_OF_NEEDED_COURSES:
				return numOfNeededCourses != NUM_OF_NEEDED_COURSES_EDEFAULT;
			case StudyProgramStructurePackage.COURSE_GROUP__SEMESTER:
				return getSemester() != null;
			case StudyProgramStructurePackage.COURSE_GROUP__LEVEL_RESTRICTION:
				return levelRestriction != LEVEL_RESTRICTION_EDEFAULT;
			case StudyProgramStructurePackage.COURSE_GROUP__FIELD:
				return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
			case StudyProgramStructurePackage.COURSE_GROUP__FROM_FIELD:
				return fromField != FROM_FIELD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", numOfNeededCourses: ");
		result.append(numOfNeededCourses);
		result.append(", levelRestriction: ");
		result.append(levelRestriction);
		result.append(", field: ");
		result.append(field);
		result.append(", fromField: ");
		result.append(fromField);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
