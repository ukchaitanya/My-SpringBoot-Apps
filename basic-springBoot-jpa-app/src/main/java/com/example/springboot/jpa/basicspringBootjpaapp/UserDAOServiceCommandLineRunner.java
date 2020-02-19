package com.example.springboot.jpa.basicspringBootjpaapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.jpa.basicspringBootjpaapp.entity.User;
import com.example.springboot.jpa.basicspringBootjpaapp.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = 
			 LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... arg0) {
		User user = new User("Jhon","Admin");
		long id = userDAOService.insert(user);
		log.info("New user craeted: " + user);
	}
	

}
