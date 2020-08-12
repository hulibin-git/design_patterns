package com.hulibin.patterns.factorymethod.case1;

import com.hulibin.patterns.simplefactory.case1.Operation;

/**
 * @author hulibin
 * @date 2020/8/11 - 19:44
 */
public class Client {
	public static void main(String[] args) {
		IFactory operationFactory = new AddFactory();
		Operation operation = operationFactory.createOperation();
		operation.setNumberA(0.1D);
		operation.setNumberB(0.2D);
		System.out.println(operation.getResult());
	}
}
