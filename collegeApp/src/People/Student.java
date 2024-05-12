package People;

import Enums.Gender;

import java.text.ParseException;

public class Student extends Person {
    public int StudentId;

    public Student(String name, String surname, Gender gender, String personalCode, String birthDate, String email, String phone, String address, String city, String country, int studentId) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        StudentId = studentId;
    }

    @Override
    public
    String getInfo() {
        return "Student ID: " + StudentId +
                super.getInfo() + "\n";
    }
}
