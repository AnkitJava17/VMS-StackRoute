package com.rent.RentalService.exception;

public class CarAlreadyExistsException extends RuntimeException {
	public CarAlreadyExistsException(String s){
        super(s);
    }
}
