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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyProgramStructure.Program;
import studyProgramStructure.Semester;
import studyProgramStructure.Specialization;
import studyProgramStructure.StudyProgramStructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecializationImpl#getNumOfSemesters <em>Num Of Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecializationImpl#getFurtherSpecializations <em>Further Specializations</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecializationImpl#getBaseSpecialization <em>Base Specialization</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyProgramStructure.impl.SpecializationImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
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
	 * The cached value of the '{@link #getFurtherSpecializations() <em>Further Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> furtherSpecializations;

	/**
	 * The cached value of the '{@link #getBaseSpecialization() <em>Base Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization baseSpecialization;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyProgramStructurePackage.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALIZATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALIZATION__NUM_OF_SEMESTERS, oldNumOfSemesters, numOfSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getFurtherSpecializations() {
		if (furtherSpecializations == null) {
			furtherSpecializations = new EObjectWithInverseResolvingEList<Specialization>(Specialization.class, this, StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS, StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION);
		}
		return furtherSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getBaseSpecialization() {
		if (baseSpecialization != null && baseSpecialization.eIsProxy()) {
			InternalEObject oldBaseSpecialization = (InternalEObject)baseSpecialization;
			baseSpecialization = (Specialization)eResolveProxy(oldBaseSpecialization);
			if (baseSpecialization != oldBaseSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION, oldBaseSpecialization, baseSpecialization));
			}
		}
		return baseSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetBaseSpecialization() {
		return baseSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseSpecialization(Specialization newBaseSpecialization, NotificationChain msgs) {
		Specialization oldBaseSpecialization = baseSpecialization;
		baseSpecialization = newBaseSpecialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION, oldBaseSpecialization, newBaseSpecialization);
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
	public void setBaseSpecialization(Specialization newBaseSpecialization) {
		if (newBaseSpecialization != baseSpecialization) {
			NotificationChain msgs = null;
			if (baseSpecialization != null)
				msgs = ((InternalEObject)baseSpecialization).eInverseRemove(this, StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS, Specialization.class, msgs);
			if (newBaseSpecialization != null)
				msgs = ((InternalEObject)newBaseSpecialization).eInverseAdd(this, StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS, Specialization.class, msgs);
			msgs = basicSetBaseSpecialization(newBaseSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION, newBaseSpecialization, newBaseSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS, StudyProgramStructurePackage.SEMESTER__SPECIALIZATION);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != StudyProgramStructurePackage.SPECIALIZATION__PROGRAM) return null;
		return (Program)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgram, StudyProgramStructurePackage.SPECIALIZATION__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer() || (eContainerFeatureID() != StudyProgramStructurePackage.SPECIALIZATION__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS, Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyProgramStructurePackage.SPECIALIZATION__PROGRAM, newProgram, newProgram));
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
			case StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFurtherSpecializations()).basicAdd(otherEnd, msgs);
			case StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION:
				if (baseSpecialization != null)
					msgs = ((InternalEObject)baseSpecialization).eInverseRemove(this, StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS, Specialization.class, msgs);
				return basicSetBaseSpecialization((Specialization)otherEnd, msgs);
			case StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
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
			case StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				return ((InternalEList<?>)getFurtherSpecializations()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION:
				return basicSetBaseSpecialization(null, msgs);
			case StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
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
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
				return eInternalContainer().eInverseRemove(this, StudyProgramStructurePackage.PROGRAM__SPECIALIZATIONS, Program.class, msgs);
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
			case StudyProgramStructurePackage.SPECIALIZATION__NAME:
				return getName();
			case StudyProgramStructurePackage.SPECIALIZATION__NUM_OF_SEMESTERS:
				return getNumOfSemesters();
			case StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				return getFurtherSpecializations();
			case StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION:
				if (resolve) return getBaseSpecialization();
				return basicGetBaseSpecialization();
			case StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
				return getProgram();
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
			case StudyProgramStructurePackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__NUM_OF_SEMESTERS:
				setNumOfSemesters((Integer)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				getFurtherSpecializations().clear();
				getFurtherSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION:
				setBaseSpecialization((Specialization)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
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
			case StudyProgramStructurePackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__NUM_OF_SEMESTERS:
				setNumOfSemesters(NUM_OF_SEMESTERS_EDEFAULT);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				getFurtherSpecializations().clear();
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION:
				setBaseSpecialization((Specialization)null);
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
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
			case StudyProgramStructurePackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyProgramStructurePackage.SPECIALIZATION__NUM_OF_SEMESTERS:
				return numOfSemesters != NUM_OF_SEMESTERS_EDEFAULT;
			case StudyProgramStructurePackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				return furtherSpecializations != null && !furtherSpecializations.isEmpty();
			case StudyProgramStructurePackage.SPECIALIZATION__BASE_SPECIALIZATION:
				return baseSpecialization != null;
			case StudyProgramStructurePackage.SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyProgramStructurePackage.SPECIALIZATION__PROGRAM:
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

} //SpecializationImpl
