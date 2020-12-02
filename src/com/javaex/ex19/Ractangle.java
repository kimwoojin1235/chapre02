package com.javaex.ex19;

public class Ractangle extends Shape{
	//필드
	private String fillcolor;
	private String linecolor;
	private int width;
	private int height;
	//생성자
	public Ractangle() {}
	public Ractangle(String fillcolor, String linecolor, int width, int height) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		this.width = width;
		this.height = height;
	}
	//메소드g/s
	public String getFillcolor() {
		return fillcolor;
	}
	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}
	public String getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
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
	//메소드 일반
	public void draw() {
		System.out.println("사각형-면색:"+fillcolor+" 선색:"+linecolor+
				" 가로:"+width+" 세로:"+height);
	}
	@Override
	public String toString() {
		return "Ractangle [fillcolor=" + fillcolor + ", linecolor=" 
	+ linecolor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	
	
	
}
