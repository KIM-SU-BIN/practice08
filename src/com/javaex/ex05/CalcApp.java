package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">> ");
		String cal = sc.nextLine();

		String[] cArray = cal.split(" "); // 공백처리

		int a, b;
		String c = cArray[1]; // 기호가 들어가기 때문에 String 선언

		a = Integer.parseInt(cArray[0]); // ex, 3 + 5 에서 a=3이기 때문에 방번호 0번
		b = Integer.parseInt(cArray[2]);

		// 코드생성

		switch (c) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);		//a,b 값을 받아서 연산
			System.out.println(">> " + add.calculate());
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(">> " + sub.calculate());
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(">> " + mul.calculate());
			break;
			
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(">> " + div.calculate());
			break;
			
		case "/q":
			System.out.println("종료합니다.");
			break;
			
		default:
			System.out.println("알 수 없는 연산입니다.");
			break;
		}

		sc.close();

	}
}