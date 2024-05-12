package Enums;

public enum Gender {
    MAN("Man"),
    WOMAN("Woman"),
    OTHER("Other");

    private final String fullName;

    Gender(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }
}