package com.javaex.ex04;

public class Goods {
	private String name;
	private int price;

	// 생성자
	public Goods() {
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Goods(String name) {
		this.name = name;
	}

	// 메소드get/set
	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getprice() {
		return price;
	}

	// 메소드/일반 메소드
	public void showinfo() {
		System.out.println("상품이름:" + name + ", 가격:" + price);
	}
}
