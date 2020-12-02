package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		Point p= new Point(4,4);
		System.out.println(p.toString());
		ColorPoint cp1=new ColorPoint("rde");
		System.out.println(cp1.toString());
		ColorPoint c01=new ColorPoint(10,10,"red");
		c01.showinfo();
	}

}
