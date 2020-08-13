package com.hulibin.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hulibin
 * @date 2020/8/13 - 23:19
 */
public class Composite extends Component{

	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {

		StringBuilder stringBuilder = new StringBuilder();

		for(int i = 0 ; i < depth; i++){
			stringBuilder.append("-");
		}

		System.out.println(stringBuilder.toString()+name);

		children.forEach(c->{
			c.display(depth+2);
		});

	}
}
