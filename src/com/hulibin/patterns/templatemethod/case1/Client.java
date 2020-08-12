package com.hulibin.patterns.templatemethod.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 21:29
 */
public class Client {

	public static void main(String[] args) {

		AbstractClass abstractClass = new ConcreteClassA();

		abstractClass.templateMethod();

		abstractClass = new ConcreteClassB();

		abstractClass.templateMethod();

	}

}
