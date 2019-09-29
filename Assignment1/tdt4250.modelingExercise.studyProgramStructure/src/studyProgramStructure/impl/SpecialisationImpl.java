/**
 */
package studyProgramStructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import studyProgramStructure.Program;
import studyProgramStructure.Semester;
import studyProgramStructure.Specialisation;
import studyProgramStructure.StudyProgramStructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecialisationImpl#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecialisationImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecialisationImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
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
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramStructurePackage.Literals.SPECIALISATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALISATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALISATION__NUM_OF_SEMESTERS, oldNumOfSemesters, numOfSemesters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALISATION__SEMESTERS, oldSemesters, newSemesters);
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
				msgs = ((InternalEObject)semesters).eInverseRemove(this, StudyProgramStructurePackage.SEMESTER__SPECIALISATION, Semester.class, msgs);
			if (newSemesters != null)
				msgs = ((InternalEObject)newSemesters).eInverseAdd(this, StudyProgramStructurePackage.SEMESTER__SPECIALISATION, Semester.class, msgs);
			msgs = basicSetSemesters(newSemesters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALISATION__SEMESTERS, newSemesters, newSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != StudyProgramStructurePackage.SPECIALISATION__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, StudyProgramStructurePackage.SPECIALISATION__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != StudyProgramStructurePackage.SPECIALISATION__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALISATION__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyProgramStructurePackage.SPECIALISATION__SEMESTERS:
				if (semesters != null)
					msgs = ((InternalEObject)semesters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyProgramStructurePackage.SPECIALISATION__SEMESTERS, null, msgs);
				return basicSetSemesters((Semester)otherEnd, msgs);
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgram((Program)otherEnd, msgs);
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
			case StudyProgramStructurePackage.SPECIALISATION__SEMESTERS:
				return basicSetSemesters(null, msgs);
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				return basicSetProgram(null, msgs);
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
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				return eInternalContainer().eInverseRemove(this, StudyProgramStructurePackage.PROGRAM__SPECIALISATIONS, Program.class, msgs);
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
			case StudyProgramStructurePackage.SPECIALISATION__NAME:
				return getName();
			case StudyProgramStructurePackage.SPECIALISATION__NUM_OF_SEMESTERS:
				return getNumOfSemesters();
			case StudyProgramStructurePackage.SPECIALISATION__SEMESTERS:
				return getSemesters();
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				return getProgram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyProgramStructurePackage.SPECIALISATION__NAME:
				setName((String)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALISATION__NUM_OF_SEMESTERS:
				setNumOfSemesters((Integer)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALISATION__SEMESTERS:
				setSemesters((Semester)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				setProgram((Program)newValue);
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
			case StudyProgramStructurePackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SPECIALISATION__NUM_OF_SEMESTERS:
				setNumOfSemesters(NUM_OF_SEMESTERS_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SPECIALISATION__SEMESTERS:
				setSemesters((Semester)null);
				return;
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				setProgram((Program)null);
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
			case StudyProgramStructurePackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgramStructurePackage.SPECIALISATION__NUM_OF_SEMESTERS:
				return numOfSemesters != NUM_OF_SEMESTERS_EDEFAULT;
			case StudyProgramStructurePackage.SPECIALISATION__SEMESTERS:
				return semesters != null;
			case StudyProgramStructurePackage.SPECIALISATION__PROGRAM:
				return getProgram() != null;
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
		result.append(", numOfSemesters: ");
		result.append(numOfSemesters);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
