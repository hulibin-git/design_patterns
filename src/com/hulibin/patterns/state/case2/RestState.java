package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:37
 */
public class RestState extends State{

	@Override
	public void writeProgram(Work work) {
		System.out.println("下班:"+work.getHour());
	}

}
