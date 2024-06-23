package master.demos.customer_application_service.configs;

import master.demos.customer_application_service.CustomerApplicationServiceApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BasicPremiumServiceClientConfig {

    @Bean
    public WebClient client(WebClient.Builder builder){
        return builder
                .baseUrl("http://localhost:8082")
                .build();
    }
}
