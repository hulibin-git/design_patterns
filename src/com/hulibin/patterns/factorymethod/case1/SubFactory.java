package com.hulibin.patterns.factorymethod.case1;

import com.hulibin.patterns.simplefactory.case1.Operation;
import com.hulibin.patterns.simplefactory.case1.OperationSub;

/**
 * @author hulibin
 * @date 2020/8/11 - 19:37
 */
public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}
}
