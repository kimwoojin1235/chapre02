package com.javaex.ex22;

public class Cicle extends Shape implements Drawable {
	private int radius;

	public Cicle() {
	}

	public Cicle(String fillcolor, String linecolor, int radius) {
		super(fillcolor, linecolor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원-면색:" + fillcolor + " 선색:" + linecolor + " 반지름:" + radius);
	}

	public double area() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Cicle [radius=" + radius + "]";
	}

}
