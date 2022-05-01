package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Add a = new Add();
		// Sub s = new Sub();
		// Mul m = new Mul();
		// Div d = new Div();

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");

		System.out.print(">>");
		String result = sc.nextLine();

		if (result.equals("/q")) {
			System.out.println("종료합니다.");
			} else {
			switch (result) {
			case "+":
				System.out.println(num1 + num2);
				break;

			case "-":
				System.out.println(num1 - num2);
				break;

			case "*":
				System.out.println(num1 * num2);
				break;

			default:
				System.out.println(num1 / num2);
				break;
			}
		}
		sc.close();
	}
}
