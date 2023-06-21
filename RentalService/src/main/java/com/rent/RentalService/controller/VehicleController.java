package com.rent.RentalService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.service.RentVehicleServiceImpl;

@RestController
@RequestMapping("/api/rentals")
public class VehicleController {
  	@Autowired
    private RentVehicleServiceImpl rentVehicleService;

    
    @PostMapping("/rentDetails")
    public ResponseEntity<RentVehicle> saveRentalInformation(@RequestBody RentVehicle vehicle){
        RentVehicle rent = rentVehicleService.saveVehicle(vehicle);
        return new ResponseEntity<>(rent, HttpStatus.CREATED);
        
    }
    
    @GetMapping("/rentDetails")
    public ResponseEntity<List<RentVehicle>> getRentDetails(){
    return new ResponseEntity<>(rentVehicleService.getRentalsInformation(), HttpStatus.OK);
    }
    
    @GetMapping("/rentDetails/{rentId}")
    public ResponseEntity<RentVehicle> getRentDetailsById(@PathVariable long rentId){
    return new ResponseEntity<>(rentVehicleService.getRentalById(rentId), HttpStatus.OK);
    }
    
}
