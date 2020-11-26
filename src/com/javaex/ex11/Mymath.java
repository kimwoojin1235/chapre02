package com.javaex.ex11;

public class Mymath {
	
	private static double pi;
	//필드 =>생략	
	//생성자 =>생략 디폴트 생성자 사용	
	//메소드-get/set=>팔드가 없으므로 생략	
	//메소드 일반
	public static void setpi(double pi) {
		Mymath.pi=pi;
	}
	public static int plus(int a, int b) {
		return a+b;
	}
	public static double plua(double a,double b) {
		return a+b;
	}
	public static double circle(double r) {
		return r*r*pi;
	}
}
