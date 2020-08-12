package com.hulibin.patterns.proxy.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 9:23
 */
public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("真实的请求");
	}
}
