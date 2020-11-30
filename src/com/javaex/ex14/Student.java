package com.javaex.ex14;

public class Student extends Person {
	//필드
	private String schoolname;
	//생성자
	public Student(){		
		System.out.println("sutdent()");
	}
	
	public Student(String schoolname) {
		//Person(); 부모쪽 디폴트 생성자 실행
		super();
		this.schoolname = schoolname;
		System.out.println("sutdent(1)");
	}
	public Student(String name,int age,String schoolname) {
		//1.자신의 생성자 시작==> 완료x
		//2.부모의 생성자 호출
		//  -부모의 생성자를 선택할수 있다.
		//  -선택을 하지 않는다면 디폴트 생성자가 실행된다.
		//3.부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료한다.


		//부모 생성자 호출 방법
		//표기가 없으면 디폴트생성자 호출
		//선택을 하면 선택한 생성자 호출
		//super(파라미터)<==이렇게 표기
		super(name, age);
		this.schoolname=schoolname;
		System.out.println("sutdent(3)");
	}
	//메소드 g/s
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	//일반메소드
	
	public void showinfo() {
		/*
		System.out.println(getNameString());//부모쪽의 name을 가지고 온것
		//만일 자식과 부모의 함수이름이 같다면 부모super자식은this를 적어 넣는다.
		System.out.println(getAge());
		System.out.println(schoolname);
		*/
		System.out.println("이름:"+getName()+" 나이:"+getAge()+" 학교:"+schoolname);
		System.out.println("이름:"+name+" 나이:"+age+" 학교:"+ schoolname);
		
	}
	
	@Override
	public String toString() {
		return "Student [schoolname=" + schoolname + "]";
	}
}
