package University;

import People.Professor;
import People.Student;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a study field within a university.
 */
public class StudyField {
    private final String Name;
    private List<Group> Groups;
    public static List<Curriculum> Curriculum;

    /**
     * Constructor to initialize a StudyField object.
     * @param name The name of the study field.
     */
    public StudyField(String name) {
        Name = name;
        Groups = new ArrayList<>();
        Curriculum = new ArrayList<>();
    }

    /**
     * Gets the name of the study field.
     * @return The name of the study field.
     */
    public String getName() {
        return Name;
    }

    /**
     * Generates information about the study field.
     * @return Information about the study field.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Study Field Name: ").append(Name).append("\n");
        info.append("Groups: ").append("\n");
        for (Group group : Groups) {
            info.append(group.getInfo()).append("\n");
        }
        info.append("Courses: ").append("\n");
        for (Curriculum curriculum : Curriculum) {
            info.append(curriculum.getInfo()).append("\n");
        }
        return info.toString();
    }

    /**
     * Gets the list of classes (groups) associated with the study field.
     * @return The list of classes.
     */
    public List<Group> getClasses() {
        return Groups.stream()
                .filter(c -> c.getTerm() > -1)
                .collect(Collectors.toList());
    }

    /**
     * Gets the list of courses (curriculum) associated with the study field.
     * @return The list of courses.
     */
    public List<Curriculum> getCourses() {
        return Curriculum;
    }

    /**
     * Gets the list of professors associated with the study field.
     * @return The list of professors.
     */
    public List<Professor> getProfessors() {
        Set<Professor> professorsList = new HashSet<>();
        for (Curriculum curriculum : Curriculum) {
            professorsList.addAll(curriculum.getLecturers());
        }
        return new ArrayList<>(professorsList);
    }

    /**
     * Gets the list of students associated with the study field.
     * @return The list of students.
     */
    public List<Student> getStudents() {
        Set<Student> studentsList = new HashSet<>();
        for (Group c : Groups) {
            studentsList.addAll(c.getStudents());
        }
        return new ArrayList<>(studentsList);
    }

    /**
     * Adds a course (curriculum) to the study field.
     * @param curriculum The curriculum to add.
     */
    public void addCourse(Curriculum curriculum) {
        Curriculum.add(curriculum);
    }

    /**
     * Adds a group (class) to the study field.
     * @param group The group to add.
     */
    public void addGroup(Group group) {
        Groups.add(group);
    }

    /**
     * Removes a course (curriculum) from the study field.
     * @param curriculum The curriculum to remove.
     */
    public void removeCourse(Curriculum curriculum) {
        Curriculum.remove(curriculum);
    }

    /**
     * Removes a group (class) from the study field.
     * @param group The group to remove.
     */
    public void removeGroup(Group group) {
        Groups.remove(group);
    }
}
