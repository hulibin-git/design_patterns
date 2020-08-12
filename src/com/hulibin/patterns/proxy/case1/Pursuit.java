package com.hulibin.patterns.proxy.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:50
 */
public class Pursuit implements GiveGift {

	private Girl girl;

	public Pursuit(Girl girl) {
		this.girl = girl;
	}

	@Override
	public void giveDolls() {
		System.out.println(girl.getName() + "送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		System.out.println(girl.getName() + "送你鲜花");
	}

	@Override
	public void giveChocolate() {
		System.out.println(girl.getName() + "送你巧克力");
	}
}
