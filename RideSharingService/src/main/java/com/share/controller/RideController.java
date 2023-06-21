package com.share.controller;

import com.share.model.Car;
import com.share.model.RideShare;
import com.share.service.RideShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200" )
@RestController
@RequestMapping("/rides")
public class RideController {
    @Autowired
    private RideShareService rideShareService;



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
