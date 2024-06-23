package master.demos.customer_application_service.service;

import master.demos.customer_application_service.requests.CarInsuranceBasicPermiumRequestDTO;
import master.demos.customer_application_service.requests.CarInsuranceContractRequest;
import master.demos.customer_application_service.responses.CarInsuranceBasicPremiumResponse;
import master.demos.customer_application_service.responses.CarInsuranceOfferDTO;
import master.demos.customer_application_service.util.web.BasicPremiumServiceClient;
import master.demos.customer_application_service.util.mapper.RequestResponseMapper;
import master.demos.customer_application_service.util.models.CarInsuranceOffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private final BasicPremiumServiceClient basicPremiumServiceClient;

    private final RequestResponseMapper mapper;

    public CustomerService(BasicPremiumServiceClient basicPremiumServiceClient, RequestResponseMapper mapper) {
        this.basicPremiumServiceClient = basicPremiumServiceClient;
        this.mapper = mapper;
    }

    public CarInsuranceOfferDTO createOffer(CarInsuranceContractRequest carInsuranceContractRequest){
        return calculateOffer(carInsuranceContractRequest);
    }


    private double calculateBasicPremium(CarInsuranceBasicPermiumRequestDTO request){
        CarInsuranceBasicPremiumResponse basicPremium = basicPremiumServiceClient.getBasicPermium(request);
        return mapper.basicPremiumResponseToDouble(basicPremium);
    }

    private CarInsuranceOfferDTO calculateOffer(CarInsuranceContractRequest carInsuranceContractRequest){
        CarInsuranceBasicPermiumRequestDTO dto = mapper.toDTO(carInsuranceContractRequest);
        double basicPremium = calculateBasicPremium(dto);
        CarInsuranceOffer offer = new CarInsuranceOffer();
        offer.setBasicPremium(calculateBasicPremium(dto));
        return mapper.OfferEntityToDTO(offer);
    }

}
