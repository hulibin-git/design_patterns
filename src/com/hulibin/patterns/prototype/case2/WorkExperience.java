package com.hulibin.patterns.prototype.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 21:04
 */
public class WorkExperience {

	private String timeArea;

	private String company;

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	public WorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	public WorkExperience() {

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
