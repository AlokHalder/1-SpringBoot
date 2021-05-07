package com.training.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// Example - Simple Dependency Injection

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		ApplicationContext  context = SpringApplication.run(Application.class, args);
		Employee employee = context.getBean(Employee.class);
		employee.display();
		

				
	}

}
