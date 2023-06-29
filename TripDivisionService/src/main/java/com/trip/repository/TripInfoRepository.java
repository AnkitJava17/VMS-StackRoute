package com.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trip.model.TripInfo;

@Repository
public interface TripInfoRepository extends JpaRepository<TripInfo,Long> {
	public TripInfo findByName(String trip_name);
    
    public Iterable<TripInfo> findByAvailableTrue();

}
