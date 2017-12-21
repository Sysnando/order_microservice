package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * With the dependencies established, we start coding. The first class that we create, 
 * that we call Application, will be identical in all three projects, because it only 
 * works as an initiator to Spring Boot - as defined by @SpringBootApplication annotation - 
 * rising a Spring context and the embedded server:
 * 
 * @author sisnando
 * Date: 2014-06-17
 */
@SpringBootApplication
public class Application {
	public static void main(String []args){
		SpringApplication.run(Application.class);
	}
}
