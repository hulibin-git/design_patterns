package com.hulibin.patterns.mediator;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:08
 */
public class ConcreteColleague1 extends Colleague{
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String message){
		mediator.send(message,this);
	}
	@Override
	public void notifys(String message){
		System.out.println(message);
	}
}
