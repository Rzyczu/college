package People;

import Enums.Gender;
import Enums.WorkField;

import java.text.ParseException;
import java.util.Date;

/**
 * Represents personnel in an organization.
 */
public class Personnel extends Person implements Employee {
    public WorkField Field;
    private Double Salary;

    /**
     * Constructor to initialize a Personnel object.
     * @param name The first name of the personnel.
     * @param surname The last name of the personnel.
     * @param gender The gender of the personnel.
     * @param personalCode The personal code of the personnel.
     * @param birthDate The birth date of the personnel.
     * @param email The email address of the personnel.
     * @param phone The phone number of the personnel.
     * @param address The address of the personnel.
     * @param city The city of the personnel.
     * @param country The country of the personnel.
     * @param salary The salary of the personnel.
     * @param field The work field of the personnel.
     * @throws ParseException if the birth date format is invalid.
     */
    public Personnel(String name, String surname, Gender gender, String personalCode, Date birthDate, String email, String phone, String address, String city, String country, Double salary, WorkField field) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        Field = field;
        Salary = salary;
    }

    /**
     * Gets the work field of the personnel.
     * @return The work field of the personnel.
     */
    public WorkField getField() {
        return Field;
    }

    /**
     * Generates information about the personnel.
     * @return Information about the personnel.
     */
    @Override
    public String getInfo() {
        return "Work Field: " + Field.getName() + "\n" +
                super.getInfo() + "\n";
    }

    /**
     * Changes the salary of the personnel.
     * @param amount The new salary amount.
     */
    @Override
    public void changeSalary(Double amount) {
        Salary = amount;
    }

    /**
     * Gets the salary of the personnel.
     * @return The salary of the personnel.
     */
    @Override
    public Double getSalary() {
        return Salary;
    }
}
