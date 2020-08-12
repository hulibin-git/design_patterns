package com.hulibin.patterns.factorymethod.case1;

import com.hulibin.patterns.simplefactory.case1.Operation;
import com.hulibin.patterns.simplefactory.case1.OperationAdd;

/**
 * @author hulibin
 * @date 2020/8/11 - 19:35
 */
public class AddFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
