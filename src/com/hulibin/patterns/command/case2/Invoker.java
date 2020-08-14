package com.hulibin.patterns.command.case2;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:42
 */
public class Invoker {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand(){
		command.execute();
	}
}
