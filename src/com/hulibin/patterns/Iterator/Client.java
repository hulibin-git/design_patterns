package com.hulibin.patterns.Iterator;

/**
 * @author hulibin
 * @date 2020/8/13 - 23:51
 */
public class Client {
	public static void main(String[] args) {
		ConcreteAggregate concreteAggregate = new ConcreteAggregate();
		concreteAggregate.add("1");
		concreteAggregate.add("2");
		concreteAggregate.add("3");

		Iterator iterator = concreteAggregate.createIterator();


		//iterator.first();
		while (!iterator.isDone()){
			System.out.println(iterator.currentItem());
			iterator.next();
		}

	}
}
