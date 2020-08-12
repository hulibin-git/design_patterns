package com.hulibin.patterns.builder;

/**
 * @author hulibin
 * @date 2020/8/12 - 22:32
 */
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
