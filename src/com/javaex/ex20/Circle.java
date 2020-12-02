package com.javaex.ex20;

public class Circle extends Shape{	
	private int radius;

	public Circle() {	}

	public Circle(String fillcolor, String linecolor,int radius) {
		super(fillcolor,linecolor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw(){
		System.out.println("원-면색:"+fillcolor+" 선색:"+linecolor+" 반지름:"+radius+" 면적:"+area());
	}
	public double area() {
		return 3.14*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
