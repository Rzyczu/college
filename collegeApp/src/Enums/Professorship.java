package Enums;

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

    Professorship(String fullName, String abbreviation) {
        this.fullName = fullName;
        this.abbreviation = abbreviation;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static Professorship fromFullName(String fullName) {
        for (Professorship professorship : Professorship.values()) {
            if (professorship.getFullName().replaceAll("\\s+", "_").equalsIgnoreCase(fullName)) {
                return professorship;
            }
        }
        throw new IllegalArgumentException("No enum constant with full name: " + fullName);
    }
}