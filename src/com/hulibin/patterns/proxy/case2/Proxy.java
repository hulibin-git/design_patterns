package com.hulibin.patterns.proxy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 9:23
 */
public class Proxy extends Subject {

	private Subject subject;

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		subject.request();
	}
}
