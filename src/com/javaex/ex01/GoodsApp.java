package com.javaex.ex01;

public class GoodsApp {
	public static void main( String[] args) {
		Goods camera =new Goods();//틀을 불러와 camera에 저장을 함
		Goods computer =new Goods();
		Goods cup =new Goods();
		//캡슣화 때문에 사용 못함
		/*
		camera.name ="니콘";
		camera.price =400000;
		//값은 틀에 들어가는 것이 아니라 틀이 메모리에 찍어놓은 것에
		//값을 넣는 것이다.
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		/*
		Goods computer =new Goods();
		computer.name ="LG그램";
		computer.price=1000000;
		System.out.println(computer.name);
		System.out.println(computer.price);
		Goods mug =new Goods();
		mug.name ="머그컵";
		mug.price =2000;
		System.out.println(mug.name);
		System.out.println(mug.price);
		
		camera.price =450000;//니콘의 가격을 450000으로 바꿈
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		camera.setname("니콘");//입력값이 스트링n의 저장이됨
		String name = camera.getname();//입력이된n이 name의 입력
		System.out.println(name);//출력
		
		camera.setprice(400000);//입력값이 int의 p의 입력이됨
		int price=camera.getprice();//입력이된 p의 값을  peice의 넣음
		System.out.println(price);//출력
		
		computer.setname("LG그램");
		String name1 = computer.getname();
		System.out.println(name1);
		
		computer.setprice(1000000);
		int price1 = computer.getprice();
		System.out.println(price1);
		
		cup.setname("머그컵");
		String name2 = cup.getname();
		System.out.println(name2);
		
		cup.setprice(2000);
		int price2=cup.getprice();
		System.out.println(price2);
	}

}
