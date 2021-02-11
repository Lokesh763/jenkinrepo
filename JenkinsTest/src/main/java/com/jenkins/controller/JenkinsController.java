package com.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@RequestMapping("/")
	public String sayHello() {
		
		return "Hi Jenkins";

	}

}
