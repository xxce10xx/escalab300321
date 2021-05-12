package com.bardalez.pagoSAGA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PagoSagaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagoSagaApplication.class, args);
	}

}
