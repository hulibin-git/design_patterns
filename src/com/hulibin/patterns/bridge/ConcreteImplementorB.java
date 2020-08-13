package com.hulibin.patterns.bridge;

/**
 * @author hulibin
 * @date 2020/8/14 - 0:17
 */
public class ConcreteImplementorB extends Implementor{

	@Override
	public void operation() {
		System.out.println("具体实现B方法");
	}

}
