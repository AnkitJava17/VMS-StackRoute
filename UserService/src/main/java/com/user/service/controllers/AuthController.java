package com.user.service.controllers;

import com.user.service.dto.AuthRequest;
import com.user.service.entities.Role;
import com.user.service.entities.User;
import com.user.service.entities.UserRole;
import com.user.service.exceptions.UserAlreadyPresentException;
import com.user.service.exceptions.UserNotFoundException;
import com.user.service.services.IUserService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.net.Authenticator;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private IUserService userService;

//    @Autowired
//    private AuthenticationManager authenticationManager;

    //mapping for registration/sign-up
    @PostMapping("/register")
    @ExceptionHandler(UserAlreadyPresentException.class)
    public ResponseEntity<User> addUser(@RequestBody User newUser) throws Exception {

        newUser.setProfile("default.png");
        newUser.setUserPassword(newUser.getUserPassword());
        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(45);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(newUser);
        userRole.setRole(role);
        roles.add(userRole);
        User user = userService.saveUser(newUser,roles);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/{userName}")
    @ExceptionHandler(UserNotFoundException.class)
     public ResponseEntity<User> getUser(@PathVariable String userName){
        User uObj = this.userService.getUser(userName);
        return ResponseEntity.ok(uObj);
    }

    //login
//    @PostMapping("/login")
//    public String getToken(@RequestBody AuthRequest authRequest){
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
//
//    }
}
