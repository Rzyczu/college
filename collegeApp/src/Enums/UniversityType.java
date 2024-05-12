package Enums;

public enum UniversityType {
    STATE("State"),
    PRIVATE("Private");

    private final String fullName;

    UniversityType(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }
}
