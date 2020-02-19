package com.example.springboot.basicspringBootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(BasicSpringBootAppApplication.class, args);
		
		for (String name: appContext.getBeanDefinitionNames()) {
			
			System.out.println(name);
		}
		
	}

}
