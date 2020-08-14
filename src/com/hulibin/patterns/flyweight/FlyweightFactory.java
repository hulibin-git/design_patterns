package com.hulibin.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:24
 */
public class FlyweightFactory {

	private Map<String,Flyweight> flyweights = new HashMap<>();

	public FlyweightFactory(){
		flyweights.put("x", new ConcreteFlyweight());
		flyweights.put("y", new ConcreteFlyweight());
		flyweights.put("z", new ConcreteFlyweight());
	}

	public Flyweight getFlyweight(String key){
		return flyweights.get(key);
	}

}
