package com.user.service.exceptions;

public class UserAlreadyPresentException extends RuntimeException {
    public UserAlreadyPresentException(String s) {
        super(s);
    }
}
