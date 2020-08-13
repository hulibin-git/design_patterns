package com.hulibin.patterns.state.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:10
 */
public class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {
		context.setState( new ConcreteStateA());
	}

}
