package com.hulibin.patterns.prototype.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 21:04
 */
public class DeepWorkExperience implements Cloneable{

	private String timeArea;

	private String company;

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	public DeepWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	public DeepWorkExperience() {

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	protected DeepWorkExperience clone() throws CloneNotSupportedException {
		return (DeepWorkExperience)super.clone();
	}
}

