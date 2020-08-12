package com.hulibin.patterns.strategy.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:05
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 上下文接口
	 */
	public void contextInterface(){
		strategy.algorithmInterface();
	}
}
