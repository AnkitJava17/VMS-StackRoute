package com.admin.controller;


import com.admin.feignConfig.RideShare;
import com.admin.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class RideShareController {

    @Autowired
    RideShare rideShare;

    @GetMapping("/ride/bookingCar")
    public List<Car> getBookingVCar(){
        return rideShare.getAllCarDetails();
    }

    @PostMapping("/ride/saveCarDetails")
    public Car saveCar(@RequestBody Car car){
        return rideShare.saveCar(car);
    }
}
