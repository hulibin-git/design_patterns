package com.hulibin.patterns.chain.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:56
 */
public class Client {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();

		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);

		int[] requests = new int[]{ 1,11,22,33};

		for(int request : requests){
			handler1.handleRequest(request);
		}

	}

}
