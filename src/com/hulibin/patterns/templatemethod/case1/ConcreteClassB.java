package com.hulibin.patterns.templatemethod.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 21:28
 */
public class ConcreteClassB extends AbstractClass{

	@Override
	public void primitiveOperation1() {
		System.out.println("B1 实现");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("B2 实现");
	}
}
