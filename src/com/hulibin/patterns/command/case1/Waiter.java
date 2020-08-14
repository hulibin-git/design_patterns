package com.hulibin.patterns.command.case1;

import com.sun.org.apache.xpath.internal.operations.Or;
import sun.plugin2.gluegen.runtime.CPU;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hulibin
 * @date 2020/8/14 - 22:27
 */
public class Waiter {

	private List<Command> commands = new ArrayList<>();

	public void setOrder(Command command){

		if(command instanceof BakeChickenWingCommand){
			System.out.println("鸡翅没有了");
		}else{
			commands.add(command);
			System.out.println("新增订单");
		}
	}

	public void cancelOrder(Command command){
		commands.remove(command);
		System.out.println("订单取消");
	}

	public void notifys(){
		commands.forEach(command -> {
			command.excuteCommand();
		});
	}


}
