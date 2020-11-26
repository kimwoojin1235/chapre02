package com.javaex.ex12;

import com.javaex.ex04.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		//Goods관리를 위한 배열
		//1
		Goods[] GoodsArray= new Goods[3];
		//여러 자료형을 넣기 위해 int나 스트링이 아닌 주소이름을 넣는다.
		//2,3,4
		Goods camera=new Goods("니콘",400000);
		Goods com=new Goods("LG그램",1000000);
		Goods cup=new Goods("머그컵",2000);
		//메모리 공간을 만들고 채워 넣은 뒤 이름을 주소의 이름을 지음
		//5,6,7
		GoodsArray[0]=camera;
		GoodsArray[1]=com;
		GoodsArray[2]=cup;
		//주소의 이름을 배열 안에 넣었다.
		/*
		//두개가 같은 내용
		camera.getname();
		GoodsArray[0].getname();
		*/
		System.out.println(camera.getname());
		System.out.println(GoodsArray[0].getname());
		
		for (int i = 0; i < GoodsArray.length; i++) {
			//System.out.println(GoodsArray[i].getname());
			//System.out.println(GoodsArray[i].getprice());
			//GoodsArray가 있는 만큼 돌면서 출력하겠음
			//System.out.println(GoodsArray[i].toString());
			GoodsArray[i].showinfo();
		}
		cup.setprice(9000);
		//같은 곳을 가리키고 있는 거기 때문에 9000로 바뀐다(복사가 되는 것이아님)
		//new를 쓰지 않아서 새로 생긴게 아닌 그냥 가격하나가 더 생긴격
		System.out.println(GoodsArray[2].getprice());
	}

}
