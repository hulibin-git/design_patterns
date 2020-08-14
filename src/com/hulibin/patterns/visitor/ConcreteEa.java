package com.hulibin.patterns.visitor;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:44
 */
public class ConcreteEa extends Element{

	@Override
	public void accpet(Visitor visitor) {
		visitor.visitorConcreteEa(this);
	}
}
