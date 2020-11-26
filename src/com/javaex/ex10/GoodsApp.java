package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera=new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		System.out.println(camera.getTotalcaunt());
		
		Goods com=new Goods("LG그램",1000000);
		System.out.println(com.getTotalcaunt());
		
		Goods cup= new Goods("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.getTotalcaunt());
				
		camera.showinfo();
		com.showinfo();
		cup.showinfo();
	}

}
