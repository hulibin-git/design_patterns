package com.hulibin.patterns.strategy.case2;

import java.util.Scanner;

/**
 * @author hulibin
 * @date 2020/8/10 - 6:59
 */
public class Client {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CashContext cashContext = new CashContext(scanner.next());
		double finalPrices = cashContext.getResult(Double.parseDouble(scanner.next()));
		System.out.println(finalPrices);
	}
}
