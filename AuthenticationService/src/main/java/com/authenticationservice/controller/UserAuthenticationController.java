package com.authenticationservice.controller;

import com.authenticationservice.exception.UserAlreadyExistsException;
import com.authenticationservice.exception.UserNotFoundException;
import com.authenticationservice.model.User;
import com.authenticationservice.service.UserAuthenticationService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class UserAuthenticationController {

    private static final Logger logger = LoggerFactory.getLogger(UserAuthenticationController.class);
    private static final long EXPIRATION_TIME = 100_00_000;

    @Autowired
    private UserAuthenticationService authenticationService;

    public UserAuthenticationController(UserAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/api/v1/auth/register")
    public ResponseEntity<?> createUser(@RequestBody User user) {

        try {
            Map<String, String> map = new HashMap<String, String>();
            logger.info("Inside create user");
            logger.info("User " + user.getUserName() + " userEmail " + user.getUserEmail() + " userpassword "
                    + user.getUserPassword());
            authenticationService.saveUser(user);
            map.put(user.getUserEmail(),"Sucessfully registred");
            return new ResponseEntity<>(map, HttpStatus.CREATED);

        } catch (UserAlreadyExistsException e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }

    }

    @PostMapping("/api/v1/auth/login")
    public ResponseEntity<?> validateUser(@RequestBody User user) {
        Map<String, String> map = new HashMap<String, String>();
        // first validate the credentials
        try {
            authenticationService.findByUserEmailAndUserPassword(user.getUserEmail(), user.getUserPassword());
            //logger.info("user " + user + user.getUserId());

            map.put("token", getToken(user.getUserEmail()));
            map.put("message", "Successfully Logged in");

            return new ResponseEntity<>(map, HttpStatus.OK);

        } catch (UserNotFoundException e) {

            e.printStackTrace();


            return new ResponseEntity<>("Invalid User...Please try again", HttpStatus.UNAUTHORIZED);
        } catch (Exception e) {

            e.printStackTrace();

            return new ResponseEntity<>("server down..please try after some",HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    private String getToken(String userID) throws Exception {

        return Jwts.builder().setSubject(userID).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();
        // Builds the JWT and serializes it to a compact, URL-safe string
        /*
         * return Jwts.builder().setSubject(userID). setIssuedAt(new Date()).
         * setExpiration(new Date(System.currentTimeMillis()+EXPIRATION_TIME))
         * .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
         */}
}
