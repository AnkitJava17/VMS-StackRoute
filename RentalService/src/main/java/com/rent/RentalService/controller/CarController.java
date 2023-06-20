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
import com.rent.RentalService.model.Car;
import com.rent.RentalService.model.RentVehicle;
import com.rent.RentalService.service.CarService;
import com.rent.RentalService.service.RentVehicleServiceImpl;

@RestController
@RequestMapping("api/car")
public class CarController {
	
	@Autowired
	private CarService carService;
		
	@GetMapping("/availableCars")
	public List<Car> getAllAvailableCars() {
	    return carService.getAvailableCars();
	}

	@GetMapping("/car/{carId}")
	public Car getCarById(@PathVariable int carId){
		return carService.getCarById(carId);
	}
	
}
