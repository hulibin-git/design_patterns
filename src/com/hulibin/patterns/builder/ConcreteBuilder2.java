package com.hulibin.patterns.builder;

/**
 * @author hulibin
 * @date 2020/8/12 - 22:30
 */
public class ConcreteBuilder2 extends Builder{

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("部件 x");
	}

	@Override
	public void buildPartB() {
		product.add("部件 y");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
