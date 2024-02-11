package master.demos.customer_application_service.requests;

import master.demos.customer_application_service.VehiclePerformanceRange;

public record CarInsuranceContractRequest(
        String brand,
        String model,
        String modelSeries,
        String fuelType,
        String vehicleCategory,
        VehiclePerformanceRange performanceRange,
        String insuranceBeginn,

        String policyHolderFirstname,

        String policyHolderLastname,

        String policyHolderAge,

        String policyHolderAddress,

        String policyHolderGender,
) {
}
