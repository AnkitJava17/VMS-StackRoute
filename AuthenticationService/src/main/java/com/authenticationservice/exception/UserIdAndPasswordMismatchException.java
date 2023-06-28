package com.authenticationservice.exception;

public class UserIdAndPasswordMismatchException extends Exception {

    public UserIdAndPasswordMismatchException(String message) {
        super(message);
    }
}
