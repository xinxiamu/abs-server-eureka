package com.abs.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AbsServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbsServerEurekaApplication.class, args);
	}
}
