package com.javaex.ex16;

public class Student extends Person{
	//필드
	private String shcoolname;
	//생성자
	public Student() {}
	public Student(String name,int age,String shcoolname) {
		super(name,age);
		this.shcoolname = shcoolname;
	}//한개 짜리는 의미가 없어 안만듬
	//메소드g/s
	public String getShcoolname() {
		return shcoolname;
	}
	public void setShcoolname(String shcoolname) {
		this.shcoolname = shcoolname;
	}
	//메소드 일반
	@Override
	public String toString() {
		return "Student [shcoolname=" + shcoolname + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	public void showinfo() {
		System.out.println("이름:"+super.getName()+" 나이:"+super.getAge()+" 학교:"+shcoolname);
	}


}
