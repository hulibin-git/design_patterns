package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:34
 */
public class Guards extends Player{

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("后卫 " + this.name + " 进攻");
	}

	@Override
	public void defense() {
		System.out.println("后卫 " + this.name + " 防守");
	}
}
