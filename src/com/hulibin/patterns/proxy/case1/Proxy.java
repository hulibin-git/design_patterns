package com.hulibin.patterns.proxy.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:54
 */
public class Proxy implements GiveGift {

	private Pursuit pursuit;

	public Proxy(Girl girl) {
		this.pursuit = new Pursuit(girl);
	}

	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}
}
