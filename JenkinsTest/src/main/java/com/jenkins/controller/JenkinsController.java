package com.jenkins.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class JenkinsController {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hi Jenkins...";

	}

}
