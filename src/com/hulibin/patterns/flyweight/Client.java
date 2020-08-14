package com.hulibin.patterns.flyweight;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:26
 */
public class Client {
	public static void main(String[] args) {
		int extrinsicstate = 22;
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight flyweight = flyweightFactory.getFlyweight("x");
		flyweight.Operation(--extrinsicstate);
		flyweight = flyweightFactory.getFlyweight("y");
		flyweight.Operation(--extrinsicstate);
		flyweight = flyweightFactory.getFlyweight("x");
		flyweight.Operation(--extrinsicstate);


	}
}
