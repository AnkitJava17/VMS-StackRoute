package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.TripInfo;

@Repository
public interface TripRepository extends JpaRepository<TripInfo,Long> {
	
}
