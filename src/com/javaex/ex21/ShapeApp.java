package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		Shape[] sArray=new Shape[3];
		Ractangle r01=new Ractangle("빨강","빨강",5,5);
		Cicle c01=new Cicle("파랑","파랑",3);
		Triangle t01=new Triangle("초록","초록",3,5);
		sArray[0]=r01;
		sArray[1]=c01;
		sArray[2]=t01;
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}

	}

}
