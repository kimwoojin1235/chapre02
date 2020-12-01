package com.javaex.ex18;

public class PointApp {

	public static void main(String[] args) {
		Point[] pArray=new Point[5];
		Point p1=new Point(5,4);
		Point p2=new Point(3, 89);
		Point p3=new Point(2,6);
		Point c1=new ColorPoint(6,8,"res");
		Point c2=new ColorPoint(45,52,"blue");
		
		pArray[0]=p1;
		pArray[1]=p2;
		pArray[2]=p3;
		pArray[3]=c1;
		pArray[4]=c2;
		
		for (int i = 0; i < pArray.length; i++) {
			pArray[i].showinfo();
		}

	}

}
