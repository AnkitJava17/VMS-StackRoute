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

import com.rent.RentalService.model.Bike;
import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.service.BikeService;
import com.rent.RentalService.service.RentVehicleServiceImpl;

@RestController
@RequestMapping("/api/bike")
public class BikeController {
							
		@Autowired
		private BikeService bikeService;
		
		@GetMapping("/availableBikes")
		public List<Bike> getAllAvailableBikes() {
		    return bikeService.getAvailableBikes();
		}
		
		@GetMapping("/bike/{bikeId}")
		public Bike getBikeById(@PathVariable int bikeId){
			return bikeService.getBikeById(bikeId);
		}
	}
