package com.share;

import com.share.model.Car;
import com.share.model.RideShare;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

//@EntityScan(basePackageClasses = {RideShare.class, Car.class},
//		excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Car.class))
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class RideSharingServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(RideSharingServiceApplication.class, args);
	}

}
