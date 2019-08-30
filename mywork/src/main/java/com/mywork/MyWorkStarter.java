package com.mywork;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.mywork.intializers.JobInitializer;

@SpringBootApplication
public class MyWorkStarter extends SpringBootServletInitializer {
	
	@Autowired
	JobInitializer jobInitializer;
	
	@PostConstruct
	public void initialiseDB() {
		jobInitializer.initialiseJobDbTable();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyWorkStarter.class, args);		
	}

	/* Added to work in TomCat Server */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MyWorkStarter.class);
	}
	
}
