package com.mywork;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mywork.intializers.JobInitializer;

@SpringBootApplication
public class MyWorkStarter {
	
	@Autowired
	JobInitializer jobInitializer;
	
	@PostConstruct
	public void initialiseDB() {
		jobInitializer.initialiseJobDbTable();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyWorkStarter.class, args);		
	}

}
