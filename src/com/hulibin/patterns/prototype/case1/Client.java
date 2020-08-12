package com.hulibin.patterns.prototype.case1;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:37
 */
public class Client {

	public static void main(String[] args) {
		ConcretePrototype1 prototype1 = new ConcretePrototype1("1");

		ConcretePrototype1 clone = (ConcretePrototype1) prototype1.prototypeClone();

		System.out.println(clone.getId());

		System.out.println(prototype1.getId() == clone.getId());

	}
}
