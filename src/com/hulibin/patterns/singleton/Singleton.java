package com.hulibin.patterns.singleton;

/**
 * @author hulibin
 * @date 2020/8/14 - 0:01
 */
public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	private Singleton(){

	}

	public static Singleton getInstance(){
		return INSTANCE;
	}
}
