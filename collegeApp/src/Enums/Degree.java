package Enums;

/**
 * Enumeration representing different academic degrees.
 */
public enum Degree {
    BACHELOR("Bachelor's Degree", "B.Sc."),     // Represents a bachelor's degree.
    DOCTORAL("Doctoral Degree", "Ph.D."),       // Represents a doctoral degree.
    MASTER("Master's Degree", "M.Sc."),         // Represents a master's degree.
    TERMINAL("Terminal Degree", "T.D.");        // Represents a terminal degree.

    private final String fullName;
    private final String abbreviation;

    /**
     * Constructor for Degree enum.
     * @param fullName The full name of the academic degree.
     * @param abbreviation The abbreviation of the academic degree.
     */
    Degree(String fullName, String abbreviation) {
        this.fullName = fullName;
        this.abbreviation = abbreviation;
    }

    /**
     * Gets the full name of the academic degree.
     * @return The full name of the academic degree.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets the abbreviation of the academic degree.
     * @return The abbreviation of the academic degree.
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Retrieves the Degree enum constant based on its full name.
     * @param fullName The full name of the academic degree.
     * @return The Degree enum constant.
     * @throws IllegalArgumentException if no enum constant is found with the specified full name.
     */
    public static Degree fromFullName(String fullName) {
        for (Degree degree : Degree.values()) {
            if (degree.getFullName().replaceAll("\\s+", "").equalsIgnoreCase(fullName)) {
                return degree;
            }
        }
        throw new IllegalArgumentException("No enum constant with full name: " + fullName);
    }
}
