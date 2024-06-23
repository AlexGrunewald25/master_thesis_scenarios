package master.demos.basis_permium_calculation_service.mapper;

import master.demos.basis_permium_calculation_service.moduls.BasicPremium;
import master.demos.basis_permium_calculation_service.requests.CarInsuranceBasicPermiumRequest;
import master.demos.basis_permium_calculation_service.response.CarInsuranceBasicPremiumResponse;
import org.springframework.stereotype.Component;

@Component
public class RequestResponseMapper {

    public BasicPremium RequestToEntityMapper(CarInsuranceBasicPermiumRequest request){
        BasicPremium basicPremium = new BasicPremium();
        basicPremium.setPolicyHolderAge(request.policyHolderAge());
        basicPremium.setGender(request.gender());
        basicPremium.setPolicyHolderDrivingExperience(request.policyHolderDrivingExperience());
        basicPremium.setCarType(request.carType());
        basicPremium.setCarAge(request.carAge());
        basicPremium.setCarEnginePerformance(request.carEnginePerformance());
        basicPremium.setSafetyEquipment(request.safetyEquipment());
        basicPremium.setCarKilometerPerYear(request.carKilometerPerYear());
        basicPremium.setUsageType(request.usageType());
        basicPremium.setResidenceType(request.residenceType());
        return new BasicPremium();
    }

    public CarInsuranceBasicPremiumResponse EntityToResponseMapper(BasicPremium basicPremium){
        return new CarInsuranceBasicPremiumResponse(
                basicPremium.getBasicPremium()
        );
    }
}
