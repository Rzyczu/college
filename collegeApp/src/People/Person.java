package People;

import Enums.Gender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract
class Person {
    protected String Name;
    protected String Surname;
    protected Gender Gender;
    protected final String PersonalCode;
    protected final Date BirthDate;
    protected String Email;
    protected String Phone;
    protected String Address;
    protected String City;
    protected String Country;

    public
    Person(String name, String surname, Gender gender, String personalCode, String birthDate, String email, String phone, String address, String city, String country) throws ParseException {     //birthDate Format yyyy-MM-dd
        Name = name;
        Surname = surname;
        Gender = gender;
        PersonalCode = personalCode;
        Email = isValidEmail(email) ? email : null;
        Phone = isValidPhoneNumber(phone) ? phone : null;
        Address = address;
        City = city;
        Country = country;
        BirthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Full Name: ").append(getFullName()).append("\n");
        info.append("Surname: ").append(getSurname()).append("\n");
        info.append("Gender: ").append(getGender().getName()).append("\n");
        info.append("Personal Code: ").append(getPersonalCode()).append("\n");
        info.append("Birth Date: ").append(getBirthDate()).append("\n");
        info.append("Email: ").append(getEmail()).append("\n");
        info.append("Phone: ").append(getPhone()).append("\n");
        info.append("Address: ").append(getFullAddress());
        return info.toString();
    }

    public
    String getName() {
        return Name;
    }

    public
    String getSurname() {
        return Surname;
    }

    public
    Gender getGender() {
        return Gender;
    }

    public
    String getPersonalCode() {
        return PersonalCode;
    }

    public
    String getBirthDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(BirthDate);
    }

    public
    String getEmail() {
        return Email;
    }

    public
    String getPhone() {
        return Phone;
    }

    public
    String getFullName() {
        return Name + " " + Surname;
    }

    public
    String getFullAddress() {
        return Address + ", " + City + ", " + Country;
    }

    public
    String getContactInfo() {
        return "Phone " + Phone + ", Email " + Email;
    }

    public
    void changeSurname(String surname) {
        Surname = surname;
    }

    public
    void changeEmail(String email) {
        if (isValidEmail(email)) {
            Email = email;
        } else {
            System.out.println("Invalid email format. Email not updated.");
        }
    }

    public
    void changePhoneNumber(String phone) {
        if (isValidPhoneNumber(phone)) {
            Phone = phone;
        } else {
            System.out.println("Invalid phone number format. Phone number not updated.");
        }
    }

    public
    void changeAddress(String address) {
        Address = address;
    }

    public
    void changeCity(String city) {
        City = city;
    }

    public
    void changeCountry(String country) {
        Country = country;
    }

    private
    boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    private
    boolean isValidPhoneNumber(String phone) {
        String phoneRegex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        return phone.matches(phoneRegex);
    }
}
