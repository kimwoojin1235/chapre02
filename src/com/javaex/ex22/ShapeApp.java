package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		Drawable p =new Point(3,3);
		p.draw();
		//섞어쓰기를사용
		Point pp=new Point(4,3);
		pp.draw();
		System.out.println(pp.getX());
		 
		//점+도형 함께 관리
		Drawable[] dArray=new Drawable[4];
		
		Drawable r01=new Ractangle("빨강","빨강",4,8);
		Drawable c01=new Cicle("주황","주황",5);
		Drawable t01=new Triangle("노랑","노랑",8,15);
		Drawable p01=new Point(5,5);
		dArray[0]=r01;
		dArray[1]=c01;
		dArray[2]=t01;
		dArray[3]=p01;
		//전체 그리기
		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		System.out.println("==================================");
		//전체면적구하기==>Point는 면적이 없음
		//전체 순차적으로 area() 부모가 shape이면 면적을 구함
		for (int i = 0; i < dArray.length; i++) {
			//부모가 shape이면 실행
			if(dArray[i] instanceof Shape) {
				//instanceof는 부모를 가지고 있는 지 물어보는 함수
			System.out.println(((Shape)dArray[i]).area());
		}
		}

}
}
