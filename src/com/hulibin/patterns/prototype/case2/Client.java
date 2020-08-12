package com.hulibin.patterns.prototype.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:54
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {

		Resume resume1 = new Resume("大鸟");
		resume1.setPersonalInfo("男","29");
		resume1.setWorkExperience("2015-2018", "生意帮");

		Resume resume2 = resume1.clone();
		resume2.setPersonalInfo("男", "24");
		resume2.setWorkExperience("2018-2020", "时空智子");
		//浅拷贝验证
		resume1.display();
		resume2.display();

		DeepResume deepResume1 = new DeepResume("大鸟");
		deepResume1.setPersonalInfo("男","29");
		deepResume1.setWorkExperience("2015-2018", "生意帮");

		DeepResume deepResume2 = deepResume1.clone();
		deepResume2.setPersonalInfo("男", "24");
		deepResume2.setWorkExperience("2018-2020", "时空智子");
		//深拷贝验证
		deepResume1.display();
		deepResume2.display();
	}
}
