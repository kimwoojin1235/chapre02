package com.javaex.ex17;

import javax.security.auth.Subject;

public class PersonApp {

	public static void main(String[] args) {
		/*오버라이딩 테스트
		//test==>섞어쓰기
		//자료형 통일할려고,학교정보 유지하고 싶다.
		Person s01=new Student("유재석",44,"서울고등학교");
		//자식쪽 stuent를 사용할수 없다.
		//s01.getshcoolname();사용할수 없다.
		
		s01.showinfo();//자식쪽의 showinfo()가 실행,덮어쓴다.오버라이딩된다.
		//부모쪽의 showinfo()를 사용할거라 생각된다.하지만 안됨
		System.out.println(s01.toString());
		*/
		//자료형은 부모쪽으로 통일
		Person[] psArray= new Person[5];
		//
		Person p01 =new Person("둘리",1200);
		Person p02 =new Person("도우너",200);
		Person p03 =new Person("마이콜",300);
		//섞어쓰기
		Person s01=new Student("유재석",44,"서울고등학교");
		Person s02=new Student("강호동",47,"경기고등학교");
		
		psArray[0]=p01;
		psArray[1]=p02;
		psArray[2]=p03;
		psArray[3]=s01;
		psArray[4]=s02;
		for (int i = 0; i < psArray.length; i++) {
			psArray[i].showinfo();
		}
		
		System.out.println(((Student)psArray[3]).getShcoolname());
		((Student)psArray[4]).setShcoolname("마산고등학교");
		//강제로 형 변환을 한뒤 student에 있는 학교이름을 가지고 왔다
		for (int i = 0; i < psArray.length; i++) {
			psArray[i].showinfo();
		}
		//케스팅 테스트
		Person t01=psArray[4];
		//Student t02=psArray[4];//오류 양쪽의 자료형이 다름 
		//부모를 자식 안에 넣을 수는 없음
		Student t03=(Student)psArray[4];
		//업케스팅 자식을 부모의 타입으로 변환
		Person t04=(Student)psArray[4];
	}

}
