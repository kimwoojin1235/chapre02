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
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	public void setname(String name) {
		this.name= name; //이름을 적는 용도로 사용
		//name을 입력만 받기 때문에 리턴을 하지않는다.
		//this를 붙인다면 이건 필드의 있는 name이다.
		//즉 카메라에 가면 니콘이고 컵이면 머그컵이 된다.
		//set에서 스트링의 이름이 name이라도 구분을 해줌
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
	//setprice 가격읽기
	public int getprice() {
		return price;
	}
	//입력이 된 입력값을 출력해 주는 틀
	public void showinfo() {
		System.out.println("상품이름:"+name+", 가격:"+price);
	}
	//name읽어주는 기능
	//price등록하는 기능
	//price읽어주는 기능
	
}
