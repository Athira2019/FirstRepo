package com.letstart.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApplication {

  
	public static void main(String[] args) {
	
     SpringBootApplication.run(EmployeeApplication.class,args);
	}

}
