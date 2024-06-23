package master.demos.basis_permium_calculation_service.util.enums;

public enum SafetyEquipment {
    BASIC("Basic Safety Features"),
    ADVANCED("Advanced Safety Features"),
    PREMIUM("Premium Safety Features");

    private final String description;

    SafetyEquipment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
