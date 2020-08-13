package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:30
 */
public class Forwards extends Player{

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("前锋 " + this.name + " 进攻");
	}

	@Override
	public void defense() {
		System.out.println("前锋 " + this.name + " 防守");
	}
}
