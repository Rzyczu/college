package People;

import Enums.Gender;

import java.text.ParseException;
import java.util.Date;

public class Student extends Person {
    public int StudentId;

    public Student(String name, String surname, Gender gender, String personalCode, Date birthDate, String email, String phone, String address, String city, String country, int studentId) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        StudentId = studentId;
    }

    @Override
    public
    String getInfo() {
        return "Student ID: " + StudentId + "\n" +
                super.getInfo() + "\n";
    }
}
