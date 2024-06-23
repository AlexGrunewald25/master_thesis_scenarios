package master.demos.customer_application_service.util.mapper;

import master.demos.customer_application_service.requests.CarInsuranceBasicPermiumRequestDTO;
import master.demos.customer_application_service.requests.CarInsuranceContractRequest;
import master.demos.customer_application_service.responses.CarInsuranceBasicPremiumResponse;
import master.demos.customer_application_service.responses.CarInsuranceOfferDTO;
import master.demos.customer_application_service.util.models.CarInsuranceOffer;
import org.springframework.stereotype.Component;

@Component
public class RequestResponseMapper {
    public double basicPremiumResponseToDouble(CarInsuranceBasicPremiumResponse response){
        double basicPremium;
        return basicPremium = response.basicPremium();
    }

    public CarInsuranceBasicPermiumRequestDTO toDTO(CarInsuranceContractRequest request){
        return new CarInsuranceBasicPermiumRequestDTO(
                request.policyHolderAge(),
                request.gender(),
                request.policyHolderDrivingExperience(),
                request.carType(),
                request.carAge(),
                request.carEnginePerformance(),
                request.safetyEquipment(),
                request.carKilometerPerYear(),
                request.usageType(),
                request.residenceType());
    }

    public CarInsuranceContractRequest toEntity(CarInsuranceBasicPermiumRequestDTO dto){
        return new CarInsuranceContractRequest(
                dto.policyHolderAge(),
                dto.gender(),
                dto.policyHolderDrivingExperience(),
                dto.carType(),
                dto.carAge(),
                dto.carEnginePerformance(),
                dto.safetyEquipment(),
                dto.carKilometerPerYear(),
                dto.usageType(),
                dto.residenceType());
    }

    public CarInsuranceOfferDTO OfferEntityToDTO(CarInsuranceOffer offer){
        return new CarInsuranceOfferDTO(
                offer.getBasicPremium()
        );
    }
}
