package com.hulibin.patterns.factorymethod.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:09
 */
public class Client {

	public static void main(String[] args) {
		IFactory factory = new VolunteerFactory();

		LeiFeng leiFeng = factory.createLeiFeng();

		leiFeng.buyRich();
		leiFeng.sweep();
		leiFeng.wash();
	}

}
