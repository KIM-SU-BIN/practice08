package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	public boolean equals (Object obj) {
		
		/*if(!(obj instanceof PointApp))		//만약 obj 가 인스턴스오브 PointApp이 아니면 트루로 반환
			return true;
		PointApp p = (PointApp) obj;		//그렇지 않으면 obj를 포인트앱으로 형변환
		return false;								//출력 오류이유는?
		*/
		
		Point p = ((Point)obj);
		if(this.x == p.x) {		
			return true;
		} else {
			return false;
		}
	}
}
