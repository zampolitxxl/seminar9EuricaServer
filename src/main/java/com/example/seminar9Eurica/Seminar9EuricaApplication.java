package com.example.seminar9Eurica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Seminar9EuricaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Seminar9EuricaApplication.class, args);
	}

}
