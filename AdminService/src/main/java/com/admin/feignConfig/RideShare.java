package com.admin.feignConfig;


import com.admin.model.Car;
import com.admin.model.Rides;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "ride-sharing-service" ,url = "http://localhost:8083/api/rides")
public interface RideShare {
    @PostMapping("/addCars")
    public Car saveCar(Car car);

    @GetMapping("/getAllCars")
    public List<Car> getAllCars();

    @PostMapping("/booking")
    public Rides bookRide(Rides rides);

    @GetMapping("/bookingDetails")
    public List<Rides> getBookingDetails();
}
