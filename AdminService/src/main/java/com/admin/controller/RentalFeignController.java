package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.feignConfig.RentServiceConsumer;
import com.admin.model.RentBike;
import com.admin.model.RentCar;
import com.admin.model.RentVehicleInfo;

@RestController
@RequestMapping("/admin")
public class RentalFeignController {

    @Autowired
    private RentServiceConsumer rentServiceConsumer;

    @GetMapping("/rental/bikes")
	public List<RentBike> getAllBikes()
	{
		return rentServiceConsumer.getAllBikes();
	}
	
	@GetMapping("/rental/cars")
	public List<RentCar> getAllCars()
	{
		return rentServiceConsumer.getAllCars();
	}

    @GetMapping("/info")
	public List<RentVehicleInfo> getRentDetails()
	{
		return rentServiceConsumer.getRentDetails();
	}
}
