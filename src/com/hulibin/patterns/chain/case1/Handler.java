package com.hulibin.patterns.chain.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:52
 */
public abstract class Handler {

	protected Handler successor;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(int request);
}
