package com.javaex.ex16;

import javax.security.auth.Subject;

public class PersonApp {

	public static void main(String[] args) {
		
		//Person배열관리
		Person[] pArray=new Person[3];
		Person p01=new Person("둘리",1203);
		//System.out.println(p01.toString());
		Person p02=new Person("도우너",200);
		Person p03=new Person("마이콜",300);
		pArray[0]=p01;
		pArray[1]=p02;
		pArray[2]=p03;
		//p01.showinfo();
		for (int i = 0; i < pArray.length; i++) {
			pArray[i].showinfo();
		}
		Student[] sArray=new Student[2];
		Student s01=new Student("유재석",44,"서울고등학교");
		//System.out.println(s01.toString());
		Student s02=new Student("강호동",47,"경기고등학교");
		
		sArray[0]=s01;
		sArray[1]=s02;
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].showinfo();
		}
		
		
		
		
		
		//s01.showinfo2();student가 원하는 것이 호출 가능
		//s01.showinfo();부모쪽 호출==>학교정보가 없음
		//Student.showinfo2==>Student.showinfo메소드를 같게 만듬
		//s01.showinfo();//부모쪽의showinfo를 사용이 불가능
	}

}
