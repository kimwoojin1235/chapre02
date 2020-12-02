package com.javaex.ex15;

public class ColorPoint extends Point{
	//필드
	private String color;
	//생성자
	public ColorPoint() {
		
	}
	public ColorPoint(String color) {
	this.color=color;	
	System.out.println("color(1)");
	}
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color = color;
		System.out.println("Color(3)");
	}
	//메소드g/s

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//메소드 일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	public void showinfo() {
		System.out.println("좌표x:"+x+" 좌표y:"+y+" 컬러:"+color);
	}
	
	
}
