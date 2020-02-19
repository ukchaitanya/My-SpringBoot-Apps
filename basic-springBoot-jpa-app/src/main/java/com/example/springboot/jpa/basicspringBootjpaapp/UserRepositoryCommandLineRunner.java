package com.example.springboot.jpa.basicspringBootjpaapp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.jpa.basicspringBootjpaapp.entity.User;
import com.example.springboot.jpa.basicspringBootjpaapp.service.UserDAOService;
import com.example.springboot.jpa.basicspringBootjpaapp.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = 
			 LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) {
		User user = new User("Tim","User");
		userRepository.save(user);
		
		Optional<User> userreturned = userRepository.findById(1L);
		log.info("New user fetched: " + userreturned);
		
		List<User> users = userRepository.findAll();
		log.info("all users: " + users);
	}
	

}
