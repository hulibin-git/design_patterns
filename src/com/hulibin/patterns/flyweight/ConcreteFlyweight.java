package com.hulibin.patterns.flyweight;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:21
 */
public class ConcreteFlyweight extends Flyweight{

	@Override
	public void Operation(int extrinsicstate) {
		System.out.println("具体："+extrinsicstate);
	}
}
