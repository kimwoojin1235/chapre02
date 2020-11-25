package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void setpoint(int i) {
		x = i;
	}
	public int getpoint() {
		return x;
	}
	
	public void setpoint1(int j) {
		y=j;
	}
	public int getpoint1() {
		return y;
	}
	public void show() {
		System.out.println("p1점은[x="+x+" y="+y+"] 에 찍었습니다.");
	}
}
