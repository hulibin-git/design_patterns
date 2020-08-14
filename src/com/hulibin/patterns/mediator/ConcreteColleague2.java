package com.hulibin.patterns.mediator;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:10
 */
public class ConcreteColleague2 extends Colleague{
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void send(String message){
		mediator.send(message, this);
	}
	@Override
	public void notifys(String message){
		System.out.println(message);
	}

}
