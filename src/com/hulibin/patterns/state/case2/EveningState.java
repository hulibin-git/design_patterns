package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:34
 */
public class EveningState extends State{

	@Override
	public void writeProgram(Work work) {
		if(work.isFinish()){
			work.setCurrent(new RestState());
			work.writeProgram();
		}else{
			if(work.getHour() < 21 ) {
				System.out.println("加班:" + work.getHour());
			}else{
				work.setCurrent(new SleepingState());
				work.writeProgram();
			}
		}
	}

}
