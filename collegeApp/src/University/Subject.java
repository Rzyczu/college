package University;

import People.Professor;

/**
 * Represents a subject within a curriculum.
 */
public class Subject {
    private String Name;
    private int Hours;
    private Professor Lecturer;

    /**
     * Constructor to initialize a Subject object.
     * @param name The name of the subject.
     * @param hours The number of hours for the subject.
     * @param lecturer The professor lecturing the subject.
     */
    public Subject(String name, int hours, Professor lecturer) {
        Name = name;
        Hours = hours;
        Lecturer = lecturer;
    }

    /**
     * Gets the name of the subject.
     * @return The name of the subject.
     */
    public String getName() {
        return Name;
    }

    /**
     * Gets the number of hours for the subject.
     * @return The number of hours for the subject.
     */
    public int getHours() {
        return Hours;
    }

    /**
     * Gets the lecturer for the subject.
     * @return The lecturer for the subject.
     */
    public Professor getLecturer() {
        return Lecturer;
    }

    /**
     * Generates information about the subject.
     * @return Information about the subject.
     */
    public String getInfo() {
        return "Subject Name: " + Name + "\nHours: " + Hours + ", Lecturer: " + Lecturer.getFullName();
    }

    /**
     * Changes the number of hours for the subject.
     * @param hours The new number of hours.
     */
    public void changeHoursNumber(int hours) {
        Hours = hours;
    }

    /**
     * Changes the lecturer for the subject.
     * @param lecturer The new lecturer.
     */
    public void changeLecturer(Professor lecturer) {
        Lecturer = lecturer;
    }
}
