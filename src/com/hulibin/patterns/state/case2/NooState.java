package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:31
 */
public class NooState extends State{

	@Override
	public void writeProgram(Work work) {

		if(work.getHour() < 13) {
			System.out.println("中午：" + work.getHour());
		}else {
			work.setCurrent(new NooState());
			work.writeProgram();
		}


	}
}
