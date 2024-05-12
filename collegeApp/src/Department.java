import People.Personnel;
import People.Professor;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String Name;
    public Professor Dean;
    public List<Personnel> Personnel;
    public List<StudyField> StudyFields;

    public Department (String name, Professor dean) {
        Name = name;
        Dean = dean;
        Personnel = new ArrayList<Personnel>();
        StudyFields = new ArrayList<StudyField>();

    }

    //todo poprawić
    public String getInfo () {
        return Name + ", " + Personnel.size() + ", " + StudyFields.size() + ", " + StudyFields;
    }

    public List<Personnel> getPersonnel () {
        return Personnel;
    }

    public List<StudyField> getStudyFields () {
        return StudyFields;
    }

    public void addPersonnel (Personnel personnel) {
        Personnel.add(personnel);
    }

    public void addStudyField (StudyField studyField) {
        StudyFields.add(studyField);
    }

    public void removePersonnel (Personnel personnel) {
        Personnel.remove(personnel);
    }

    public void removeStudyField (StudyField studyField) {
        StudyFields.remove(studyField);
    }
}
