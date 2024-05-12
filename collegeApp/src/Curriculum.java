import Enums.CurriculumType;
import People.Professor;

import java.util.*;

public class Curriculum {
    public int Term;
    public List<Subject> Subjects;
    public CurriculumType Type;

    public Curriculum(int term, CurriculumType type) throws Exception {
        for (Curriculum curriculum : StudyField.Curriculum) {
            if (curriculum.Term == this.Term && curriculum.Type == type) {
                return;
            }
        }
        Term = term;
        Subjects = new ArrayList<Subject>();
        Type = type;
    }

    //todo poprawić
    public String getInfo() {
        return "Semester : " + Term + "\nType : " + Type.toString();
    }

    public int getYear() {
        return (int) Math.ceil(Term / 2.0);
    }

    public List<Subject> getSubjects() {
        return Subjects;
    }

    public List<Professor> getLecturers() {
        Set<Professor> professorsList = new HashSet<>();
        for (Subject subject : Subjects) {
            professorsList.add(subject.Lecturer);
        }
        return new ArrayList<>(professorsList);
    }

    public void addSubject(Subject subject) {
        Subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        Subjects.remove(subject);
    }
}
