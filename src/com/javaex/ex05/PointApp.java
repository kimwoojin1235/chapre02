package com.javaex.ex05;

public class PointApp {
//필드와 생성자가 생략이 되어있음 있을수도 있음
	public static void main(String[] args) {
		
		Point p1=new Point();
		p1.setX(12);
		p1.setY(15);
		p1.showinfo();
		
		Point p2=new Point(14, 54);
		p2.showinfo();
		p2.showinfo(true);
		p2.showinfo(false);
		//사용자 입장에서는 하나처럼 사용이 가능
		
		Point p3=new Point(15);
		p3.setY(45);
		p3.showinfo();

	}

}
