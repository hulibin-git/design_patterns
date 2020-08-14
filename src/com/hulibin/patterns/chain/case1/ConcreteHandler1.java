package com.hulibin.patterns.chain.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:53
 */
public class ConcreteHandler1 extends Handler{
	@Override
	public void handleRequest(int request) {
		if(request > 0 && request <10){
			System.out.println(request);
		}else{
			successor.handleRequest(request);
		}
	}
}
