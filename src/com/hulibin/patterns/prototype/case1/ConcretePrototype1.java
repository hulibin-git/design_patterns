package com.hulibin.patterns.prototype.case1;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:35
 */
public class ConcretePrototype1 extends Prototype {

	public ConcretePrototype1(String id) {
		super(id);
	}

	@Override
	public Prototype prototypeClone() {
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
