package com.mindtree.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.mindtree")
public class SpringRestfulWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulWebservicesApplication.class, args);
	}

}
