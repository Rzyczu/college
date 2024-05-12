import Enums.CurriculumType;
import People.Professor;
import java.util.*;

public class Curriculum {
    private final int Term;
    private List<Subject> Subjects;
    private final CurriculumType Type;

    public Curriculum(int term, CurriculumType type) throws Exception {
        for (Curriculum curriculum : StudyField.Curriculum) {
            if (curriculum.Term == term && curriculum.Type == type) {
                throw new Exception("Curriculum for term " + term + " and type " + type + " already exists.");
            }
        }
        Term = term;
        Subjects = new ArrayList<>();
        Type = type;
    }

    public int getTerm() {
        return Term;
    }

    public CurriculumType getType() {
        return Type;
    }

    public String getInfo() {
        return "Semester: " + Term + "\nType: " + Type.name();
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
            professorsList.add(subject.getLecturer());
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
