package com.share.feignConfig;

import com.share.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "admin-service")
public interface CarDetails {

   @GetMapping("/cars/{carId}")
   public  List<Car> getCarById(@PathVariable int carId);
    @GetMapping("/cars/getAllCars")
    public List<Car> getAllCarDetails();
}
