package com.fueladvisor.fuelappapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FuelAppApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuelAppApiGatewayApplication.class, args);
    }

}
