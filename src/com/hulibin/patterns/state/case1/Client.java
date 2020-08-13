package com.hulibin.patterns.state.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:12
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());

		context.request();

		context.request();

		context.request();
	}

}
