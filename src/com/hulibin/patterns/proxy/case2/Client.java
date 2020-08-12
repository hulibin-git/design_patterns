package com.hulibin.patterns.proxy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 9:25
 */
public class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.setSubject(new RealSubject());
		proxy.request();
	}

}
