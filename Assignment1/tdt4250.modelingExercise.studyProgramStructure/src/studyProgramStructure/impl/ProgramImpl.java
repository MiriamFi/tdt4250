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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyProgramStructure.Program;
import studyProgramStructure.Semester;
import studyProgramStructure.Specialization;
import studyProgramStructure.StudyProgramStructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getCode <em>Code</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getNumOfSemestersForBaseSpecialization <em>Num Of Semesters For Base Specialization</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfSemestersForBaseSpecialization() <em>Num Of Semesters For Base Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSemestersForBaseSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfSemestersForBaseSpecialization() <em>Num Of Semesters For Base Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSemestersForBaseSpecialization()
	 * @generated
	 * @ordered
	 */
	protected int numOfSemestersForBaseSpecialization = NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The default value of the '{@link #getNumOfSemesters() <em>Num Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_SEMESTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfSemesters() <em>Num Of Semesters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected int numOfSemesters = NUM_OF_SEMESTERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramStructurePackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumOfSemestersForBaseSpecialization() {
		return numOfSemestersForBaseSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfSemestersForBaseSpecialization(int newNumOfSemestersForBaseSpecialization) {
		int oldNumOfSemestersForBaseSpecialization = numOfSemestersForBaseSpecialization;
		numOfSemestersForBaseSpecialization = newNumOfSemestersForBaseSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION, oldNumOfSemestersForBaseSpecialization, numOfSemestersForBaseSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS, StudyProgramStructurePackage.SPECIALIZATION__PROGRAM);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, StudyProgramStructurePackage.PROGRAM__SEMESTERS, StudyProgramStructurePackage.SEMESTER__PROGRAM);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumOfSemesters() {
		return numOfSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfSemesters(int newNumOfSemesters) {
		int oldNumOfSemesters = numOfSemesters;
		numOfSemesters = newNumOfSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS, oldNumOfSemesters, numOfSemesters));
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
			case StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
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
			case StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyProgramStructurePackage.PROGRAM__NAME:
				return getName();
			case StudyProgramStructurePackage.PROGRAM__CODE:
				return getCode();
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION:
				return getNumOfSemestersForBaseSpecialization();
			case StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS:
				return getSpecializations();
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return getSemesters();
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				return getNumOfSemesters();
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
			case StudyProgramStructurePackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__CODE:
				setCode((String)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION:
				setNumOfSemestersForBaseSpecialization((Integer)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				setNumOfSemesters((Integer)newValue);
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
			case StudyProgramStructurePackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgramStructurePackage.PROGRAM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION:
				setNumOfSemestersForBaseSpecialization(NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION_EDEFAULT);
				return;
			case StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				setNumOfSemesters(NUM_OF_SEMESTERS_EDEFAULT);
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
			case StudyProgramStructurePackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgramStructurePackage.PROGRAM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION:
				return numOfSemestersForBaseSpecialization != NUM_OF_SEMESTERS_FOR_BASE_SPECIALIZATION_EDEFAULT;
			case StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				return numOfSemesters != NUM_OF_SEMESTERS_EDEFAULT;
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
		result.append(", code: ");
		result.append(code);
		result.append(", numOfSemestersForBaseSpecialization: ");
		result.append(numOfSemestersForBaseSpecialization);
		result.append(", numOfSemesters: ");
		result.append(numOfSemesters);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
