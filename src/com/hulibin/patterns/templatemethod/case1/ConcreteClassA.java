package com.hulibin.patterns.templatemethod.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 21:27
 */
public class ConcreteClassA extends AbstractClass{

	@Override
	public void primitiveOperation1() {
		System.out.println("A1 实现");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("A2 实现");
	}

}
