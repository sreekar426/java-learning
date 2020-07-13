package com.mindtree.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mindtree" })
@EntityScan("com.mindtree.model")
@EnableJpaRepositories("com.mindtree.repository")
public class SpringDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDerbyApplication.class, args);
	}

}
