package com.trip.exception;

public class TruckAlreadyExistsException extends RuntimeException {
	public TruckAlreadyExistsException(String s){
        super(s);
    }
}
