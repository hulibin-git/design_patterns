package com.hulibin.patterns.builder;

/**
 * @author hulibin
 * @date 2020/8/12 - 22:28
 */
public class ConcreteBuilder1 extends Builder{

	Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
