package com.hulibin.patterns.bridge;

/**
 * @author hulibin
 * @date 2020/8/14 - 0:22
 */
public class Client {

	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();

		abstraction.setImplementor(new ConcreteImplementorA());

		abstraction.operation();

		abstraction.setImplementor(new ConcreteImplementorB());

		abstraction.operation();

	}

}
