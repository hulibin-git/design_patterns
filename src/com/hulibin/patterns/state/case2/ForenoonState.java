package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:25
 */
public class ForenoonState extends State{
	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 12){
			System.out.println("早上：" + work.getHour());
		} else {
			work.setCurrent(new AfternoonState());
			work.writeProgram();
		}
	}
}
