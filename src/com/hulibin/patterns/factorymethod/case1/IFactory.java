package com.hulibin.patterns.factorymethod.case1;

import com.hulibin.patterns.simplefactory.case1.Operation;

/**
 * @author hulibin
 * @date 2020/8/11 - 19:07
 */
public interface IFactory {
	/**
	 * 获取具体的运算
	 * @return 具体的计算方法
	 */
	public Operation createOperation();
}
