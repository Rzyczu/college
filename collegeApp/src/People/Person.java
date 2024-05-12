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
    protected String PersonalCode;
    protected Date BirthDate;
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
        Email = email;
        Phone = phone;
        Address = address;
        City = city;
        Country = country;
        BirthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
    }

    public
    String getInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Full Name: " + getFullName() + "\n" +
                "Surname: " + Surname + "\n" +
                "Gender: " + Gender.getName() + "\n" +
                "Personal Code: " + PersonalCode + "\n" +
                "Birth Date: " + dateFormat.format(BirthDate) + "\n" +
                "Email: " + Email + "\n" +
                "Phone: " + Phone + "\n" +
                "Address: " + getFullAddress();
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
        Email = email;
    }

    public
    void changePHoneNumber(String phone) {
        Phone = phone;
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


}
