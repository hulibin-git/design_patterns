package com.hulibin.patterns.visitor;

import com.hulibin.patterns.mediator.ConcreteColleague1;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:48
 */
public class Client {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new ConcreteEb());
		objectStructure.attach(new ConcreteEa());

		ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
		ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

		objectStructure.accept(concreteVisitor1);
		objectStructure.accept(concreteVisitor2);
	}
}
