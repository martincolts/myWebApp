package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import user.UserController;


@SpringBootApplication
@ComponentScan({"com.example" , "user"})
//@ComponentScan(basePackageClasses = UserController.class)
public class WebAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
		
		
	}
}