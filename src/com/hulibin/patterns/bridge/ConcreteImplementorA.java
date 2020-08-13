package com.hulibin.patterns.bridge;

/**
 * @author hulibin
 * @date 2020/8/14 - 0:16
 */
public class ConcreteImplementorA extends Implementor{

	@Override
	public void operation() {
		System.out.println("具体实现A方法");
	}

}
