package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:44
 */
public class Client {
	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(9);
		work.writeProgram();
		work.setHour(10);
		work.writeProgram();
		work.setHour(12);
		work.writeProgram();
		work.setHour(13);
		work.writeProgram();
		work.setHour(14);
		work.writeProgram();
		work.setHour(17);
		work.writeProgram();

		work.setFinish(false);
		work.setHour(19);
		work.writeProgram();
		work.setHour(22);
		work.writeProgram();

	}
}
