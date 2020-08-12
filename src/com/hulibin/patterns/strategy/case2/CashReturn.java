package com.hulibin.patterns.strategy.case2;

/**
 * 实际金额计算请用BigDecimal
 * @author hulibin
 * @date 2020/8/10 - 6:26
 */
public class CashReturn implements CashSuper{

	private Double threshold;

	private Double returnMoney;

	public CashReturn(Double threshold, Double returnMoney) {
		this.threshold = threshold;
		this.returnMoney = returnMoney;
	}

	public Double getThreshold() {
		return threshold;
	}

	public void setThreshold(Double threshold) {
		this.threshold = threshold;
	}

	public Double getReturnMoney() {
		return returnMoney;
	}

	public void setReturnMoney(Double returnMoney) {
		this.returnMoney = returnMoney;
	}

	@Override
	public double acceptCash(double money) {

		double returnReal = returnMoney > threshold ? threshold : returnMoney;

		return money < threshold ? money : money - returnReal;
	}
}
