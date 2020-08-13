package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:23
 */
public abstract class Player {
	protected String name;

	public Player(String name){
		this.name = name ;
	}

	public abstract void attack();

	public abstract void defense();
}
