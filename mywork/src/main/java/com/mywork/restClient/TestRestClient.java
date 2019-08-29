package com.mywork.restClient;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.mywork.jsonPojo.Job;

@Service
public class TestRestClient {
		
	public Job[] getJobsFromGithub() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("https://jobs.github.com/positions.json?page=1&search=code", Job[].class);
	}
}
