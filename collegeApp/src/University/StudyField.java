package University;

import People.Professor;
import People.Student;
import java.util.*;
import java.util.stream.Collectors;

public class StudyField {
    private final String Name;
    private List<Group> Groups;
    public static List<Curriculum> Curriculum;

    public StudyField(String name) {
        Name = name;
        Groups = new ArrayList<>();
        Curriculum = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

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
        info.append("Groups: ").append("\n");
        for (Group group : Groups) {
            info.append(group.getInfo()).append("\n");
        }

        return info.toString();
    }

    public List<Group> getClasses() {
        return Groups.stream()
                .filter(c -> c.getTerm() > -1)
                .collect(Collectors.toList());
    }

    public List<Curriculum> getCourses() {
        return Curriculum;
    }

    public List<Professor> getProfessors() {
        Set<Professor> professorsList = new HashSet<>();
        for (Curriculum curriculum : Curriculum) {
            professorsList.addAll(curriculum.getLecturers());
        }
        return new ArrayList<>(professorsList);
    }

    public List<Student> getStudents() {
        Set<Student> studentsList = new HashSet<>();
        for (Group c : Groups) {
            studentsList.addAll(c.getStudents());
        }
        return new ArrayList<>(studentsList);
    }

    public void addCourse(Curriculum curriculum) {
        Curriculum.add(curriculum);
    }

    public void addGroup(Group c) {
        Groups.add(c);
    }

    public void removeCourse(Curriculum curriculum) {
        Curriculum.remove(curriculum);
    }

    public void removeGroup(Group c) {
        Groups.remove(c);
    }
}
