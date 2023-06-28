package com.trip.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.exception.TripInfoNotFoundException;
import com.trip.model.TripInfo;
import com.trip.repository.TripInfoRepository;

@Service
public class TripInfoServiceImpl implements TripInfoService {


    @Autowired
	private TripInfoRepository tripInfoRepository;
	
    @Override
    public TripInfo getTripInfoById(long trip_ID) throws TripInfoNotFoundException {
        Optional<TripInfo> tripInfo = tripInfoRepository.findById(trip_ID);
		if (tripInfo.isEmpty()){
			throw new TripInfoNotFoundException("Trip does not exist");
		}else{
			return tripInfo.get();
		}
        // throw new UnsupportedOperationException("Unimplemented method 'getTripInfoById'");
    }

    @Override
    public TripInfo getTripInfoByName(String trip_name) throws TripInfoNotFoundException {
        // throw new UnsupportedOperationException("Unimplemented method 'getTripInfoByName'");
        TripInfo tripInfo = tripInfoRepository.findByName(trip_name);
		if (tripInfo == null){
			throw new TripInfoNotFoundException("Trip does not exist");
		}else{
			return tripInfo;
		}
    }
    
}
