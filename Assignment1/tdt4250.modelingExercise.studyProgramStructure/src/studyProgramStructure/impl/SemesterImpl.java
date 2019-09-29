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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyProgramStructure.CourseGroup;
import studyProgramStructure.Program;
import studyProgramStructure.Semester;
import studyProgramStructure.SemesterCourse;
import studyProgramStructure.Specialisation;
import studyProgramStructure.StudyProgramStructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getNeededCredits <em>Needed Credits</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SemesterImpl#getChosenCourses <em>Chosen Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected String season = SEASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

	/**
	 * The default value of the '{@link #getNeededCredits() <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float NEEDED_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNeededCredits() <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededCredits()
	 * @generated
	 * @ordered
	 */
	protected float neededCredits = NEEDED_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChosenCourses() <em>Chosen Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterCourse> chosenCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramStructurePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(String newSeason) {
		String oldSeason = season;
		season = newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentWithInverseEList<CourseGroup>(CourseGroup.class, this, StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS, StudyProgramStructurePackage.COURSE_GROUP__SEMESTER);
		}
		return courseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != StudyProgramStructurePackage.SEMESTER__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, StudyProgramStructurePackage.SEMESTER__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != StudyProgramStructurePackage.SEMESTER__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, StudyProgramStructurePackage.PROGRAM__SEMESTERS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SEMESTER__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation getSpecialisation() {
		if (eContainerFeatureID() != StudyProgramStructurePackage.SEMESTER__SPECIALISATION) return null;
		return (Specialisation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisation(Specialisation newSpecialisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialisation, StudyProgramStructurePackage.SEMESTER__SPECIALISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisation(Specialisation newSpecialisation) {
		if (newSpecialisation != eInternalContainer() || (eContainerFeatureID() != StudyProgramStructurePackage.SEMESTER__SPECIALISATION && newSpecialisation != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialisation != null)
				msgs = ((InternalEObject)newSpecialisation).eInverseAdd(this, StudyProgramStructurePackage.SPECIALISATION__SEMESTERS, Specialisation.class, msgs);
			msgs = basicSetSpecialisation(newSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SEMESTER__SPECIALISATION, newSpecialisation, newSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getNeededCredits() {
		return neededCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeededCredits(float newNeededCredits) {
		float oldNeededCredits = neededCredits;
		neededCredits = newNeededCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SEMESTER__NEEDED_CREDITS, oldNeededCredits, neededCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemesterCourse> getChosenCourses() {
		if (chosenCourses == null) {
			chosenCourses = new EObjectContainmentEList<SemesterCourse>(SemesterCourse.class, this, StudyProgramStructurePackage.SEMESTER__CHOSEN_COURSES);
		}
		return chosenCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseGroups()).basicAdd(otherEnd, msgs);
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialisation((Specialisation)otherEnd, msgs);
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
			case StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				return basicSetProgram(null, msgs);
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				return basicSetSpecialisation(null, msgs);
			case StudyProgramStructurePackage.SEMESTER__CHOSEN_COURSES:
				return ((InternalEList<?>)getChosenCourses()).basicRemove(otherEnd, msgs);
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
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				return eInternalContainer().eInverseRemove(this, StudyProgramStructurePackage.PROGRAM__SEMESTERS, Program.class, msgs);
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				return eInternalContainer().eInverseRemove(this, StudyProgramStructurePackage.SPECIALISATION__SEMESTERS, Specialisation.class, msgs);
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
			case StudyProgramStructurePackage.SEMESTER__YEAR:
				return getYear();
			case StudyProgramStructurePackage.SEMESTER__SEASON:
				return getSeason();
			case StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS:
				return getCourseGroups();
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				return getProgram();
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				return getSpecialisation();
			case StudyProgramStructurePackage.SEMESTER__NEEDED_CREDITS:
				return getNeededCredits();
			case StudyProgramStructurePackage.SEMESTER__CHOSEN_COURSES:
				return getChosenCourses();
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
			case StudyProgramStructurePackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case StudyProgramStructurePackage.SEMESTER__SEASON:
				setSeason((String)newValue);
				return;
			case StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				setProgram((Program)newValue);
				return;
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
				return;
			case StudyProgramStructurePackage.SEMESTER__NEEDED_CREDITS:
				setNeededCredits((Float)newValue);
				return;
			case StudyProgramStructurePackage.SEMESTER__CHOSEN_COURSES:
				getChosenCourses().clear();
				getChosenCourses().addAll((Collection<? extends SemesterCourse>)newValue);
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
			case StudyProgramStructurePackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				return;
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				setProgram((Program)null);
				return;
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)null);
				return;
			case StudyProgramStructurePackage.SEMESTER__NEEDED_CREDITS:
				setNeededCredits(NEEDED_CREDITS_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SEMESTER__CHOSEN_COURSES:
				getChosenCourses().clear();
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
			case StudyProgramStructurePackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case StudyProgramStructurePackage.SEMESTER__SEASON:
				return SEASON_EDEFAULT == null ? season != null : !SEASON_EDEFAULT.equals(season);
			case StudyProgramStructurePackage.SEMESTER__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
			case StudyProgramStructurePackage.SEMESTER__PROGRAM:
				return getProgram() != null;
			case StudyProgramStructurePackage.SEMESTER__SPECIALISATION:
				return getSpecialisation() != null;
			case StudyProgramStructurePackage.SEMESTER__NEEDED_CREDITS:
				return neededCredits != NEEDED_CREDITS_EDEFAULT;
			case StudyProgramStructurePackage.SEMESTER__CHOSEN_COURSES:
				return chosenCourses != null && !chosenCourses.isEmpty();
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
		result.append(" (year: ");
		result.append(year);
		result.append(", season: ");
		result.append(season);
		result.append(", neededCredits: ");
		result.append(neededCredits);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
