package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {

		// try~catch문을 사용하여 에러를 수정하세요
		
		
		
		try {
			fileRead();			//1차로 파일 읽고
			System.out.println("myFile.txt"); 		// ==>> 2차로 출력. 근데 필요없는걸까?
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}

	}

	// 수정하지 마세요
	public static void fileRead() throws IOException{
		throw new IOException(); // 강제로 예외 발생
	}
}


