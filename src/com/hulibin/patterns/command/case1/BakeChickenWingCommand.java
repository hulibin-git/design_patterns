package com.hulibin.patterns.command.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:27
 */
public class BakeChickenWingCommand extends Command{

	public BakeChickenWingCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.bakeChickenWing();
	}
}
