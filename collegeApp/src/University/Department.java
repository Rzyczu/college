package University;

import People.Personnel;
import People.Professor;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Department within a university.
 */
public class Department {
    private final String Name;
    private Professor Dean;
    private List<Personnel> PersonnelList;
    private List<StudyField> StudyFields;

    /**
     * Constructor to initialize a Department object.
     * @param name The name of the department.
     * @param dean The professor serving as the dean of the department.
     */
    public Department(String name, Professor dean) {
        this.Name = name;
        this.Dean = dean;
        this.PersonnelList = new ArrayList<>();
        this.StudyFields = new ArrayList<>();
    }

    /**
     * Gets the name of the department.
     * @return The name of the department.
     */
    public String getName() {
        return Name;
    }

    /**
     * Gets the dean of the department.
     * @return The professor serving as the dean of the department.
     */
    public Professor getDean() {
        return Dean;
    }

    /**
     * Gets the list of personnel associated with the department.
     * @return The list of personnel.
     */
    public List<Personnel> getPersonnelList() {
        return PersonnelList;
    }

    /**
     * Gets the list of study fields associated with the department.
     * @return The list of study fields.
     */
    public List<StudyField> getStudyFields() {
        return StudyFields;
    }

    /**
     * Sets the list of study fields associated with the department.
     * @param studyFieldList The list of study fields to set.
     */
    public void setStudyField(List<StudyField> studyFieldList) {
        StudyFields.addAll(studyFieldList);
    }

    /**
     * Adds personnel to the department.
     * @param personnel The personnel to add.
     */
    public void addPersonnel(Personnel personnel) {
        PersonnelList.add(personnel);
    }

    /**
     * Adds a study field to the department.
     * @param studyField The study field to add.
     */
    public void addStudyField(StudyField studyField) {
        StudyFields.add(studyField);
    }

    /**
     * Removes personnel from the department.
     * @param personnel The personnel to remove.
     */
    public void removePersonnel(Personnel personnel) {
        PersonnelList.remove(personnel);
    }

    /**
     * Removes a study field from the department.
     * @param studyField The study field to remove.
     */
    public void removeStudyField(StudyField studyField) {
        StudyFields.remove(studyField);
    }

    /**
     * Generates information about the department.
     * @return Information about the department.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Department Name: ").append(Name).append("\n");
        info.append("Dean: ").append(Dean.getFullName()).append("\n");
        info.append("Personnel: ").append("\n");
        for (Personnel personnel : PersonnelList){
            info.append(personnel.getField().getName()).append(" - ") ;
            info.append(personnel.getFullName()).append("\n");
        }
        info.append("\nStudy Fields: ").append("\n");
        for (StudyField studyField : StudyFields){
            info.append(studyField.getInfo()).append("\n");
        }
        return info.toString();
    }
}
