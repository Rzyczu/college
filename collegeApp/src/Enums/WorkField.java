package Enums;

public enum WorkField {
    CLEANER("Cleaner"),
    DEANERY("Deanery"),
    GUARD("Guard");

    private final String fullName;

    WorkField(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }
}