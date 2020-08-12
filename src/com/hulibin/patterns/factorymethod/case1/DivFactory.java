package com.hulibin.patterns.factorymethod.case1;

import com.hulibin.patterns.simplefactory.case1.Operation;
import com.hulibin.patterns.simplefactory.case1.OperationDiv;

/**
 * @author hulibin
 * @date 2020/8/11 - 19:41
 */
public class DivFactory implements IFactory{

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
