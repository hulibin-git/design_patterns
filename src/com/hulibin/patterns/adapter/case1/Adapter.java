package com.hulibin.patterns.adapter.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:14
 */
public class Adapter extends Target {

	private Adaptee adaptee  = new Adaptee();

	@Override
	public void request(){
		adaptee.specificRequest();
	}

}
