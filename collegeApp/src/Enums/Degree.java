package Enums;

public enum Degree{
    BACHELOR("Bachelor's Degree", "B.Sc."),
    DOCTORAL("Doctoral Degree", "Ph.D."),
    MASTER("Master's Degree", "M.Sc."),
    TERMINAL("Terminal Degree", "T.D.");

    private final String fullName;
    private final String abbreviation;

    Degree(String fullName, String abbreviation) {
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
