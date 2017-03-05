package com.prashant.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestService {

	final static String DEFAULT = ":: Spring Boot ::        (v1.5.2.RELEASE)";
	
	@Value("${defaultMessage}")
	private String defaultMessage;

	private String display(String name) {
		return name.isEmpty() ? DEFAULT : "Welcome " + name + " to Spring Boot Rest Services!!!";
	}
	
	@RequestMapping("/{name}")
	String home(@PathVariable String name) {
		return display(name);
	}
	
	@RequestMapping("/")
	String home() {
		return display("");
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}
	
}
