package University;

import Enums.CurriculumType;
import People.Professor;
import java.util.*;

/**
 * Represents a curriculum within a study field.
 */
public class Curriculum {
    private final int Term;
    private List<Subject> Subjects;
    private final CurriculumType Type;

    /**
     * Constructor to initialize a Curriculum object.
     * @param term The term (semester) for the curriculum.
     * @param type The type of the curriculum.
     * @throws Exception if a curriculum for the given term and type already exists.
     */
    public Curriculum(int term, CurriculumType type) throws Exception {
        for (Curriculum curriculum : StudyField.Curriculum) {
            if (curriculum.Term == term && curriculum.Type == type) {
                throw new Exception("University.Curriculum for term " + term + " and type " + type + " already exists.");
            }
        }
        Term = term;
        Subjects = new ArrayList<>();
        Type = type;
    }

    /**
     * Gets the term (semester) of the curriculum.
     * @return The term (semester) of the curriculum.
     */
    public int getTerm() {
        return Term;
    }

    /**
     * Gets the type of the curriculum.
     * @return The type of the curriculum.
     */
    public CurriculumType getType() {
        return Type;
    }

    /**
     * Generates information about the curriculum.
     * @return Information about the curriculum.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Semester: ").append(Term).append("\n");
        info.append("Type: ").append(Type.name()).append("\n");
        info.append("Subjects: ").append("\n");
        for (Subject subject : Subjects) {
            info.append(subject.getInfo()).append("\n");
        }
        return info.toString();
    }

    /**
     * Gets the year corresponding to the curriculum's term.
     * @return The year corresponding to the curriculum's term.
     */
    public int getYear() {
        return (int) Math.ceil(Term / 2.0);
    }

    /**
     * Gets the list of subjects included in the curriculum.
     * @return The list of subjects.
     */
    public List<Subject> getSubjects() {
        return Subjects;
    }

    /**
     * Gets the list of professors teaching subjects in the curriculum.
     * @return The list of professors.
     */
    public List<Professor> getLecturers() {
        Set<Professor> professorsList = new HashSet<>();
        for (Subject subject : Subjects) {
            professorsList.add(subject.getLecturer());
        }
        return new ArrayList<>(professorsList);
    }

    /**
     * Adds a subject to the curriculum.
     * @param subject The subject to add.
     */
    public void addSubject(Subject subject) {
        Subjects.add(subject);
    }

    /**
     * Removes a subject from the curriculum.
     * @param subject The subject to remove.
     */
    public void removeSubject(Subject subject) {
        Subjects.remove(subject);
    }
}
