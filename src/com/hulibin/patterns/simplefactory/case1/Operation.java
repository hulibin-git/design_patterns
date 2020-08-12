package com.hulibin.patterns.simplefactory.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 5:33
 */
public abstract class Operation {

	private Double numberA;

	private Double numberB;

	public Double getNumberA() {
		return numberA;
	}

	public void setNumberA(Double numberA) {
		this.numberA = numberA;
	}

	public Double getNumberB() {
		return numberB;
	}

	public void setNumberB(Double numberB) {
		this.numberB = numberB;
	}

	/**
	 *  输入两个数 : 返回对应的结果
	 * @return 操作数据结果
	 */
	public abstract double getResult();
}
