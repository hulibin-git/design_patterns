package com.hulibin.patterns.factorymethod.case2;

/**
 * @author hulibin
 * @date 2020/8/11 - 20:06
 */
public class LeiFengFactory {

	public static LeiFeng createLeiFeng(String type){
		LeiFeng result = null;

		switch (type){
			case "大学生":
				result = new Undergraduate();
				break;
			case "志愿者":
				result = new Volunteer();
				break;
		}
		return result;
	}
}
