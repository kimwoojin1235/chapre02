package com.javaex.ex01;

public class Goods {
	//필드
	private String name;
	private int price;
	//생성자
	
	//메소드-겟터/세터
	
	//메소드-일반
	//name등록하는 기능
	//setname 이름  값 입력
	public void setname(String n) {
		name= n; //이름을 적는 용도로 사용
		//name을 입력만 받기 때문에 리턴을 하지않는다.
	}
	//getname() 이름읽기
	public String getname() {
		return name;
		//setname의 name을 리턴해 준다.
	}
	//setprice 가격입력
	public void setprice(int p) {
		price =p;
	}
	public int getprice() {
		return price;
	}
	//name읽어주는 기능
	//price등록하는 기능
	//price읽어주는 기능
	
}
