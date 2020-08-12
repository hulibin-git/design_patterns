package com.hulibin.patterns.simplefactory.case1;

import java.util.Scanner;

/**
 * @author hulibin
 * @date 2020/8/10 - 5:43
 */
public class Client {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Operation oper = OperationFactory.createOperate(scanner.next());
		oper.setNumberA(1D);
		oper.setNumberB(2D);
		System.out.println(oper.getResult());
	}
}
