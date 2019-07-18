package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestAppApplication.class, args);
	}
}
