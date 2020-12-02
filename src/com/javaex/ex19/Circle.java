package com.javaex.ex19;

public class Circle extends Shape{
	//필드
	private String fillcolor;
	private String linecolor;
	private int radius; 
	//생성자
	public Circle() {}
	public Circle(String fillcolor, String linecolor, int radius) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		this.radius = radius;
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
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//메소드 일반
	public void dorw() {
		System.out.println("원-면색:"+fillcolor+" 선색:"+linecolor+" 반지름:"+radius);
	}
	@Override
	public String toString() {
		return "Circle [fillcolor=" + fillcolor + ", linecolor=" + linecolor + ", radius=" + radius + "]";
	}
}
