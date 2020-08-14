package com.hulibin.patterns.mediator;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:05
 */
public class ConcreteMediator extends Mediator{

	private ConcreteColleague1 concreteColleague1;

	private ConcreteColleague2 concreteColleague2;

	public ConcreteColleague1 getConcreteColleague1() {
		return concreteColleague1;
	}

	public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
		this.concreteColleague1 = concreteColleague1;
	}

	public ConcreteColleague2 getConcreteColleague2() {
		return concreteColleague2;
	}

	public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
		this.concreteColleague2 = concreteColleague2;
	}

	@Override
	public void send(String message, Colleague colleague) {
		if(colleague instanceof  ConcreteColleague1){
			colleague.notifys(message);
		}

		if(colleague instanceof  ConcreteColleague2){
			colleague.notifys(message);
		}


	}

}
