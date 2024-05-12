package People;

import Enums.Degree;
import Enums.Gender;
import Enums.Professorship;

import javax.security.auth.Subject;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person implements Employee{
    public Professorship Professorship;
    public Degree Degree;
    public List<Subject> Subjects;
    private Double Salary;

    public Professor(String name, String surname, Gender gender, String personalCode, String birthDate, String email, String phone, String address, String city, String country, Double salary, Professorship professorship, Degree degree) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address,city, country);
        Professorship = professorship;
        Degree = degree;
        Subjects = new ArrayList<Subject>();
    }

    @Override
    public String getInfo() {
        return  this.getFullName() + "\n" +
                "Degree: " + Degree.getFullName() + "\n" +
                "Professorship: " + Professorship.getFullName() + "\n" +
                super.getInfo();
    }

    @Override
    public String getFullName() {
        return Professorship.getAbbreviation() + " " +  Degree.getAbbreviation() + " " + super.getFullName();
    }

    public List<Subject> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        Subjects = subjects;
    }

    public void setDegree(Degree degree) {
        Degree = degree;
    }

    public void addSubject(Subject subject) {
        Subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        Subjects.remove(subject);
    }


    @Override
    public
    Double getSalary() {
        return Salary;
    }

    @Override
    public
    void changeSalary(Double amount) {
        Salary = amount;
    }
}
