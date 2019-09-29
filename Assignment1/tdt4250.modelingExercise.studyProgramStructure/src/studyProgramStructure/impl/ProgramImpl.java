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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyProgramStructure.Program;
import studyProgramStructure.Semester;
import studyProgramStructure.Specialisation;
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
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getSpecialisations <em>Specialisations</em>}</li>
 *   <li>{@link studyProgramStructure.impl.ProgramImpl#getSemesters <em>Semesters</em>}</li>
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
	 * The cached value of the '{@link #getNumOfSemesters() <em>Num Of Semesters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numOfSemesters;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected String degree = DEGREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisations;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected Semester semesters;

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
	public EList<Integer> getNumOfSemesters() {
		if (numOfSemesters == null) {
			numOfSemesters = new EDataTypeUniqueEList<Integer>(Integer.class, this, StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS);
		}
		return numOfSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(String newDegree) {
		String oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentWithInverseEList<Specialisation>(Specialisation.class, this, StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS, StudyProgramStructurePackage.SPECIALISATION__PROGRAM);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemesters() {
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesters(Semester newSemesters, NotificationChain msgs) {
		Semester oldSemesters = semesters;
		semesters = newSemesters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__SEMESTERS, oldSemesters, newSemesters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesters(Semester newSemesters) {
		if (newSemesters != semesters) {
			NotificationChain msgs = null;
			if (semesters != null)
				msgs = ((InternalEObject)semesters).eInverseRemove(this, StudyProgramStructurePackage.SEMESTER__PROGRAM, Semester.class, msgs);
			if (newSemesters != null)
				msgs = ((InternalEObject)newSemesters).eInverseAdd(this, StudyProgramStructurePackage.SEMESTER__PROGRAM, Semester.class, msgs);
			msgs = basicSetSemesters(newSemesters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.PROGRAM__SEMESTERS, newSemesters, newSemesters));
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
			case StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialisations()).basicAdd(otherEnd, msgs);
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				if (semesters != null)
					msgs = ((InternalEObject)semesters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyProgramStructurePackage.PROGRAM__SEMESTERS, null, msgs);
				return basicSetSemesters((Semester)otherEnd, msgs);
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
			case StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return basicSetSemesters(null, msgs);
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
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				return getNumOfSemesters();
			case StudyProgramStructurePackage.PROGRAM__DEGREE:
				return getDegree();
			case StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS:
				return getSpecialisations();
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return getSemesters();
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
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				getNumOfSemesters().clear();
				getNumOfSemesters().addAll((Collection<? extends Integer>)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__DEGREE:
				setDegree((String)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				setSemesters((Semester)newValue);
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
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				getNumOfSemesters().clear();
				return;
			case StudyProgramStructurePackage.PROGRAM__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS:
				getSpecialisations().clear();
				return;
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				setSemesters((Semester)null);
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
			case StudyProgramStructurePackage.PROGRAM__NUM_OF_SEMESTERS:
				return numOfSemesters != null && !numOfSemesters.isEmpty();
			case StudyProgramStructurePackage.PROGRAM__DEGREE:
				return DEGREE_EDEFAULT == null ? degree != null : !DEGREE_EDEFAULT.equals(degree);
			case StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
			case StudyProgramStructurePackage.PROGRAM__SEMESTERS:
				return semesters != null;
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
		result.append(", numOfSemesters: ");
		result.append(numOfSemesters);
		result.append(", degree: ");
		result.append(degree);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
