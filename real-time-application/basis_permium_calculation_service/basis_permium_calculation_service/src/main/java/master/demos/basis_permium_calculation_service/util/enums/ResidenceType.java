package master.demos.basis_permium_calculation_service.util.enums;

public enum ResidenceType {
    HOUSE("House"),
    APARTMENT("Apartment"),
    TOWNHOUSE("Townhouse"),
    RANCH("Ranch"),
    FARMHOUSE("Farmhouse");

    private final String displayName;

    ResidenceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
