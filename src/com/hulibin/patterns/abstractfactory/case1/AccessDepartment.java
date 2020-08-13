package com.hulibin.patterns.abstractfactory.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 20:48
 */
public class AccessDepartment implements IDepartment{
	@Override
	public void insert(Department department) {
		System.out.println("insert department");
	}

	@Override
	public Department getDepartment() {
		System.out.println("get department");
		return null;
	}
}
