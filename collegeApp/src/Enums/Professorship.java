package Enums;

public enum Professorship {
    ASSISTANT_PROFESSOR("Assistant Professor", "Asst. Prof."),
    ASSOCIATE_PROFESSOR("Associate Professor", "Assoc. Prof."),
    PROFESSOR("Professor", "Prof."),
    DISTINGUISHED_PROFESSOR("Distinguished Professor", "Distinguished Prof."),
    PROFESSOR_OF_PRACTICE("Professor of Practice", "Prof. of Practice"),
    COLLEGIATE_PROFESSOR("Collegiate Professor", "Collegiate Prof."),
    LECTURE("Lecturer", "Lect."),
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
}