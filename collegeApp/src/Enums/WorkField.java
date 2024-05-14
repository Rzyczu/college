package Enums;

/**
 * Enumeration representing various work fields in an organization.
 */
public enum WorkField {
    CLEANER("Cleaner"),
    DEANERY("Deanery"),
    GUARD("Guard");

    private final String fullName;

    /**
     * Constructor for WorkField enum.
     * @param fullName The full name of the work field.
     */
    WorkField(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the full name of the work field.
     * @return The full name of the work field.
     */
    public String getName() {
        return fullName;
    }
}
