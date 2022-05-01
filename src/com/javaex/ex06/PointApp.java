package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}
}
// == 연산자는 참조변수(주소값)이 동일한 경우 - 동일성
//equals 는 괄호 안의 객체 내부의 값 비교 (재정의해서 사용) - 동등성
