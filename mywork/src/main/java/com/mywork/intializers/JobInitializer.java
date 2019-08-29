package com.mywork.intializers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mywork.services.JobServices;

@Service
public class JobInitializer{

	@Autowired
	JobServices jobServices;
	
	public void initialiseJobDbTable() {
		jobServices.getAllJobsFromGithub();
	}

}
