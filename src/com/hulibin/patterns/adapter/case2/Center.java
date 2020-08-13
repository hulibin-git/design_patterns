package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:32
 */
public class Center extends Player{

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("中锋 " + this.name + " 进攻");
	}

	@Override
	public void defense() {
		System.out.println("中锋 " + this.name + " 防守");
	}
}
