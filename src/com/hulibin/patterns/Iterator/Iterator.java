package com.hulibin.patterns.Iterator;

/**
 * @author hulibin
 * @date 2020/8/13 - 23:34
 */
public abstract class Iterator {

	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();

}
