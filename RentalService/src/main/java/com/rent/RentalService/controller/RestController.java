package com.rent.RentalService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rent.RentalService.model.Car;
import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.service.BikeService;
import com.rent.RentalService.service.CarService;
import com.rent.RentalService.service.RentVehicleService;
import com.rent.RentalService.service.RentVehicleServiceImpl;

@Controller
public class RestController {
	
	@Autowired
	private RentVehicleServiceImpl rentVehicleService;
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private BikeService bikeService;
	
	@GetMapping("/available")
	public List<Car> getAllAvailableCars() {
	    return carService.getAvailableCars();
	}
	
	@PostMapping("/booking")
	public ResponseEntity<RentVehicle> saveRentalInformation(@RequestBody RentVehicle vehicle){
		RentVehicle rent = rentVehicleService.saveVehicle(vehicle);
		return new ResponseEntity<>(rent, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/bookingDetails")
	public ResponseEntity<List<RentVehicle>>  getBookingDetails(){
		return null;
	    
	}
}
