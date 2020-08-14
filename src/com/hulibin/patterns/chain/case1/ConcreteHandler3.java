package com.hulibin.patterns.chain.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:54
 */
public class ConcreteHandler3 extends Handler{
	@Override
	public void handleRequest(int request) {
		if(request > 20 && request <30){
			System.out.println(request);
		}else{
			successor.handleRequest(request);
		}
	}
}
