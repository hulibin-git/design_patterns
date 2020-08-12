package com.hulibin.patterns.prototype.case1;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:32
 */
public abstract class Prototype implements Cloneable{

	private String id;

	public Prototype(String id){
		this.id = id ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 克隆对象
	 * @return 克隆
	 */
	public abstract Prototype prototypeClone();
}
