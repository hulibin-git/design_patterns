package com.hulibin.patterns.simplefactory.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 5:30
 */
public class OperationFactory {

	public static Operation createOperate(String operate){
		Operation oper = null;
		switch (operate){
			case "+" :
				oper = new OperationAdd();
				break;
			case "-" :
				oper = new OperationSub();
				break;
			case "*" :
				oper = new OperationMul();
				break;
			case "/" :
				oper = new OperationDiv();
				break;
			default:
				throw new RuntimeException("");
		}
		return oper;

	}
}
