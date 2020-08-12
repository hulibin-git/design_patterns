package com.hulibin.patterns.observer.case2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


/**
 * @author hulibin
 * @date 2020/8/12 - 23:21
 */
public abstract class Subject {

	private List<MyObserver> observers = new ArrayList<MyObserver>();

	public void attach(MyObserver observer){
		observers.add(observer);
	}

	public void detach(MyObserver observer){
		observers.remove(observer);
	}

	public void notifys(){
		observers.forEach((observer)->{
			observer.update();
		});
	}

	private String action;

	public String getState() {
		return this.action;
	}

	public void setState(String state) {
		this.action = state;
	}
}
