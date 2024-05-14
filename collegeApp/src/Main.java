import People.*;
import University.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static Engine.ReadExcel.*;

public class Main {
    static String StudentFilePath= "C:\\repos\\college\\Data\\StudentList.xlsx";
    static String PersonnelFilePath= "C:\\repos\\college\\Data\\PersonnelList.xlsx";
    static String ProfessorFilePath= "C:\\repos\\college\\Data\\ProfessorList.xlsx";

    public static void main(String[] args) throws Exception {

        // Create a university
        University university = Tests.createTestUniversity();
        // Print university info
        System.out.println("University Information:\n" + university.getInfo());
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