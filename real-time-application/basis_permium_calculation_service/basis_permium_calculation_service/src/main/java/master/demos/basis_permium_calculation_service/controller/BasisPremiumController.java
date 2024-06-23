package master.demos.basis_permium_calculation_service.controller;

import master.demos.basis_permium_calculation_service.requests.CarInsuranceBasicPermiumRequest;
import master.demos.basis_permium_calculation_service.response.CarInsuranceBasicPremiumResponse;
import master.demos.basis_permium_calculation_service.service.BasicPremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasisPremiumController {

    private final BasicPremiumService basicPremiumService;


    @Autowired
    public BasisPremiumController(BasicPremiumService basicPremiumService) {
        this.basicPremiumService = basicPremiumService;
    }

    @PostMapping("/getBasicPermium")
    public ResponseEntity<CarInsuranceBasicPremiumResponse> calculateBasicPremium(@RequestBody CarInsuranceBasicPermiumRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(basicPremiumService.calculateBasicPremium(request));
    }
}
