package master.demos.customer_application_service.requests;
import master.demos.customer_application_service.util.enums.*;

public record CarInsuranceContractRequest(
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
