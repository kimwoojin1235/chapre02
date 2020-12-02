package com.javaex.ex20;


public class Ractangle extends Shape {
	private int width;
	private int height;
	//생성자
	public Ractangle() {}
	public Ractangle(String fillcolor, String linecolor,int width, int height) {
		super(fillcolor,linecolor);
		this.width = width;
		this.height = height;
	}
	//메소드g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//메소드 일반
	public void draw() {
		System.out.println("사각형-면색:"+fillcolor+" 선색:"+linecolor+
				" 가로:"+width+" 세로:"+height+" 면적:"+area());
	}
	public double area() {	
		double area = width*height;
		return area;
	}
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillcolor()=" + getFillcolor()
				+ ", getLinecolor()=" + getLinecolor() + "]";
		
	}
}
