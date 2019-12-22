package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


//https://exampledriven.wordpress.com/2016/07/06/spring-cloud-zuul-example/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApiApplication.class, args);
	}
	
//	
//	If a spring Bean extends ZuulFilter then it will be auto registered as a filter. Filters are most commonly used for
//
//	Authentication
//	Logging
//	Serving static content
//	Dynamic routing based on some conditions (A/B testing)
	
	
	
	
//	Main features of Zuul
//
//	Provides a unified access to multiple different microservices
//	Hides internal details of the microservice ecosystem
//	Load balances across multiple service instances
//	Allowes access to services
//	Restricts access to internal only services
//	Looks up services from Eureka
//	Implements filters for authentication or logging purposes

}
