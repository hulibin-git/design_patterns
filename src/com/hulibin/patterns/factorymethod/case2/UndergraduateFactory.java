package com.hulibin.patterns.factorymethod.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:11
 */
public class UndergraduateFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}

}
