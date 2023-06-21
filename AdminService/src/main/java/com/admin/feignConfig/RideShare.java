package com.admin.feignConfig;


import com.admin.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "ride-sharing-service")
public interface RideShare {
    @PostMapping("/cars/addCars")
   public Car saveCar(Car car);

//   @GetMapping("/cars/{carId}")
//   public  List<Car> getCarById(@PathVariable int carId);
    @GetMapping("/cars/getAllCars")
    public List<Car> getAllCarDetails();
}
