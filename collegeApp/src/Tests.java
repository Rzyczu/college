import Enums.*;
import People.*;
import University.*;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static University createTestUniversity() throws Exception {
        // Load students, personnel, and professors from files
        List<Student> studentList = Main.setStudents(Main.StudentFilePath);
        List<Personnel> personnelList = Main.setPersonnel(Main.PersonnelFilePath);
        List<Professor> professorList = Main.setProfessors(Main.ProfessorFilePath);

        // Create departments
        Department department1 = new Department("Computer Science", professorList.get(0));
        Department department2 = new Department("Mathematics", professorList.get(1));

        // Add personnel to departments
        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                department1.addPersonnel(personnelList.get(i));
            } else {
                department2.addPersonnel(personnelList.get(i));
            }
        }

        // Create study fields
        StudyField studyField1 = new StudyField("Computer Science");
        StudyField studyField2 = new StudyField("Mathematics");

        // Create curriculums
        Curriculum curriculum1 = new Curriculum(1, CurriculumType.FULLTIME);
        Curriculum curriculum2 = new Curriculum(2, CurriculumType.PARTTIME);

        // Add study fields to departments
        department1.addStudyField(studyField1);
        department2.addStudyField(studyField2);

        // Add curriculums to study fields
        studyField1.addCourse(curriculum1);
        studyField2.addCourse(curriculum2);

        // Create groups
        Group group1 = new Group(CurriculumType.FULLTIME);
        Group group2 = new Group(CurriculumType.PARTTIME);

        // Add students to groups
        for (int i = 0; i < studentList.size(); i++) {
            if (i % 2 == 0) {
                group1.add(studentList.get(i));
            } else {
                group2.add(studentList.get(i));
            }
        }

        // Add groups to study fields
        studyField1.addGroup(group1);
        studyField2.addGroup(group2);

        // Create more courses
        Subject subject3 = new Subject("Algorithms", 40, professorList.get(2));
        Subject subject4 = new Subject("Database Management", 40, professorList.get(3));

        // Add subjects to curriculums
        curriculum1.addSubject(subject3);
        curriculum2.addSubject(subject4);

        // Create more groups
        Group group3 = new Group(CurriculumType.FULLTIME);
        Group group4 = new Group(CurriculumType.PARTTIME);

        // Add more students to groups
        for (int i = 0; i < studentList.size(); i++) {
            if (i % 3 == 0) {
                group3.add(studentList.get(i));
            } else {
                group4.add(studentList.get(i));
            }
        }

        group3.setMayor(studentList.get(23));
        group4.setMayor(studentList.get(2));


        // Add more groups to study fields
        studyField1.addGroup(group3);
        studyField2.addGroup(group4);

        // Create more curriculums
        Curriculum curriculum3 = new Curriculum(3, CurriculumType.FULLTIME);
        Curriculum curriculum4 = new Curriculum(4, CurriculumType.PARTTIME);

        // Add more courses to curriculums
        Subject subject5 = new Subject("Software Engineering", 40, professorList.get(4));
        Subject subject6 = new Subject("Data Structures", 40, professorList.get(5));
        Subject subject7 = new Subject("Math", 20, professorList.get(8));
        Subject subject8 = new Subject("English", 10, professorList.get(9));

        // Add subjects to curriculums
        curriculum3.addSubject(subject5);
        curriculum4.addSubject(subject6);
        curriculum4.addSubject(subject7);
        curriculum4.addSubject(subject8);

        // Add more curriculums to study fields
        studyField1.addCourse(curriculum3);
        studyField2.addCourse(curriculum4);

        // Create the university
        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);

        return new University("Test University", UniversityType.PRIVATE, "USA", "NY", departments);
    }

    public static void testPK() {
        List<Student> StudentList = Main.setStudents(Main.StudentFilePath);
        List<Personnel> PersonnelList = Main.setPersonnel(Main.PersonnelFilePath);
        List<Professor> ProfessorList = Main.setProfessors(Main.ProfessorFilePath);

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
}
