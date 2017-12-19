package com.microservice.config;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * In this class, which uses the @Configuration Spring annotation to indicate  
 * to the framework that it is a resource configuration class, we set the Jersey, 
 * which is our ResourceManager responsible for exposing REST services for the 
 * consumers.In a real application, this class would be also creating datasources for access to 
 * databases and other resources, but in order to keep it simple enough to be able to focus on the 
 * Spring Boot, we will use mocks to represent the data access.
 * 
 *  This class, one of the new features in the Spring Framework, is a standardized and very simple 
 *  interface that facilitates the consumption of REST services
 *  
 * @author sisnando
 * 
 * Data: 2014-06-17
 *
 */
@Configuration
public class ApplicationConfig {

	@Named
	static class JerseyConfig extends ResourceConfig {
		public JerseyConfig() {
			this.packages("com.microservice.rest");
		}
	}
	
	/**
	 * Very simple interface that facilitates the consumption of REST services
	 * 
	 * @return
	 * 		restTemplate
	 */
	@Bean
	public RestTemplate restTemplate(){
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
