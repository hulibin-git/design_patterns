package com.hulibin.patterns.command.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:21
 */
public abstract class Command {

	protected Barbecuer barbecuer;

	public Command(Barbecuer barbecuer){
		this.barbecuer = barbecuer;
	}

	public abstract void excuteCommand();

}
