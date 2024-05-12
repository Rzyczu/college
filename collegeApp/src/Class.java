import Enums.CurriculumType;
import People.Student;

import java.util.ArrayList;
import java.util.List;

public class Class {
    public int Term;    //Term -1 meaning that class graduated
    public List<Student> Students;
    public Student Mayor;
    public Curriculum Curriculum;

    public Class(CurriculumType type) {
        Term = 1;
        Students = new ArrayList<Student>();
        Curriculum = setCurriculum(type);
    }

    //todo poprawić
    public String getInfo(){
        return "Term = " + Term + ", Year = " + getYear();
    }

    public int getYear() {
        return (int) Math.ceil(Term / 2.0);
    }

    public List<Student> getStudents(){
        return Students;
    }

    public void setNewTerm(){
        List<Curriculum> curriculumListWithTheSameType = new ArrayList<>();
        for (Curriculum curriculum : StudyField.Curriculum){
            if (curriculum.Type == this.Curriculum.Type){
                curriculumListWithTheSameType.add(curriculum);
            }
        }
       if (curriculumListWithTheSameType.size() <= Term){
           Term=-1;     //Term -1 meaning that class graduated
           Curriculum = null;
       } else {
           Term += 1;
           setCurriculum(Curriculum.Type);
       }

    }

    public void setMayor(Student student){
        Mayor = student;
    }

    public void setStudents(List<Student> students){
        Students = students;
    }

    public Curriculum setCurriculum(CurriculumType type) {
        for (Curriculum curriculum : StudyField.Curriculum) {
            if (curriculum.Term == this.Term && curriculum.Type == type) {
                return curriculum;
            }
        }
        return null;
    }

    public void add(Student student){
        Students.add(student);
    }

    public void remove(Student student){
        Students.remove(student);
    }
}
