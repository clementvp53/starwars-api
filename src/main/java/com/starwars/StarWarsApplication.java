package com.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StarWarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarWarsApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		template.setErrorHandler(new RestTemplateErrorHandler());
		return new RestTemplate();
	}
}
