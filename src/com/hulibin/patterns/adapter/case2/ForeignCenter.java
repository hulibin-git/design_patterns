package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:38
 */
public class ForeignCenter extends Player {
	private String name;


	public ForeignCenter(String name) {
		super(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void attack(){
		System.out.println("外籍中锋"+this.name+"进攻");
	}
	@Override
	public void defense(){
		System.out.println("外籍中锋"+this.name+"防守");
	}
}
