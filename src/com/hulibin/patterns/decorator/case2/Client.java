package com.hulibin.patterns.decorator.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:30
 */
public class Client {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("小菜");
		System.out.println("开始装扮：");
		FineryDecorator tshirts = new TShirts();
		FineryDecorator bigTrouser = new BigTrouser();
		tshirts.setPerson(person);
		bigTrouser.setPerson(tshirts);
		bigTrouser.show();
	}
}
