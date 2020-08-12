package com.hulibin.patterns.observer.case2;

/**
 * @author hulibin
 * @date 2020/8/12 - 23:26
 */
public class ConcreteObserver extends MyObserver{

	private String name;

	private String action;

	private Subject subject;

	public ConcreteObserver(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		action = subject.getState();
		System.out.println("observer"+this.name+"new state"+this.action);
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}


}
