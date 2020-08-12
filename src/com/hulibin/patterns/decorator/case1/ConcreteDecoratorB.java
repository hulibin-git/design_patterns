package com.hulibin.patterns.decorator.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:15
 */
public class ConcreteDecoratorB extends Decorator{

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	private void addedBehavior(){
		System.out.println("B的额外行为");
	}

}
