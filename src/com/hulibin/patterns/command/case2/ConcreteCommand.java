package com.hulibin.patterns.command.case2;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:41
 */
public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}
}
