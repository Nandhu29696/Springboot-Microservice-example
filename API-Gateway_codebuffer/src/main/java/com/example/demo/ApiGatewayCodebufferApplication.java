package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ApiGatewayCodebufferApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayCodebufferApplication.class, args);
		System.out.println("api gateway..");
	}

}
