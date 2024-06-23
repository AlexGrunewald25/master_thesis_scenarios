package master.demos.customer_application_service.util.web;

import master.demos.customer_application_service.requests.CarInsuranceBasicPermiumRequestDTO;
import master.demos.customer_application_service.responses.CarInsuranceBasicPremiumResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class BasicPremiumServiceClient {

    private final WebClient client;

    public BasicPremiumServiceClient() {
        this.client = WebClient.builder().build();
    }

    public CarInsuranceBasicPremiumResponse getBasicPermium(CarInsuranceBasicPermiumRequestDTO request){
        return client.post()
                .uri("http://localhost:8082/getBasicPermium")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(CarInsuranceBasicPremiumResponse.class)
                .block();
    }
}
