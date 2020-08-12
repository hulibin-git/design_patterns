package com.hulibin.patterns.observer.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 23:01
 */
public class StockObserver extends Observers{


	public StockObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(subject.getState() + "," + this.name);
	}
}
