package com.hulibin.patterns.abstractfactory.case1;

/**
 * @author hulibin
 * @date 2020/8/13 - 20:52
 */
public class SqlServerFactory implements  AbstractFactory{

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}
}
