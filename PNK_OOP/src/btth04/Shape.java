package btth04;

public abstract class Shape {
	protected String color = "red";
	protected boolean filled = true;
	public Shape() {
		super();
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getBool() {
		return color;
	}
	public void setBool(String bool) {
		this.color = bool;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString() {
		return "Shape[color="+this.color + ",filled="+this.filled+"]";
	}
}
