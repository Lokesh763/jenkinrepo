package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class JenkinsTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(JenkinsTestApplication.class);
	}

}
