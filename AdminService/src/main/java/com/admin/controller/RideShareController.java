package com.admin.controller;


import com.admin.feignConfig.RideShare;
import com.admin.model.Car;
import com.admin.model.Rides;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class RideShareController {

    @Autowired
    RideShare rideShare;

    //Insert and fetch car details
    @PostMapping("/rides/saveCarDetails")
    public Car saveCar(@RequestBody Car car){
        return rideShare.saveCar(car);
    }

    @GetMapping("/rides/carDetails")
    public List<Car> getAllCars(){
        return rideShare.getAllCars();
    }

    //Insert and fetch ride Details
    @PostMapping("/rides/bookRides")
    public Rides rideDetails(@RequestBody Rides rides){
        return rideShare.bookRide(rides);
    }

    @GetMapping("/rides/bookingDetails")
    public List<Rides> getBookingDetails(){
        return rideShare.getBookingDetails();
    }

}
