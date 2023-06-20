package com.share.controller;

import com.share.model.Cars;
import com.share.model.RideShare;
import com.share.service.CarService;
import com.share.service.RideShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins ="http://localhost:4200" )
@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private RideShareService rideShareService;

    @GetMapping("/available")
    public List<Cars> getAvailableCars() {
        return carService.getAvailableCars();
    }

   @PostMapping("/booking")
    public ResponseEntity<RideShare> bookRide(@RequestBody RideShare rideShare){
       RideShare rides = rideShareService.insertRideRecord(rideShare);
       return new ResponseEntity<>(rides, HttpStatus.CREATED);
   }

   @GetMapping("/bookingDetails")
    public ResponseEntity<List<RideShare>>  getBookingDetails(){
        List<RideShare> rideDetails = rideShareService.getBookingDetails();
        return ResponseEntity.ok(rideDetails);
   }

}
