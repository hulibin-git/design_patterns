package com.hulibin.patterns.bridge;

/**
 * @author hulibin
 * @date 2020/8/14 - 0:20
 */
public class Abstraction{

	protected Implementor implementor;

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void operation(){
		implementor.operation();
	}
}
