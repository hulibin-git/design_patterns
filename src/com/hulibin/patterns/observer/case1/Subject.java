package com.hulibin.patterns.observer.case1;



/**
 * @author hulibin
 * @date 2020/8/12 - 22:49
 */
public interface Subject {
	public void attach(Observers observers);
	public void detach(Observers observers);
	public void notifys();
	public String getState();
	public void setState(String state);
}
