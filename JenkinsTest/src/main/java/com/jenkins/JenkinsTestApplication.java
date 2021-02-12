package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JenkinsTestApplication extends ServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return super.configure(application);
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
	
	

}
