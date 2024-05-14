package Enums;

/**
 * Enumeration representing different genders.
 */
public enum Gender {
    MAN("Man"),       // Represents the male gender.
    WOMAN("Woman"),   // Represents the female gender.
    OTHER("Other");   // Represents other genders.

    private final String fullName;

    /**
     * Constructor for Gender enum.
     * @param fullName The full name of the gender.
     */
    Gender(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the full name of the gender.
     * @return The full name of the gender.
     */
    public String getName() {
        return fullName;
    }
}
