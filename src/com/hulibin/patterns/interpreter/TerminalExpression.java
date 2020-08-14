package com.hulibin.patterns.interpreter;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:31
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("终端解释器");
	}

}
