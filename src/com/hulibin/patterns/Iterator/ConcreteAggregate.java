package com.hulibin.patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hulibin
 * @date 2020/8/13 - 23:40
 */
public class ConcreteAggregate extends Aggregate{

	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int count(){
		return items.size();
	}

	public Object getIndex( int index){
		return items.get(index);
	}

	public void add(Object object){
		items.add(object);
	}

}


