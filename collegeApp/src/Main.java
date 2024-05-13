import People.Personnel;
import People.Professor;
import People.Student;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static Engine.ReadExcel.*;

public class Main {
    public static void main(String[] args) {
        String StudentFilePath= "C:\\repos\\college\\Data\\StudentList.xlsx";
        String PersonnelFilePath= "C:\\repos\\college\\Data\\PersonnelList.xlsx";
        String ProfessorFilePath= "C:\\repos\\college\\Data\\ProfessorList.xlsx";

        setStudents(StudentFilePath);
        setPersonnel(PersonnelFilePath);
        setProfessors(ProfessorFilePath);

    }

    public static List<Student> setStudents(String FilePath) {
        List<Student> students = null;
        try {
            students = readStudentsFromExcel(FilePath);
            for (Student student : students){
                System.out.println(student.getInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static List<Personnel> setPersonnel(String FilePath) {
        List<Personnel> personnels = null;
        try {
            personnels = readPersonnelFromExcel(FilePath);
            for (Personnel personnel : personnels) {
                System.out.println(personnel.getInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return personnels;
    }

    public static List<Professor> setProfessors(String FilePath) {
        List<Professor> professors = null;
        try {
            professors = readProfessorFromExcel(FilePath);
            for (Professor professor : professors) {
                System.out.println(professor.getInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return professors;
    }}