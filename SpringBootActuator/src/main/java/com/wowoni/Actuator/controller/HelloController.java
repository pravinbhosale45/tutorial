package com.wowoni.Actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping (path = "/welcome")
	public String welcome() {
		return "Hello World";
	}

}
