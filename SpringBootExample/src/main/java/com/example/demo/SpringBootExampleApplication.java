package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bean.Employee;

//@RestController
@SpringBootApplication
public class SpringBootExampleApplication {
	
/*	@RequestMapping("/hellorest")
	String helloRest() {
		return("Hello World. This is produced by the rest conntroller method");
	}*/

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootExampleApplication.class, args);
		Employee1 employee=context.getBean(Employee1.class);
		employee.show();
	}
}