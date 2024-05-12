import People.Professor;
import People.Student;
import java.util.*;
import java.util.stream.Collectors;

public class StudyField {
    private final String Name;
    private List<Class> Classes;
    public static List<Curriculum> Curriculum;

    public StudyField(String name) {
        Name = name;
        Classes = new ArrayList<>();
        Curriculum = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Name: ").append(Name).append("\n");
        info.append("Classes: ");
        for (Class c : Classes) {
            info.append(c.getClass()).append(", ");
        }
        if (!Classes.isEmpty()) {
            info.setLength(info.length() - 2);
        }
        info.append("\nCourses: ");
        for (Curriculum curriculum : Curriculum) {
            info.append(curriculum.getYear()).append(", ");
        }
        if (!Curriculum.isEmpty()) {
            info.setLength(info.length() - 2);
        }
        return info.toString();
    }

    public List<Class> getClasses() {
        return Classes.stream()
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
        for (Class c : Classes) {
            studentsList.addAll(c.getStudents());
        }
        return new ArrayList<>(studentsList);
    }

    public void addCourse(Curriculum curriculum) {
        Curriculum.add(curriculum);
    }

    public void addClass(Class c) {
        Classes.add(c);
    }

    public void removeCourse(Curriculum curriculum) {
        Curriculum.remove(curriculum);
    }

    public void removeClass(Class c) {
        Classes.remove(c);
    }
}
