package com.ange.techtest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.ange.techtest")
public class AngeTechTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngeTechTestApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplateBean(){
		return new RestTemplate();
	}


}
