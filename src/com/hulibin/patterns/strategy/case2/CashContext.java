package com.hulibin.patterns.strategy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:15
 */
public class CashContext {
	private CashSuper cashsuper;

	public CashContext(String type) {
		switch (DiscountTypeEnum.valueOf(type)){
			case NORMAL :
				cashsuper = new CashNormal();
				break;
			case RETURN :
				cashsuper = new CashReturn(300D,100D);
				break;
			case REBATE :
				cashsuper = new CashRebate(0.8);
				break;
		}
	}

	public double getResult(double money){
		return cashsuper.acceptCash(money);
	}
}
