package com.hulibin.patterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:33
 */
public class Client {
	public static void main(String[] args) {

		Context context = new Context();

		List<AbstractExpression> list = new ArrayList<>();

		list.add(new TerminalExpression());

		list.add(new NonterminalExpression());

		list.add(new TerminalExpression());

		list.add(new TerminalExpression());

		list.forEach(expression->{
			expression.interpret(context);
		});

	}
}
