package com.rent.RentalService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.service.RentVehicleServiceImpl;

@RestController
@RequestMapping("/api/rentInfo")
public class VehicleController {
  	@Autowired
    private RentVehicleServiceImpl rentVehicleService;

    
    @PostMapping("/booking")
    public ResponseEntity<RentVehicle> saveRentalInformation(@RequestBody RentVehicle vehicle){
        RentVehicle rent = rentVehicleService.saveVehicle(vehicle);
        return new ResponseEntity<>(rent, HttpStatus.CREATED);
        
    }
    
    @GetMapping("/getBike")
    public ResponseEntity<List<RentVehicle>>  getRentDetails(){
    return new ResponseEntity<>(rentVehicleService.getRentalsInformation(), HttpStatus.OK);
    }
}
