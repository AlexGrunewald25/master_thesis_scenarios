package master.demos.customer_application_service.util.enums;

public enum UsageType {
    PERSONAL("Personal Vehicle"),
    COMMERCIAL("Commercial Vehicle"),
    RENTAL("Rental Vehicle"),
    SPORT("Sport Vehicle"),
    UTILITY("Utility Vehicle"),
    LUXURY("Luxury Vehicle");

    private final String description;

    UsageType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
