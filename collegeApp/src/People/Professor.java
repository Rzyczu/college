package People;

import Enums.Degree;
import Enums.Gender;
import Enums.Professorship;
import University.Subject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a professor in an organization.
 */
public class Professor extends Person implements Employee {
    public Professorship Professorship;
    public Degree Degree;
    public List<Subject> Subjects;
    private Double Salary;

    /**
     * Constructor to initialize a Professor object.
     * @param name The first name of the professor.
     * @param surname The last name of the professor.
     * @param gender The gender of the professor.
     * @param personalCode The personal code of the professor.
     * @param birthDate The birth date of the professor.
     * @param email The email address of the professor.
     * @param phone The phone number of the professor.
     * @param address The address of the professor.
     * @param city The city of the professor.
     * @param country The country of the professor.
     * @param salary The salary of the professor.
     * @param professorship The professorship of the professor.
     * @param degree The degree of the professor.
     * @throws ParseException if the birth date format is invalid.
     */
    public Professor(String name, String surname, Gender gender, String personalCode, Date birthDate, String email, String phone, String address, String city, String country, Double salary, Professorship professorship, Degree degree) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        Professorship = professorship;
        Degree = degree;
        Salary = salary;
        Subjects = new ArrayList<>();
    }

    /**
     * Generates information about the professor.
     * @return Information about the professor.
     */
    @Override
    public String getInfo() {
        return  this.getFullName() + "\n" +
                "Degree: " + Degree.getFullName() + "\n" +
                "Professorship: " + Professorship.getFullName() + "\n" +
                super.getInfo() + "\n";
    }

    /**
     * Gets the full name of the professor with title.
     * @return The full name of the professor with title.
     */
    @Override
    public String getFullName() {
        return Professorship.getAbbreviation() + " " +  Degree.getAbbreviation() + " " + super.getFullName();
    }

    /**
     * Gets the subjects taught by the professor.
     * @return The subjects taught by the professor.
     */
    public List<Subject> getSubjects() {
        return Subjects;
    }

    /**
     * Gets the professorship of the professor.
     * @return The professorship of the professor.
     */
    public Professorship getProfessorship() {
        return Professorship;
    }

    /**
     * Gets the degree of the professor.
     * @return The degree of the professor.
     */
    public Degree getDegree() {
        return Degree;
    }

    /**
     * Sets the subjects taught by the professor.
     * @param subjects The subjects taught by the professor.
     */
    public void setSubjects(List<Subject> subjects) {
        Subjects = subjects;
    }

    /**
     * Sets the degree of the professor.
     * @param degree The degree of the professor.
     */
    public void setDegree(Degree degree) {
        Degree = degree;
    }

    /**
     * Adds a subject taught by the professor.
     * @param subject The subject taught by the professor.
     */
    public void addSubject(Subject subject) {
        Subjects.add(subject);
    }

    /**
     * Removes a subject taught by the professor.
     * @param subject The subject taught by the professor.
     */
    public void removeSubject(Subject subject) {
        Subjects.remove(subject);
    }

    /**
     * Gets the salary of the professor.
     * @return The salary of the professor.
     */
    @Override
    public Double getSalary() {
        return Salary;
    }

    /**
     * Changes the salary of the professor.
     * @param amount The new salary amount.
     */
    @Override
    public void changeSalary(Double amount) {
        Salary = amount;
    }
}
