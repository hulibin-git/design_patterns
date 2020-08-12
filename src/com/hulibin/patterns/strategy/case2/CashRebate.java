package com.hulibin.patterns.strategy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:37
 */
public class CashRebate implements CashSuper {

	private double rebate;

	public double getRebate() {
		return rebate;
	}

	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

	public CashRebate(double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double acceptCash(double money) {
		return rebate >=0 ? money * rebate : money;
	}
}
