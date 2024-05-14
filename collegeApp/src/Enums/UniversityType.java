package Enums;

/**
 * Enumeration representing different types of universities.
 */
public enum UniversityType {
    STATE("State"),      // Represents a state university.
    PRIVATE("Private");  // Represents a private university.

    private final String fullName;

    /**
     * Constructor for UniversityType enum.
     * @param fullName The full name of the university type.
     */
    UniversityType(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the full name of the university type.
     * @return The full name of the university type.
     */
    public String getName() {
        return fullName;
    }
}
