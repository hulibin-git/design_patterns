package com.hulibin.patterns.builder;

/**
 * @author hulibin
 * @date 2020/8/12 - 22:31
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();
		director.construct(builder1);
		director.construct(builder2);
		Product p1 = builder1.getResult();
		Product p2 = builder2.getResult();
		p1.show();
		p2.show();
	}
}
