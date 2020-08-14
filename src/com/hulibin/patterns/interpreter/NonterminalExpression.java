package com.hulibin.patterns.interpreter;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:32
 */
public class NonterminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("非终端解释器");
	}
}
