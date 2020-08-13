package com.hulibin.patterns.memento.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:53
 */
public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento(){
		return new Memento(state);
	}

	public void setMemento(Memento memento){
		state = memento.getState();
	}

	public void show(){
		System.out.println("state:" + state);
	}

}
