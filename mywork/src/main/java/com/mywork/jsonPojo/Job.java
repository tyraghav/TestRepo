package com.mywork.jsonPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Job {

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("created_at")
	private String createdAt;
	
	@JsonProperty("company")
	private String company;
	
	@JsonProperty("company_url")
	private String companyUrl;
	
	@JsonProperty("location")
	private String location;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("how_to_apply")
	private String howToApply;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompanyUrl() {
		return companyUrl;
	}
	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHowToApply() {
		return howToApply;
	}
	public void setHow_to_apply(String howToApply) {
		this.howToApply = howToApply;
	}
	
	@Override
	public String toString() {
		return "Job [id=" + id + ", url=" + url + ", created_at=" + createdAt + ", company=" + company
				+ ", company_url=" + companyUrl + ", location=" + location + ", title=" + title + ", description="
				+ description + ", how_to_apply=" + howToApply + "]";
	}
		
}
