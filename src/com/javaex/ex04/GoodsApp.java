package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// 생성자 Goods()
		// set사용
		// showinfo사용
		Goods camera = new Goods();
		//디폴트 생성자가 반드시 있어야 한다.
		camera.setname("니콘");
		camera.setprice(400000);
		camera.showinfo();

		// 생성자 Goods(String name,int price)
		// set x
		// showinfo사용
		Goods com = new Goods("LG그앰", 1000000);
		com.showinfo();

		// 생성자 Goods(String name)
		// set x
		// showinfo사용
		Goods cup = new Goods("머그컵");
		cup.setprice(2000);
		cup.showinfo();

	}

}
