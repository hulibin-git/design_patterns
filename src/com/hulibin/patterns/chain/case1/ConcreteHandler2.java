package com.hulibin.patterns.chain.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:54
 */
public class ConcreteHandler2 extends Handler{
	@Override
	public void handleRequest(int request) {
		if(request > 10 && request <20){
			System.out.println(request);
		}else{
			successor.handleRequest(request);
		}
	}
}
