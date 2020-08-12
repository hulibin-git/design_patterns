package com.hulibin.patterns.observer.case2;

/**
 * @author hulibin
 * @date 2020/8/12 - 23:35
 */
public class Client {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();

		concreteSubject.attach(new ConcreteObserver("X", concreteSubject));
		concreteSubject.attach(new ConcreteObserver("y",concreteSubject));

		concreteSubject.setState("ABC");

		concreteSubject.notifys();
	}
}
