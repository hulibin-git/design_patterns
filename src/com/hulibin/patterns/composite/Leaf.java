package com.hulibin.patterns.composite;

import com.hulibin.patterns.builder.Builder;

import javax.swing.text.AsyncBoxView;

/**
 * @author hulibin
 * @date 2020/8/13 - 23:12
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("add component");
	}

	@Override
	public void remove(Component component) {
		System.out.println("remove cpmponent");
	}

	@Override
	public void display(int depth) {

		StringBuilder stringBuilder = new StringBuilder();

		for(int i = 0 ; i < depth; i++){
			stringBuilder.append("-");
		}

		System.out.println(stringBuilder.toString()+name);
	}
}
