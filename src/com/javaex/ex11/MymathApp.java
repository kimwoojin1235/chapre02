package com.javaex.ex11;

public class MymathApp {

	public static void main(String[] args) {
		//메모리 스토리
		Mymath.setpi(3.14);
		int sum=Mymath.plus(2, 3);
		//sum에 입력갑을 저장
		System.out.println(sum);//출력
		double sum01=Mymath.plua(3.4, 3.3);
		System.out.println(sum01);
		double sum03=Mymath.circle(1.1);
		System.out.println(sum03);
	}
	//메소드(정의 하는 것은 되지만 그 이상은 안됨)
	//static지우고 확인해볼것
	public static int minus(int a, int b) {
		return a-b;
	}
	//메인이 스태틱 이기때문애 그 밖에 메소드를 작성을 한다면 
	//전부 스태틱으로 정의를 해야한다.
	

}
