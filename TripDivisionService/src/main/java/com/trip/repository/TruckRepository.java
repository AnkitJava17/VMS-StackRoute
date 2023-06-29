package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.Truck;


@Repository
public interface TruckRepository extends JpaRepository<Truck,Long> {

	public Truck findByName(String Name);
    
    public Iterable<Truck> findByAvailableTrue();

}
