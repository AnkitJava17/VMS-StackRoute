package com.rent.RentalService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rent.RentalService.model.RentVehicle;

@Repository
public interface RentVehicleRepository extends JpaRepository<RentVehicle, Long> {

}
