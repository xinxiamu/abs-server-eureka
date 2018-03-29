package com.ymu.servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YMuServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YMuServerEurekaApplication.class,args);
	}
}
