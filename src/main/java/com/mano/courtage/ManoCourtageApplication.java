package com.mano.courtage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Enable component-scanning and auto configuration
//SpringBootApplication combines: @Configuration, @ComponentScan, @EnableAutoConfiguration
public class ManoCourtageApplication {

	public static void main(String[] args) {
		//Bootstrap the application
		SpringApplication.run(ManoCourtageApplication.class, args);
	}
}
