package com.vms.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VmsDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmsDiscoveryServiceApplication.class, args);
	}

}
