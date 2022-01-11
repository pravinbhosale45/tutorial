package com.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {
	
	@RequestMapping("/hello")
	public String test() {
		return "Hello World:";
	}

}
