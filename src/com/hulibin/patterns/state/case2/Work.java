package com.hulibin.patterns.state.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 21:24
 */
public class Work {

	private State current;

	public Work(){
		current = new ForenoonState();
	}

	private double hour;

	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	private boolean finish = false;

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public void writeProgram(){
		current.writeProgram(this);
	}
}
