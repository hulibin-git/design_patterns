package com.hulibin.patterns.mediator;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:03
 */
public abstract class Mediator {
	public abstract  void send(String message,Colleague colleague);
}
