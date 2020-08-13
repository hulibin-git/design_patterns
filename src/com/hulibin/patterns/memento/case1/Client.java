package com.hulibin.patterns.memento.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:58
 */
public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("on");
		originator.show();

		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());

		originator.setState("off");
		originator.show();

		originator.setMemento(caretaker.getMemento());
		originator.show();

	}

}
