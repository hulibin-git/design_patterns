package com.hulibin.patterns.observer.case1;

/**
 * @author hulibin
 * @date 2020/8/12 - 22:54
 */
public abstract class Observers {
	protected String name;
	protected Subject subject;

	public Observers(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}

	public abstract void update();
}
