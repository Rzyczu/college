import Enums.UniversityType;
import People.*;
import University.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static Engine.ReadExcel.*;

public class Main {
    static String StudentFilePath= "C:\\repos\\college\\Data\\StudentList.xlsx";
    static String PersonnelFilePath= "C:\\repos\\college\\Data\\PersonnelList.xlsx";
    static String ProfessorFilePath= "C:\\repos\\college\\Data\\ProfessorList.xlsx";

    public static void main(String[] args) {


        test();
    }

    public static void test() {
        List<Student> StudentList = setStudents(StudentFilePath);
        List<Personnel> PersonnelList = setPersonnel(PersonnelFilePath);
        List<Professor> ProfessorList = setProfessors(ProfessorFilePath);

        University PK = new University("Politechnika Krakowska", UniversityType.STATE, "Poland", "Cracow", null);

        List<Department> PK_Departments = new ArrayList<>();
        PK_Departments.add(new Department("Wydział Mechaniczny", ProfessorList.get(1)));
        PK_Departments.add(new Department("Wydział Architektury", ProfessorList.get(2)));
        PK_Departments.add(new Department("Wydział Informatyki i Telekomunikacji", ProfessorList.get(3)));
        PK_Departments.add(new Department("Wydział Inżynierii Elektronicznej i Komputerowej", ProfessorList.get(4)));
        PK.setDepartment(PK_Departments);

        List<StudyField> PK_WIEiK_StudyFields = new ArrayList<>();
        PK_WIEiK_StudyFields.add(new StudyField("Elektronika"));
        PK_WIEiK_StudyFields.add(new StudyField("Informatyka w Inżynierii Komputerowej"));
        PK.getDepartmentByName("Wydział Inżynierii Elektronicznej i Komputerowej").setStudyField(PK_WIEiK_StudyFields);

        System.out.println(PK.getInfo());


    }

    public static List<Student> setStudents(String FilePath) {
        List<Student> students = null;
        try {
            students = readStudentsFromExcel(FilePath);
            for (Student student : students){

                System.out.println("\u001B[90m" + student.getInfo() + "\u001B[0m");
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
                System.out.println("\u001B[90m" + professor.getInfo() + "\u001B[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return professors;
    }}