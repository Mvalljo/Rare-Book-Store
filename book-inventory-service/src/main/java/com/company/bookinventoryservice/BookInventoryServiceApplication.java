package com.company.bookinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInventoryServiceApplication.class, args);
	}

}
