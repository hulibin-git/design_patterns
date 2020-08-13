package com.hulibin.patterns.Iterator;

/**
 * @author hulibin
 * @date 2020/8/13 - 23:37
 */
public class ConcreteIterator extends Iterator{

	private ConcreteAggregate concreteAggregate;

	private int count = 0;

	public ConcreteIterator(ConcreteAggregate concreteAggregate){
		this.concreteAggregate = concreteAggregate;
	}

	@Override
	public Object first() {
		return this.concreteAggregate.getIndex(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		count++;
		if(count < this.concreteAggregate.count()){
			ret = this.concreteAggregate.getIndex(count);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return count >= this.concreteAggregate.count() ? true:false;
	}

	@Override
	public Object currentItem() {
		return this.concreteAggregate.getIndex(count);
	}

}
