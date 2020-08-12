package com.hulibin.patterns.proxy.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:55
 */
public class Client {
	public static void main(String[] args) {

		Girl girl = new Girl("李娇娇");

		Proxy proxy = new Proxy(girl);

		proxy.giveChocolate();

		proxy.giveDolls();

		proxy.giveFlowers();

	}
}
