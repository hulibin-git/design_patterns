package com.hulibin.patterns.abstractfactory.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 20:54
 */
public class Client {

	public static void main(String[] args) {
		Department department = new Department();

		AbstractFactory factory = new AccessFactory();

		IDepartment iDepartment=factory.createDepartment();

		iDepartment.insert(department);

		iDepartment.getDepartment();

	}

}
