package master.demos.basis_permium_calculation_service.requests;

import master.demos.basis_permium_calculation_service.util.enums.*;

public record CarInsuranceBasicPermiumRequest(
        int policyHolderAge,

        Gender gender,

        int policyHolderDrivingExperience,

        CarType carType,

        int carAge,

        int carEnginePerformance,

        SafetyEquipment safetyEquipment,

        int carKilometerPerYear,

        UsageType usageType,

        ResidenceType residenceType
) {
}
