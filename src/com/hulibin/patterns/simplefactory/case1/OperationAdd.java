package com.hulibin.patterns.simplefactory.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 5:35
 */
public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		return getNumberA()+getNumberB();
	}
}
