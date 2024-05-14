package People;

import Enums.Gender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Represents a person.
 */
abstract class Person {
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

    /**
     * Constructor to initialize a Person object.
     *
     * @param name         The first name of the person.
     * @param surname      The last name of the person.
     * @param gender       The gender of the person.
     * @param personalCode The personal code of the person.
     * @param birthDate    The birth date of the person.
     * @param email        The email address of the person.
     * @param phone        The phone number of the person.
     * @param address      The address of the person.
     * @param city         The city of the person.
     * @param country      The country of the person.
     * @throws ParseException if the birth date format is invalid.
     */
    public Person(String name, String surname, Gender gender, String personalCode, Date birthDate, String email, String phone, String address, String city, String country) throws ParseException {
        Name = name;
        Surname = surname;
        Gender = gender;
        PersonalCode = personalCode;
        Email = isValidEmail(email) ? email: null;
        Phone = isValidPhoneNumber(phone) ? phone: null;
        Address = address;
        City = city;
        Country = country;
        BirthDate = birthDate;
    }

    /**
     * Generates information about the person.
     *
     * @return Information about the person.
     */
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

    /**
     * Gets the first name of the person.
     *
     * @return The first name of the person.
     */
    public String getName() {
        return Name;
    }

    /**
     * Gets the last name of the person.
     *
     * @return The last name of the person.
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * Gets the gender of the person.
     *
     * @return The gender of the person.
     */
    public Gender getGender() {
        return Gender;
    }

    /**
     * Gets the personal code of the person.
     *
     * @return The personal code of the person.
     */
    public String getPersonalCode() {
        return PersonalCode;
    }

    /**
     * Gets the birth date of the person.
     *
     * @return The birth date of the person.
     */
    public String getBirthDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(BirthDate);
    }

    /**
     * Gets the email address of the person.
     *
     * @return The email address of the person.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Gets the phone number of the person.
     *
     * @return The phone number of the person.
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * Gets the full name of the person.
     *
     * @return The full name of the person.
     */
    public String getFullName() {
        return Name + " " + Surname;
    }

    /**
     * Gets the full address of the person.
     *
     * @return The full address of the person.
     */
    public String getFullAddress() {
        return Address + ", " + City + ", " + Country;
    }

    /**
     * Gets the contact information of the person.
     *
     * @return The contact information of the person.
     */
    public String getContactInfo() {
        return "Phone " + Phone + ", Email " + Email;
    }

    /**
     * Changes the last name of the person.
     *
     * @param surname The new last name.
     */
    public void changeSurname(String surname) {
        Surname = surname;
    }

    /**
     * Changes the email address of the person.
     *
     * @param email The new email address.
     */
    public void changeEmail(String email) {
        if (isValidEmail(email)) {
            Email = email;
        } else {
            System.out.println("Invalid email format. Email not updated.");
        }
    }

    /**
     * Changes the phone number of the person.
     *
     * @param phone The new phone number.
     */
    public void changePhoneNumber(String phone) {
        if (isValidPhoneNumber(phone)) {
            Phone = phone;
        } else {
            System.out.println("Invalid phone number format. Phone number not updated.");
        }
    }

    /**
     * Changes the address of the person.
     *
     * @param address The new address.
     */
    public void changeAddress(String address) {
        Address = address;
    }

    /**
     * Changes the city of the person.
     *
     * @param city The new city.
     */
    public void changeCity(String city) {
        City = city;
    }

    /**
     * Changes the country of the person.
     *
     * @param country The new country.
     */
    public void changeCountry(String country) {
        Country = country;
    }

    /**
     * Validates if an email address has a correct format.
     * @param email The email address to validate.
     * @return True if the email address is valid, otherwise false.
     */
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    /**
     * Validates if a phone number has a correct format.
     * @param phone The phone number to validate.
     * @return True if the phone number is valid, otherwise false.
     */
    private boolean isValidPhoneNumber(String phone) {
        String phoneRegex = "\\d{9}";
        return phone.matches(phoneRegex);
    }
}