package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:41
 */
public class Translator extends Player{

	private ForeignCenter foreignCenter;

	public Translator(String name) {
		super(name);
	}

	@Override
	public void attack() {
		foreignCenter.attack();
	}

	@Override
	public void defense() {
		foreignCenter.defense();
	}
}
