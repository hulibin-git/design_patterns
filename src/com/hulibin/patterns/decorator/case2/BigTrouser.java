package com.hulibin.patterns.decorator.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:29
 */
public class BigTrouser extends FineryDecorator{

	@Override
	public void show() {
		System.out.println("垮裤");
		super.show();
	}
}
