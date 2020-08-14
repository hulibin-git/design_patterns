package com.hulibin.patterns.command.case1;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:28
 */
public class Client {

	public static void main(String[] args) {

		Barbecuer boy = new Barbecuer();

		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);

		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);

		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);

		Waiter girl = new Waiter();

		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand1);

		girl.notifys();



	}

}
