package People;

import Enums.Gender;
import Enums.WorkField;

import java.text.ParseException;

public
class Personnel extends Person implements Employee {
    public WorkField Field;
    private Double Salary;

    public
    Personnel(String name, String surname, Gender gender, String personalCode, String birthDate, String email, String phone, String address, String city, String country, Double salary, WorkField field) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        Field = field;
        Salary = salary;
    }

    @Override
    public
    String getInfo() {
        return "Work Field: " + Field +
                super.getInfo() + "\n";
    }

    @Override
    public void changeSalary(Double amount) {
        Salary = amount;}

    @Override
    public Double getSalary() {
        return Salary;
    }

}
