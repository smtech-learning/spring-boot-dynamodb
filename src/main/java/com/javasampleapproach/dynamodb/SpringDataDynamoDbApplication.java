package com.thecloudthoughts.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringDataDynamoDbApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataDynamoDbApplication.class, args);
	}
}
