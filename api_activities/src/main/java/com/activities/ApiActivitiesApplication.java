package com.activities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiActivitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiActivitiesApplication.class, args);
	}
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins("/**").allowedMethods("*").allowedHeaders("*");
//			}
//		};
//	}

}
