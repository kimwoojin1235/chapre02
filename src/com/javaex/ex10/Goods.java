package com.javaex.ex10;

public class Goods {
	private String name;
	private int price;
	private static int totalcaunt;
	//물건의 졸유의 수를 나타내는 자료형 
	//static을 넣어 공유를 할수있게됨
	
	
	public Goods() {
		totalcaunt = totalcaunt+1;
	}
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
		totalcaunt = totalcaunt+1;
	}
	public Goods(String name) {
		this.name=name;
		totalcaunt = totalcaunt+1;
	}
	//생성자는 메모리 마다 따로 쓰기 때문에 공유가 되지 않는다. 즉 전부0부터 시작
	//따로논다는 뜻 
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
	public int getTotalcaunt() {
		return totalcaunt;
	}
	public void showinfo() {
		System.out.println("상품이름:"+name+" 가격:"+price);
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalcaunt=" + totalcaunt + "]";
	}
	
	
}
