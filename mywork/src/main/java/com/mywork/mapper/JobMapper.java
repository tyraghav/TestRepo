package com.mywork.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.mywork.entities.TblJob;
import com.mywork.jsonPojo.Job;

@Component
public class JobMapper {

	public List<TblJob> jsonToEntityMapper(List<Job> jobs) {
		List<TblJob> tblJobs = new ArrayList<TblJob>();
		TblJob tblJob;
		for (Job job : jobs) {
			tblJob = new TblJob();
			tblJob.setJobId(job.getId());
			tblJob.setJobCompany(job.getCompany());
			tblJob.setJobCompanyUrl(job.getCompanyUrl());
			tblJob.setJobCreatedAt(job.getCreatedAt());
			if (job.getDescription().length() < 250) {
				tblJob.setJobDescription(job.getDescription());
			} else {
				tblJob.setJobDescription(job.getDescription().substring(0, 250));
			}
			if (job.getHowToApply().length() < 250) {
				tblJob.setJobHowToApply(job.getHowToApply());
			} else {
				tblJob.setJobHowToApply(job.getHowToApply().substring(0,250));
			}
			tblJob.setJobLocation(job.getLocation());
			tblJob.setJobTitle(job.getTitle());
			tblJob.setJobUrl(job.getUrl());
			tblJobs.add(tblJob);
		}
		return tblJobs;
	}

	public List<Job> entityToJsonMapper(List<TblJob> tblJobs) {
		List<Job> jobs = new ArrayList<Job>();
		for (TblJob tblJob : tblJobs) {
			Job job = new Job();
			job.setId(tblJob.getJobId());
			job.setCompany(tblJob.getJobCompany());
			job.setCompanyUrl(tblJob.getJobCompanyUrl());
			job.setCreatedAt(tblJob.getJobCreatedAt());
			job.setDescription(tblJob.getJobDescription());
			job.setHow_to_apply(tblJob.getJobHowToApply());
			job.setLocation(tblJob.getJobLocation());
			job.setTitle(tblJob.getJobTitle());
			job.setUrl(tblJob.getJobUrl());
			jobs.add(job);
		}
		return jobs;
	}

	public List<Job> arrayToArrayListMapper(Job[] jobs) {
		List<Job> listJobs = new ArrayList<Job>();
		for (int i = 0; i < jobs.length; i++) {
			listJobs.add(jobs[i]);
		}
		return listJobs;
	}
}
