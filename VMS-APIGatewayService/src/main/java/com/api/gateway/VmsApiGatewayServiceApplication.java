package com.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VmsApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmsApiGatewayServiceApplication.class, args);
	}

}
