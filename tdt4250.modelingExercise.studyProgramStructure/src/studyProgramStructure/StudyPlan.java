/**
 */
package studyProgramStructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyProgramStructure.StudyPlan#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see studyProgramStructure.StudyProgramStructurePackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference.
	 * @see #setPrograms(Program)
	 * @see studyProgramStructure.StudyProgramStructurePackage#getStudyPlan_Programs()
	 * @model containment="true"
	 * @generated
	 */
	Program getPrograms();

	/**
	 * Sets the value of the '{@link studyProgramStructure.StudyPlan#getPrograms <em>Programs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs</em>' containment reference.
	 * @see #getPrograms()
	 * @generated
	 */
	void setPrograms(Program value);

} // StudyPlan
