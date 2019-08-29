package com.mywork.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "TBL_JOBS")
public class TblJob {

	@Id
	@Column(name = "JOB_ID")
	private String JobId;
	
	@Column(name = "JOB_URL")
	private String JobUrl;
	
	@Column(name = "JOB_CREATED_AT")
	private String JobCreatedAt;
	
	@Column(name = "JOB_TITLE")
	private String JobTitle;
	
	@Column(name = "JOB_LOCATION")
	private String JobLocation;
	
	@Column(name = "JOB_DESCRIPTION")
	@Nullable
	private String JobDescription;
	
	@Column(name = "JOB_COMPANY")
	private String JobCompany;
	
	@Column(name = "JOB_COMPANY_URL")
	private String JobCompanyUrl;
	
	@Column(name = "JOB_HOW_TO_APPLY")
	private String JobHowToApply;

	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return JobId;
	}

	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(String jobId) {
		JobId = jobId;
	}

	/**
	 * @return the jobUrl
	 */
	public String getJobUrl() {
		return JobUrl;
	}

	/**
	 * @param jobUrl the jobUrl to set
	 */
	public void setJobUrl(String jobUrl) {
		JobUrl = jobUrl;
	}

	/**
	 * @return the jobCreatedAt
	 */
	public String getJobCreatedAt() {
		return JobCreatedAt;
	}

	/**
	 * @param jobCreatedAt the jobCreatedAt to set
	 */
	public void setJobCreatedAt(String jobCreatedAt) {
		JobCreatedAt = jobCreatedAt;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return JobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	/**
	 * @return the jobLocation
	 */
	public String getJobLocation() {
		return JobLocation;
	}

	/**
	 * @param jobLocation the jobLocation to set
	 */
	public void setJobLocation(String jobLocation) {
		JobLocation = jobLocation;
	}

	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return JobDescription;
	}

	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}

	/**
	 * @return the jobCompany
	 */
	public String getJobCompany() {
		return JobCompany;
	}

	/**
	 * @param jobCompany the jobCompany to set
	 */
	public void setJobCompany(String jobCompany) {
		JobCompany = jobCompany;
	}

	/**
	 * @return the jobCompanyUrl
	 */
	public String getJobCompanyUrl() {
		return JobCompanyUrl;
	}

	/**
	 * @param jobCompanyUrl the jobCompanyUrl to set
	 */
	public void setJobCompanyUrl(String jobCompanyUrl) {
		JobCompanyUrl = jobCompanyUrl;
	}

	/**
	 * @return the jobHowToApply
	 */
	public String getJobHowToApply() {
		return JobHowToApply;
	}

	/**
	 * @param jobHowToApply the jobHowToApply to set
	 */
	public void setJobHowToApply(String jobHowToApply) {
		JobHowToApply = jobHowToApply;
	}

	@Override
	public String toString() {
		return "Tbl_Jobs [JobId=" + JobId + ", JobUrl=" + JobUrl + ", JobCreatedAt=" + JobCreatedAt + ", JobTitle="
				+ JobTitle + ", JobLocation=" + JobLocation + ", JobDescription=" + JobDescription + ", JobCompany="
				+ JobCompany + ", JobCompanyUrl=" + JobCompanyUrl + ", JobHowToApply=" + JobHowToApply + "]";
	}

		
}
