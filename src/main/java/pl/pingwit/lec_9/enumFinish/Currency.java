package pl.pingwit.lec_9.enumFinish;

public enum Currency {
    EURO("eur", "Euro"),
    US_DOLLAR("usd", "US dollar"),
    HRYVNA("uah", "Ukranian Hryvna"),
    ZLOTY("pln", "Polski Zloty");

    private final String code;
    private final String fullName;

    Currency(String code, String fullName) {
        this.code = code;
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }
}
