package com.rent.RentalService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rent.RentalService.model.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
