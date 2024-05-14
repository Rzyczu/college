package University;

import Enums.CurriculumType;
import People.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a group (class) within a study field.
 */
public class Group {
    public int Term;    // Term -1 meaning that class graduated
    public List<Student> Students;
    public Student Mayor;
    public Curriculum Curriculum;

    /**
     * Constructor to initialize a Group object.
     * @param type The type of curriculum for the group.
     */
    public Group(CurriculumType type) {
        Term = 1;
        Students = new ArrayList<Student>();
        Curriculum = setCurriculum(type);
    }

    /**
     * Generates information about the group.
     * @return Information about the group.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        if (Mayor != null) {
            info.append("Mayor: ").append(Mayor.getFullName()).append("\n");
        }
        info.append("Term: ").append(Term).append("\n");
        info.append("Year: ").append(getYear()).append("\n");
        info.append("Curriculum: ");
        if (Curriculum != null) {
            info.append(Curriculum.toString()).append("\n");
        } else {
            info.append("None");
        }
        return info.toString();
    }

    /**
     * Gets the year corresponding to the group's term.
     * @return The year corresponding to the group's term.
     */
    public int getYear() {
        return (int) Math.ceil(Term / 2.0);
    }

    /**
     * Gets the list of students in the group.
     * @return The list of students.
     */
    public List<Student> getStudents() {
        return Students;
    }

    /**
     * Sets a new term for the group, updating the curriculum if necessary.
     */
    public void setNewTerm() {
        List<Curriculum> curriculumListWithTheSameType = new ArrayList<>();
        for (Curriculum curriculum : StudyField.Curriculum) {
            if (curriculum.getType() == this.Curriculum.getType()) {
                curriculumListWithTheSameType.add(curriculum);
            }
        }
        if (curriculumListWithTheSameType.size() <= Term) {
            Term = -1; // Term -1 meaning that class graduated
            Curriculum = null;
        } else {
            Term += 1;
            setCurriculum(Curriculum.getType());
        }

    }

    /**
     * Sets the mayor of the group.
     * @param student The student to set as the mayor.
     */
    public void setMayor(Student student) {
        Mayor = student;
    }

    /**
     * Sets the list of students in the group.
     * @param students The list of students to set.
     */
    public void setStudents(List<Student> students) {
        Students = students;
    }

    /**
     * Sets the curriculum for the group.
     * @param type The type of curriculum to set.
     * @return The curriculum set for the group.
     */
    public Curriculum setCurriculum(CurriculumType type) {
        for (Curriculum curriculum : StudyField.Curriculum) {
            if (curriculum.getTerm() == this.Term && curriculum.getType() == type) {
                return curriculum;
            }
        }
        return null;
    }

    /**
     * Adds a student to the group.
     * @param student The student to add.
     */
    public void add(Student student) {
        Students.add(student);
    }

    /**
     * Removes a student from the group.
     * @param student The student to remove.
     */
    public void remove(Student student) {
        Students.remove(student);
    }

    /**
     * Gets the term of the group.
     * @return The term of the group.
     */
    public int getTerm() {
        return Term;
    }
}
