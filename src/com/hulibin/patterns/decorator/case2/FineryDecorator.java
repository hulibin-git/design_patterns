package com.hulibin.patterns.decorator.case2;

/**
 * @author hulibin
 * @date 2020/8/10 - 8:24
 */
public class FineryDecorator extends Person{
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public void show(){
		if(person != null){
			person.show();
		}
	}
}
