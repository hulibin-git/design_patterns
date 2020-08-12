package com.hulibin.patterns.simplefactory.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 5:39
 */
public class OperationMul extends Operation{
	@Override
	public double getResult() {
		return getNumberA() * getNumberB();
	}
}
