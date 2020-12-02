package com.javaex.ex20;

public class ShaprApp {

	public static void main(String[] args) {
		Shape[] sArray=new	Shape[2];
		
		//사각형 만들기
		//Ractangle r=new Ractangle("빨강","빨강",5,5);
		Shape r01=new Ractangle("노랑","노랑",100,100);
		//원만들기
		//Circle c =new Circle("파랑","파랑",5);
		Shape c01 =new Circle("초록","초록",5);
		//배열에 주소값대입
		sArray[0]=r01;
		sArray[1]=c01;
		//전부그리기
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		//문제 발생
		//Shape s=new Shape("빨강","검정");
		//s.draw();
	    //전부그리기
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}
}
