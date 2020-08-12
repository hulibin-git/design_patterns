package com.hulibin.patterns.strategy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:23
 */
public class CashNormal implements CashSuper {
	@Override
	public double acceptCash(double money) {
		return money;
	}
}
