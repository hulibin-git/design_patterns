package com.hulibin.patterns.strategy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:21
 */
public interface CashSuper {

	/**
	 * 促销手段
	 * @param money 输入购买金额
	 * @return  优惠后的实际金额
	 */
	public double acceptCash(double money);
}
