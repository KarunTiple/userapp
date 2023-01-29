package com.BikkadIT.Addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(UserAppApplication.class, args);

		Addition addition = context.getBean(Addition.class);
		addition.sum(40, 60);
		
		System.out.println("This is the Addition logic by Another service");


	}

}
