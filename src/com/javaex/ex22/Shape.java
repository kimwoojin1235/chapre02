package com.javaex.ex22;

public abstract class Shape {
	protected String fillcolor;
	protected String linecolor;
	public Shape() {
	}
	public Shape(String fillcolor, String linecolor) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
	}
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
	//public abstract void draw();//Drawable로 개념을 이동
	public abstract double area();
	@Override
	public String toString() {
		return "Shape [fillcolor=" + fillcolor + ", linecolor=" + linecolor + "]";
	}
	
	
}
