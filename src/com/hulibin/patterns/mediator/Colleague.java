package com.hulibin.patterns.mediator;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:04
 */
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void notifys(String message);


}
