package com.javaex.ex08;
//메소드 오버로딩 예제
public class Math {
	//필드--생략
	
	//생성자--생략 쓰나 안쓰나 같음
	public Math() {	}
	
	//메소드 get set--생략
	
	//메소드 일반메소드
	public int plus(int a,int b) {
		int sum =a+b;
		return sum;
	}
	public double plus(double a,double b) {
		double sum=a+b;
		return sum;
	}
}
