package com.mywork.restServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mywork.jsonPojo.Job;
import com.mywork.services.JobServices;

@RestController
public class JobRestServices {
	
	@Autowired
	JobServices jobServices;
	
	@GetMapping("/getAllJobs")
	List<Job> getAllJobs(){
		return jobServices.getAllJobs();
	}
}
