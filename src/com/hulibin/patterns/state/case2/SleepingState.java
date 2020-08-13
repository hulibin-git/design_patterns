package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:36
 */
public class SleepingState extends State{

	@Override
	public void writeProgram(Work work) {
		System.out.println("睡觉：" + work.getHour());
	}

}
