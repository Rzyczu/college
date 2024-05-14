package People;

import Enums.Gender;

import java.text.ParseException;
import java.util.Date;

/**
 * Represents a student in an educational institution.
 */
public class Student extends Person {
    public int StudentId;

    /**
     * Constructor to initialize a Student object.
     * @param name The first name of the student.
     * @param surname The last name of the student.
     * @param gender The gender of the student.
     * @param personalCode The personal code of the student.
     * @param birthDate The birth date of the student.
     * @param email The email address of the student.
     * @param phone The phone number of the student.
     * @param address The address of the student.
     * @param city The city of the student.
     * @param country The country of the student.
     * @param studentId The student ID of the student.
     * @throws ParseException if the birth date format is invalid.
     */
    public Student(String name, String surname, Gender gender, String personalCode, Date birthDate, String email, String phone, String address, String city, String country, int studentId) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        StudentId = studentId;
    }

    /**
     * Generates information about the student.
     * @return Information about the student.
     */
    @Override
    public String getInfo() {
        return "Student ID: " + StudentId + "\n" +
                super.getInfo() + "\n";
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
}
