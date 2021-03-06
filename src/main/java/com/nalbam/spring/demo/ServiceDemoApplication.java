package com.nalbam.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(ServiceDemoApplication.class, args);
    }

}
