package com.authenticationservice.repository;

import com.authenticationservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthenticationRepository extends JpaRepository<User, String> {
    User findByUserEmailAndUserPassword(String userEmail, String userPassword);
}
