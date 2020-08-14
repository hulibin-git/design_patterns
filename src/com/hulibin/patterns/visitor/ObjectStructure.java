package com.hulibin.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hulibin
 * @date 2020/8/14 - 23:46
 */
public class ObjectStructure {

	private List<Element> elements = new ArrayList<>();

	public void attach(Element element){
		elements.add(element);
	}

	public void detach(Element element){
		elements.remove(element);
	}

	public void accept(Visitor visitor){
		elements.forEach(element -> {
			element.accpet(visitor);
		});
	}

}
