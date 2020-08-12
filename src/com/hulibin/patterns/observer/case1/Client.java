package com.hulibin.patterns.observer.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 23:06
 */
public class Client {

	public static void main(String[] args) {
		Boss hu = new Boss();
		Observers observer1 = new StockObserver("o1", hu);
		Observers observer2 = new StockObserver("o2", hu) ;
		hu.attach(observer1);
		hu.attach(observer2);

		hu.setState("h1");

		hu.notifys();

	}
}
