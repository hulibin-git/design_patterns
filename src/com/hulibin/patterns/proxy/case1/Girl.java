package com.hulibin.patterns.proxy.case1;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:51
 */
public class Girl {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Girl(String name) {
		this.name = name;
	}
}
