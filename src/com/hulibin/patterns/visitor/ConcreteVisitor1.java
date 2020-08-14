package com.hulibin.patterns.visitor;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:42
 */
public class ConcreteVisitor1 extends Visitor{
	@Override
	public void visitorConcreteEa(ConcreteEa concreteEa) {
		System.out.println("1.a");
	}

	@Override
	public void visitorConcreteEb(ConcreteEb concreteEb) {
		System.out.println("1.b");
	}
}
