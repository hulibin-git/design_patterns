package com.hulibin.patterns.observer.case1;

import java.util.ArrayList;
import java.util.List;


/**
 * @author hulibin
 * @date 2020/8/12 - 22:52
 */
public class Boss implements Subject{

	private List<Observers> observersList = new ArrayList<>();

	private List<Listener> listeners = new ArrayList<>();

	private String action;

	@Override
	public void attach(Observers observers) {
		observersList.add(observers);
	}

	@Override
	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void detach(Observers observers) {
		observersList.remove(observers);
	}

	@Override
	public void notifys() {
		for (Observers observers : observersList) {
			observers.update();
		}
	}

	@Override
	public void notifyByListener() {
		listeners.forEach(listener -> listener.update());
	}

	@Override
	public String getState() {
		return this.action;
	}

	@Override
	public void setState(String state) {
		this.action = state;
	}

}
