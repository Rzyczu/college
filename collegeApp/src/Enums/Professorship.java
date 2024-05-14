package Enums;

/**
 * Enumeration representing different professorship levels.
 */
public enum Professorship {
    ASSISTANT_PROFESSOR("Assistant Professor", "Asst. Prof."),
    ASSOCIATE_PROFESSOR("Associate Professor", "Assoc. Prof."),
    PROFESSOR("Professor", "Prof."),
    DISTINGUISHED_PROFESSOR("Distinguished Professor", "Distinguished Prof."),
    PROFESSOR_OF_PRACTICE("Professor of Practice", "Prof. of Practice"),
    COLLEGIATE_PROFESSOR("Collegiate Professor", "Collegiate Prof."),
    LECTURER("Lecturer", "Lect."),
    RESEARCH_PROFESSOR("Research Professor", "Research Prof.");

    private final String fullName;
    private final String abbreviation;

    /**
     * Constructor for Professorship enum.
     * @param fullName The full name of the professorship.
     * @param abbreviation The abbreviation of the professorship.
     */
    Professorship(String fullName, String abbreviation) {
        this.fullName = fullName;
        this.abbreviation = abbreviation;
    }

    /**
     * Gets the full name of the professorship.
     * @return The full name of the professorship.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets the abbreviation of the professorship.
     * @return The abbreviation of the professorship.
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Retrieves the Professorship enum constant based on its full name.
     * @param fullName The full name of the professorship.
     * @return The Professorship enum constant.
     * @throws IllegalArgumentException if no enum constant is found with the specified full name.
     */
    public static Professorship fromFullName(String fullName) {
        for (Professorship professorship : Professorship.values()) {
            if (professorship.getFullName().replaceAll("\\s+", "_").equalsIgnoreCase(fullName)) {
                return professorship;
            }
        }
        throw new IllegalArgumentException("No enum constant with full name: " + fullName);
    }
}
