package com.rent.RentalService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rent.RentalService.model.Bike;
import com.rent.RentalService.repository.BikeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class BikeServiceImpl implements BikeService {

	@Autowired 
	private BikeRepository bikeRepository;
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Bike> getAllBike(){
		return bikeRepository.findAll();
	}
	
	public Bike getBikeById(int id) {
		return bikeRepository.getById(id);
	}
	
	public void saveBike(Bike bike) {
		bikeRepository.save(bike);
	}

	@Override
	public List<Bike> findAllByAvailable(boolean available) {
		String query = "SELECT b FROM Bike HERE b.available = :available";
		return entityManager.createQuery(query, Bike.class)
                .setParameter("available", available)
                .getResultList();
	}

	@Override
	public List<Bike> getAvailableBikes() {
		return findAllByAvailable(true);
	}
	
}
