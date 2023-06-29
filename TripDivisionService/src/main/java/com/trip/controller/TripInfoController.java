package com.trip.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trip.model.TripDivisionInfo;
import com.trip.model.TripInfo;
import com.trip.service.TripInfoService;

@RestController
@RequestMapping("api/trip")
public class TripInfoController {

    
	@Autowired
	private TripInfoService tripInfoService;
    
    // @GetMapping("/tripdiv")
		// public ResponseEntity<List<TripDivisionInfo>> getAllTripDivisionInfo(){
		// 	return new ResponseEntity<>(tripDivisionInfoService.getAllTripDivisionInfo(), HttpStatus.OK);
		// }
		
		// @GetMapping("/tripdiv/available")
		// public ResponseEntity<List<TripDivisionInfo>> getAllAvailableTripDivisionInfo() {
		//     return new ResponseEntity<>(tripDivisionInfoService.getAllAvailableTripDivisionInfo(), HttpStatus.OK);
		// }
		
		@GetMapping("/tripinfo/{tripId}")
		public ResponseEntity<TripInfo> getTripInfoById(@PathVariable long trip_ID){
			return new ResponseEntity<TripInfo>(tripInfoService.getTripInfoById(trip_ID), HttpStatus.OK);
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
