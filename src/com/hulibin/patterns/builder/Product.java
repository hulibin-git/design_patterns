package com.hulibin.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hulibin
 * @date 2020/8/12 - 22:24
 */
public class Product {

	List<String> parts = new ArrayList<>();

	public void add(String part){
		parts.add(part);
	}

	public void show(){
		for(String part: parts){
			System.out.println(part);
		}
	}

}
