package master.demos.customer_application_service.controller;

import master.demos.customer_application_service.requests.CarInsuranceContractRequest;
import master.demos.customer_application_service.responses.CarInsuranceOfferDTO;
import master.demos.customer_application_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/getInsuranceOffer")
    public ResponseEntity<CarInsuranceOfferDTO> getInsuranceOffer(@RequestBody CarInsuranceContractRequest carInsuranceContractRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createOffer(carInsuranceContractRequest));
    }
}