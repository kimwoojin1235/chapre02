package com.javaex.ex05;

public class Point {
	private int x;
	private int y;
	
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int x) {
		this.x=x;
	}
	/*public Point(int y) {
		this.y=y;
	}//이 상황은 자료형은 구병을 못하기 때문에
	//x와y를 같은 int로 구별을 하기 때문에 오류가 뜬다.
	사용불가
	*/
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void showinfo() {
		System.out.println("점[x="+x+" y="+y+"]를 그렸습니다");
	}
	public void showinfo(boolean opt) {
		//메소드 오버로딩
		if(opt==true) {
			System.out.println("점[x="+x+" y="+y+"]를 그렸습니다");
		}else {//다른메소드를 불러올수가 있다.
			System.out.println("점[x="+getX()+" y="+getY()+"]를 그렸습니다");
		}
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
