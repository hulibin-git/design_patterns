package com.hulibin.patterns.prototype.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 21:19
 */
public class DeepResume implements Cloneable {

	private String name;

	private String sex;

	private String age;

	private DeepWorkExperience deepWorkExperience;

	public DeepResume(String name) {
		this.name = name;
		this.deepWorkExperience = new DeepWorkExperience();
	}

	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String timeArea, String company) {
		this.deepWorkExperience.setTimeArea(timeArea);
		this.deepWorkExperience.setCompany(company);
	}

	public void display() {
		System.out.println(name + "," + sex + "," + age);
		System.out.println("工作经历：" + deepWorkExperience.getTimeArea() + "," + deepWorkExperience.getCompany());
	}

	@Override
	protected DeepResume clone() throws CloneNotSupportedException {
		DeepResume deepResume = (DeepResume) super.clone();

		deepResume.deepWorkExperience = this.deepWorkExperience.clone();

		return deepResume;
	}

}
