package com.hulibin.patterns.memento.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:55
 */
public class Memento {

	private String state;

	public Memento(String state){
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
