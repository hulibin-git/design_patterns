package com.hulibin.patterns.command.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:26
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.bakeMutton();
	}
}
