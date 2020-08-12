package com.hulibin.patterns.decorator.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:09
 */
public class ConcreteDecoratorA extends Decorator{

	private String addedState;

	@Override
	public void operation() {
		super.operation();
		addedState = "new state";
		System.out.println("具体装饰对象A操作");
	}
}
