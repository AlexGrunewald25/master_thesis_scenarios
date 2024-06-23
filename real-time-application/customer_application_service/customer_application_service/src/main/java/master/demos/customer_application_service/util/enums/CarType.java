package master.demos.customer_application_service.util.enums;

public enum CarType {
    SEDAN("Sedan", "A passenger car in a three-box configuration with separate compartments for engine, passenger, and cargo."),
    SUV("SUV", "Sport Utility Vehicle, combines elements of road-going passenger cars with features from off-road vehicles."),
    COUPE("Coupe", "A car with a fixed-roof body style that is shorter than a sedan or saloon of the same model."),
    CONVERTIBLE("Convertible", "A car that can convert between an enclosed and an open-air mode."),
    HATCHBACK("Hatchback", "A car with a hatch-type rear door that opens upwards."),
    STATION_WAGON("Station Wagon", "A car with a full-height body all the way to the rear; the rear cargo area can be accessed via a door."),
    PICKUP("Pickup", "A light motor vehicle with an open-top rear cargo area.");

    private final String displayName;
    private final String description;

    CarType(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }
}
