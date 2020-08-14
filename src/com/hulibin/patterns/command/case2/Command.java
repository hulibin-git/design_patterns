package com.hulibin.patterns.command.case2;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:39
 */
public abstract class Command {

	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();
}
