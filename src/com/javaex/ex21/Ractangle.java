package com.javaex.ex21;

public class Ractangle extends Shape{
	private int width;
	private int height;
	public Ractangle() {}
	public Ractangle(String fillcolor,String linecolor, int width, int height) {
		super(fillcolor,linecolor);
		this.width = width;
		this.height = height;
	}
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
	public void draw() {
		System.out.println("사각형-면색"+fillcolor+" 선색:"+linecolor+" 가로:"+width+" 세로:"+height);
	}
	public double area() {
		return width*height;
	}
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
