package com.hulibin.patterns.templatemethod.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 21:24
 */
public abstract class AbstractClass {

	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
	}
}
