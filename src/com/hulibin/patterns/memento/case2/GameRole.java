package com.hulibin.patterns.memento.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:46
 */
public class GameRole {
	private int vit;

	private int atk;

	private int def;

	public void stateDisplay(){
		System.out.println("角色当前状态：");
		System.out.println("体力: "+this.vit);
		System.out.println("攻击力：" + this.atk);
		System.out.println("防御力："+this.def);
	}

	public void initState(){
		vit=100;
		atk=100;
		def=100;
	}

	public void fight(){
		vit=100;
		atk=100;
		def=100;
	}
}
