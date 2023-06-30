package com.user.service.repositories;

import com.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, String>{

//@Query("SELECT u FROM Users u where u.userEmail = :userEmail")
//public Optional<User> findByUserEmail(String userEmail);
public Optional<User> findByUserName(String userName);

}
