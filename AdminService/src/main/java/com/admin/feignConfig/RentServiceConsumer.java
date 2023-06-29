package com.admin.feignConfig;

import org.springframework.web.bind.annotation.GetMapping;

import com.admin.model.RentBike;
import com.admin.model.RentCar;
import com.admin.model.RentVehicleInfo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="rental-service", url = "http://localhost:8082/api")
public interface RentServiceConsumer {
    
    @GetMapping("/rentals/bikes")
    public List<RentBike> getAllBikes();

    @GetMapping("/rentals/cars")
    public List<RentCar> getAllCars();

    @GetMapping("rentals/rentDetails")
    public List<RentVehicleInfo> getRentDetails();
}
