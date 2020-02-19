package com.example.springboot.jpa.basicspringBootjpaapp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.jpa.basicspringBootjpaapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	 

}
