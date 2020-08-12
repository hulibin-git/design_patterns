package com.hulibin.patterns.strategy.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:07
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();

		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}
}
