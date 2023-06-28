package com.trip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trip.model.TripDivisionInfo;
import com.trip.service.TripDivisionInfoServiceImpl;

@RestController
@RequestMapping("api/trip")
public class TripDivisionInfoController {
    
    @Autowired
		private TripDivisionInfoServiceImpl tripDivisionInfoService;
		
		// @GetMapping("/tripdiv")
		// public ResponseEntity<List<TripDivisionInfo>> getAllTripDivisionInfo(){
		// 	return new ResponseEntity<>(tripDivisionInfoService.getAllTripDivisionInfo(), HttpStatus.OK);
		// }
		
		// @GetMapping("/tripdiv/available")
		// public ResponseEntity<List<TripDivisionInfo>> getAllAvailableTripDivisionInfo() {
		//     return new ResponseEntity<>(tripDivisionInfoService.getAllAvailableTripDivisionInfo(), HttpStatus.OK);
		// }
		
		@GetMapping("/tripdiv/{divisionId}")
		public ResponseEntity<TripDivisionInfo> getTripDivisionById(@PathVariable long division_ID){
			return new ResponseEntity<TripDivisionInfo>(tripDivisionInfoService.getTripDivisionInfoById(division_ID), HttpStatus.OK);
		}

		// @PostMapping("/bikes")
		// public ResponseEntity<Bike> saveBike(@RequestBody Bike bike){
		// 	Bike bikeAdded = bikeService.saveBike(bike);
		// 	return new ResponseEntity<Bike>(bikeAdded, HttpStatus.CREATED);
		// }

		// @PutMapping("/bikes/{bikeId}")
		// public ResponseEntity<Bike> updateBike(@RequestBody Bike bikeUp, @PathVariable long bikeId){
		// 	Bike bike = bikeService.updateBike(bikeUp, bikeId);
		// 	return new ResponseEntity<Bike>(bike,HttpStatus.CREATED);
		// }

		// @DeleteMapping("/bikes/{bikeId}")
		// public ResponseEntity<?> deleteBike(@PathVariable long bikeId){
		// 	bikeService.deleteBike(bikeId);
		// 	return new ResponseEntity<>(true,HttpStatus.OK);
		// }



}
