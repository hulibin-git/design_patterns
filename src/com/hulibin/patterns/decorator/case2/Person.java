package com.hulibin.patterns.decorator.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:23
 */
public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show(){
		System.out.println("装扮的" + this.name);
	}
}
