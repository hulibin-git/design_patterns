package com.hulibin.patterns.adapter.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:16
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}

}
