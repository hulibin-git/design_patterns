package com.hulibin.patterns.factorymethod.case1;

import com.hulibin.patterns.simplefactory.case1.Operation;
import com.hulibin.patterns.simplefactory.case1.OperationMul;

/**
 * @author hulibin
 * @date 2020/8/11 - 19:38
 */
public class MulFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
