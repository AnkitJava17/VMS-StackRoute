package com.user.service;

import com.user.service.entities.Role;
import com.user.service.entities.User;
import com.user.service.entities.UserRole;
import com.user.service.exceptions.UserAlreadyPresentException;
import com.user.service.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication implements CommandLineRunner {

		@Autowired
		private IUserService userService;

//		can use this if password is to be encoded
//		@Autowired
//		private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			User user = new User();
			user.setUserEmail("admin@gmail.com");
			user.setUserName("admin");
			user.setUserPassword("admin");
//			user.setUserCity("N/A");
			user.setUserMobile("8888888888");
			user.setProfile("default.png");

			Role role = new Role();
			role.setRoleId(44);
			role.setRoleName("ADMIN");

			Set<UserRole> userRoleSet = new HashSet<>();
			UserRole userRole = new UserRole();
			userRole.setRole(role);
			userRole.setUser(user);

			userRoleSet.add(userRole);

			User user1 = this.userService.saveUser(user,userRoleSet);


		}catch (UserAlreadyPresentException e){
			e.printStackTrace();
		}

	}
}
