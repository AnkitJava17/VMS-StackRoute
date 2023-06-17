package com.user.service.controllers;

import com.user.service.entities.User;
import com.user.service.exceptions.UserAlreadyPresentException;
import com.user.service.exceptions.UserNotFoundException;
import com.user.service.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private IUserService userService;

    //mapping for registration/sign-up
    @PostMapping("/register")
    @ExceptionHandler(UserAlreadyPresentException.class)
    public ResponseEntity<User> addUser(@RequestBody User newUser){

        User user = userService.saveUser(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/{email}")
    @ExceptionHandler(UserNotFoundException.class)
     public ResponseEntity<User> getUser(@PathVariable String email){
        User uObj = this.userService.getUser(email);
        return ResponseEntity.ok(uObj);
    }
}
