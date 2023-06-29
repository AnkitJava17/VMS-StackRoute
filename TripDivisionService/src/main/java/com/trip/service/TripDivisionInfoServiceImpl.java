package com.trip.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.exception.TripDivisionInfoNotFoundException;
import com.trip.model.TripDivisionInfo;
import com.trip.repository.TripDivisionInfoRepository;

@Service
public class TripDivisionInfoServiceImpl implements TripDivisionInfoService {

    @Autowired 
	private TripDivisionInfoRepository tripDivisionInfoRepository;

    @Override
    public TripDivisionInfo getTripDivisionInfoById(long division_ID) throws TripDivisionInfoNotFoundException {
        // throw new UnsupportedOperationException("Unimplemented method 'getTripDivisionInfoById'");
        Optional<TripDivisionInfo> tripDivisionInfo = tripDivisionInfoRepository.findById(division_ID);
		if (tripDivisionInfo.isPresent()){
			return tripDivisionInfo.get();
		}else{
			throw new TripDivisionInfoNotFoundException("Not Found");
		}
    }
    
}
