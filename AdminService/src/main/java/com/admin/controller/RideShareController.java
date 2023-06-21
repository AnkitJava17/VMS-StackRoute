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

<<<<<<< HEAD
//    @GetMapping("/bookingVCar")
//    public List<Car> getBookingVCar(){
//        return rideShare.getAllCarDetails();
//    }
    @PostMapping("/saveCarDetails")
=======
    @GetMapping("/ride/bookingCar")
    public List<Car> getBookingVCar(){
        return rideShare.getAllCarDetails();
    }

    @PostMapping("/ride/saveCarDetails")
>>>>>>> 5d8b69b0bbc632025902fef8c2e81d0bec09f65e
    public Car saveCar(@RequestBody Car car){
        return rideShare.saveCar(car);
    }
    @GetMapping("/carDetails")
    public List<Car> getAllCars(){
        return rideShare.getAllCars();
    }
}
