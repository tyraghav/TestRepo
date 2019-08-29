package com.mywork.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mywork.entities.TblJob;
import com.mywork.jsonPojo.Job;
import com.mywork.mapper.JobMapper;
import com.mywork.repositories.TblJobsRepository;
import com.mywork.restClient.TestRestClient;

@Service
public class JobServices {
	
	@Autowired
	TblJobsRepository tblJobsRepository;
	
	@Autowired
	JobMapper jobMapper;
	
	@Autowired
	TestRestClient testRestClient;

	public void getAllJobsFromGithub(){
		Job[] jobArray = testRestClient.getJobsFromGithub();
		List<TblJob> pJobs = jobMapper.jsonToEntityMapper(jobMapper.arrayToArrayListMapper(jobArray));
		tblJobsRepository.saveAll(pJobs);
	}
}
