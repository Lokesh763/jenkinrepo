package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class JenkinsTestApplication extends SpringServletContainerInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(JenkinsTestApplication.class);
	}

}
