package com.hulibin.patterns.simplefactory.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 5:39
 */
public class OperationDiv extends Operation{
	@Override
	public double getResult() {
		if(getNumberB() ==0){
			throw new RuntimeException("除数不能为0");
		}
		return getNumberA()/getNumberB();
	}
}
