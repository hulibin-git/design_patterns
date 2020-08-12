package com.hulibin.patterns.decorator.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:07
 */
public class Decorator extends Component{

	protected Component component;

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if(component != null) {
			component.operation();
		}
	}
}
