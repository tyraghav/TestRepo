package com.mywork.restServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mywork.services.JobServices;

@RestController
public class JobRestServices {
	
	@Autowired
	JobServices jobServices;
	
	@RequestMapping("/temp")
	public void getAllJobsFromGithub(){
		jobServices.getAllJobsFromGithub();
	}
	
}
