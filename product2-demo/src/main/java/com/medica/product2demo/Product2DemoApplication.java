package com.medica.product2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Product2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Product2DemoApplication.class, args);
	}

}

