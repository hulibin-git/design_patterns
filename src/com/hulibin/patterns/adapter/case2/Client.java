package com.hulibin.patterns.adapter.case2;

/**
 * @author hulibin
 * @date 2020/8/13 - 22:35
 */
public class Client {
	public static void main(String[] args) {
		Player player = new Forwards("A");
		player.attack();
		player = new Guards("B");
		player.attack();
//		player = new Center("C");
		player = new ForeignCenter("C");
		player.attack();
		player.defense();
	}
}
