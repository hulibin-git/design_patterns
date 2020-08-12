package com.hulibin.patterns.prototype.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:49
 */
public class Resume implements Cloneable{

	private String name;

	private String sex;

	private String age;

	private WorkExperience workExperience;

	public Resume(String name) {
		this.name = name;
		this.workExperience = new WorkExperience();
	}

	public void setPersonalInfo(String sex ,String age){
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String timeArea,String company){
		this.workExperience.setTimeArea(timeArea);
		this.workExperience.setCompany(company);
	}

	public void display(){
		System.out.println(name + "," + sex + "," + age);
		System.out.println("工作经历：" + workExperience.getTimeArea() + "," + workExperience.getCompany());
	}

	@Override
	protected Resume clone() throws CloneNotSupportedException {
		return (Resume) super.clone();
	}
}
