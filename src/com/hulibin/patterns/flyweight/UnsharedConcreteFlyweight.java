package com.hulibin.patterns.flyweight;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:23
 */
public class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void Operation(int extrinsicstate) {
		System.out.println("不共享："+extrinsicstate);
	}
}
