package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:33
 */
public class AfternoonState extends State{

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 17) {
			System.out.println("下午：" + work.getHour());
		}else{
			work.setCurrent(new EveningState());
			work.writeProgram();
		}

	}

}
