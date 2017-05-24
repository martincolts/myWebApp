package com.example;

import org.hibernate.service.spi.InjectService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.example" , "user"})
@AutoConfigurationPackage
public class WebAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}
	
}