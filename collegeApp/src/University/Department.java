package University;

import People.Personnel;
import People.Professor;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String Name;
    private Professor Dean;
    private List<Personnel> PersonnelList;
    private List<StudyField> StudyFields;

    public Department(String name, Professor dean) {
        this.Name = name;
        this.Dean = dean;
        this.PersonnelList = new ArrayList<>();
        this.StudyFields = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public Professor getDean() {
        return Dean;
    }

    public List<Personnel> getPersonnelList() {
        return PersonnelList;
    }

    public List<StudyField> getStudyFields() {
        return StudyFields;
    }

    public void addPersonnel(Personnel personnel) {
        PersonnelList.add(personnel);
    }

    public void addStudyField(StudyField studyField) {
        StudyFields.add(studyField);
    }

    public void removePersonnel(Personnel personnel) {
        PersonnelList.remove(personnel);
    }

    public void removeStudyField(StudyField studyField) {
        StudyFields.remove(studyField);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Name: ").append(Name).append("\n");
        info.append("Dean: ").append(Dean.getName()).append("\n");
        info.append("Personnel: ");
        for (Personnel personnel : PersonnelList) {
            info.append(personnel.getName()).append(", ");
        }
        info.append("\nStudy Fields: ");
        for (StudyField studyField : StudyFields) {
            info.append(studyField.getName()).append(", ");
        }

        return info.toString();
    }
}
