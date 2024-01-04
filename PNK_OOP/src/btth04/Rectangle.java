package btth04;

public class Rectangle extends Shape{
	protected double width = 1.0;
	protected double height = 1.0;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		return (this.height + this.width) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle["+super.toString()+",width="+this.width+",height="+this.height+"]";
	}

}
