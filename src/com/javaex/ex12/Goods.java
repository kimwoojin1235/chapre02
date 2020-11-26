package com.javaex.ex12;

public class Goods {
	private String name;
	private int price;
	
	public Goods(String name, int price){
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void showinfo() {
		System.out.println("상품이름:"+name+" 가격:"+price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
}
