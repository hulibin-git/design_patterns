package com.hulibin.patterns.decorator.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:07
 */
public class ConcreteComponent extends Component{

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}
}
