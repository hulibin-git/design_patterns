package com.hulibin.patterns.memento.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:56
 */
public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
