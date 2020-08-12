package com.hulibin.patterns.decorator.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:18
 */
public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decoratorA = new ConcreteDecoratorA();
		Decorator decoratorB = new ConcreteDecoratorB();

		decoratorA.setComponent(component);
		decoratorB.setComponent(decoratorA);

		decoratorB.operation();

	}

}
