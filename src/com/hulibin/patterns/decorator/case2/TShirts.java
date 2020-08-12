package com.hulibin.patterns.decorator.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:28
 */
public class TShirts extends FineryDecorator {
	@Override
	public void show() {
		System.out.println("大T恤");
		super.show();
	}
}
