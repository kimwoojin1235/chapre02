package com.javaex.ex20;

public abstract class Shape {
	//필드
		protected String fillcolor;
		protected String linecolor;
		//생성자
		public Shape() {}
		public Shape(String fillcolor, String linecolor) {
			this.fillcolor = fillcolor;
			this.linecolor = linecolor;
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
		//메소드 일반
		//draw()는 만들수 없음==>오버라이딩 이용
		public abstract void draw();
		public abstract double area();
		@Override
		public String toString() {
			return "Shape [fillcolor=" + fillcolor + ", linecolor=" + linecolor + "]";
		}
}
