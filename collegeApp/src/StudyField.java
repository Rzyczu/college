import People.Professor;
import People.Student;

import java.util.*;
import java.util.stream.Collectors;

public
class StudyField {
    public String Name;
    public List<Class> Classes;
    public static List<Curriculum> Curriculum;

    public
    StudyField(String name) {
        Name = name;
        Classes = new ArrayList<Class>();
        Curriculum = new ArrayList<Curriculum>();
    }

    //todo poprawić
    public
    String getInfo() {
        return Name + ", Classes: " + Classes + ", Courses: " + Curriculum;
    }

    public
    List<Class> getClasses() {
        return Classes.stream()
                .filter(c -> c.Term > -1)
                .collect(Collectors.toList());
    }

    public
    List<Curriculum> getCourses() {
        return Curriculum;
    }

    public
    List<Professor> getProfessors() {
        Set<Professor> professorsList = new HashSet<>();
        for (Curriculum curriculum : Curriculum) {
            professorsList.addAll(curriculum.getLecturers());
        }
        return new ArrayList<>(professorsList);
    }

    public
    List<Student> getStudents() {
        Set<Student> studentsList = new HashSet<>();
        for (Class c : Classes) {
            studentsList.addAll(c.Students);
        }
        return new ArrayList<>(studentsList);
    }

    public
    void addCourse(Curriculum curriculum) {
        Curriculum.add(curriculum);
    }

    public
    void addClass(Class c) {
        Classes.add(c);
    }

    public
    void removeCourse(Curriculum curriculum) {
        Curriculum.remove(curriculum);
    }

    public
    void removeClass(Class c) {
        Classes.remove(c);
    }
}
