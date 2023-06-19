package com.rent.RentalService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rent.RentalService.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
