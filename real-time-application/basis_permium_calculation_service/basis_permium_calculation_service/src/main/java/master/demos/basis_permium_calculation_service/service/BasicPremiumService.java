package master.demos.basis_permium_calculation_service.service;

import master.demos.basis_permium_calculation_service.mapper.RequestResponseMapper;
import master.demos.basis_permium_calculation_service.moduls.BasicPremium;
import master.demos.basis_permium_calculation_service.requests.CarInsuranceBasicPermiumRequest;
import master.demos.basis_permium_calculation_service.response.CarInsuranceBasicPremiumResponse;
import org.springframework.stereotype.Service;

@Service
public class BasicPremiumService {

    private final RequestResponseMapper mapper;

    public BasicPremiumService(RequestResponseMapper mapper) {
        this.mapper = mapper;
    }

    public CarInsuranceBasicPremiumResponse calculateBasicPremium(CarInsuranceBasicPermiumRequest request){
        BasicPremium basicPremium = mapper.RequestToEntityMapper(request);
        calculate(basicPremium);
        return mapper.EntityToResponseMapper(basicPremium);
    }

    private BasicPremium calculate(BasicPremium basicPremium){
        basicPremium.setBasicPremium(500);
        return basicPremium;
    }

}
