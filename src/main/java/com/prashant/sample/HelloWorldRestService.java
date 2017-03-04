package com.prashant.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldRestService {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestService.class, args);
	}
	
	@RequestMapping("/")
	String home() {
		return "Hello World!!!";
	}
	
}
