package com.javaex.ex22;

public class Triangle extends Shape implements Drawable{
	private int side;
	private int height;
	
	public Triangle() {}

	public Triangle(String fillcolor,String linecolor,int side, int height) {
		super(fillcolor,linecolor);
		this.side = side;
		this.height = height;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public void draw() {
		System.out.println("삼각형-면색"+fillcolor+" 선색:"+linecolor+" 변:"+side+" 높이:"+height);
	}
	public double area() {
		return 2/1*side*height;
	}
	@Override
	public String toString() {
		return "Triangle [side=" + side + ", height=" + height + "]";
	}
	
	
}
