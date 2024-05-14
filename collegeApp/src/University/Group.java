package University;

import Enums.CurriculumType;
import People.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public int Term;    //Term -1 meaning that class graduated
    public List<Student> Students;
    public Student Mayor;
    public Curriculum Curriculum;

    public Group(CurriculumType type) {
        Term = 1;
        Students = new ArrayList<Student>();
        Curriculum = setCurriculum(type);
    }

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
        } else{
            info.append("None");
        }
        return info.toString();
    }

    public int getYear() {
        return (int) Math.ceil(Term / 2.0);
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setNewTerm() {
        List<Curriculum> curriculumListWithTheSameType = new ArrayList<>();
        for (Curriculum curriculum : StudyField.Curriculum){
            if (curriculum.getType() == this.Curriculum.getType()) {
                curriculumListWithTheSameType.add(curriculum);
            }
        }
        if (curriculumListWithTheSameType.size() <= Term) {
            Term = -1;     //Term -1 meaning that class graduated
            Curriculum = null;
        } else {
            Term += 1;
            setCurriculum(Curriculum.getType());
        }

    }

    public void setMayor(Student student) {
        Mayor = student;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public Curriculum setCurriculum(CurriculumType type) {
        for (Curriculum curriculum : StudyField.Curriculum){
            if (curriculum.getTerm() == this.Term && curriculum.getType() == type) {
                return curriculum;
            }
        }
        return null;
    }

    public void add(Student student) {
        Students.add(student);
    }

    public void remove(Student student) {
        Students.remove(student);
    }

    public int getTerm() {
        return Term;
    }
}
