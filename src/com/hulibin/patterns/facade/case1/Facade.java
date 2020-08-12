package com.hulibin.patterns.facade.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 21:52
 */
public class Facade {

	SubSystemOne one;
	SubSystemTwo two;

	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
	}

	public void show(){
		one.MethodOne();
		two.MethodTwo();
	}

}
