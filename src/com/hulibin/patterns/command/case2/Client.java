package com.hulibin.patterns.command.case2;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:44
 */
public class Client {

	public static void main(String[] args) {

		Receiver receiver = new Receiver();

		Command command = new ConcreteCommand(receiver);

		Invoker invoker = new Invoker();

		invoker.setCommand(command);

		invoker.executeCommand();

	}

}
