package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.TripDivisionInfo;


@Repository
public interface TripDivisionInfoRepository extends JpaRepository<TripDivisionInfo,Long> {
	
}
