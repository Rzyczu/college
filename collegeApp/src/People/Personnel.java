package People;

import Enums.Gender;
import Enums.WorkField;

import java.text.ParseException;

public
class Personnel extends Person {
    public WorkField Field;

    public
    Personnel(String name, String surname, Gender gender, String personalCode, String birthDate, String email, String phone, String address, String city, String country, WorkField field) throws ParseException {
        super(name, surname, gender, personalCode, birthDate, email, phone, address, city, country);
        Field = field;
    }

    @Override
    public
    String getInfo() {
        return "Work Field: " + Field +
                super.getInfo() + "\n";
    }
}
