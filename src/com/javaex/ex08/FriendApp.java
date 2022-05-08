//배열을 이용한 friends
package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

	    Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		String inputLine;						//왜 사용하는가??
		String[] inputArray;
		
		
		System.out.println("친구를 3명 등록해 주세요.");

		
		for(int i=0; i<3; i++) {
			inputLine = sc.nextLine();
			inputArray = inputLine.split(" ");
			friendArray[i] = new Friend(inputArray[0], inputArray[1], inputArray[2]);
		}
		
		
		for(int i=0; i<3; i++) {
			friendArray[i].showInfo();
		}
				
		sc.close();
	}

}
