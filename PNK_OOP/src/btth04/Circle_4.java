package btth04;

public class Circle_4 implements GeometriObject{
	protected double radius;
	public Circle_4() {}
	public Circle_4(double rradius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle[radius="+this.radius+"]";
	}
	@Override
	public double getPerimeter() {
		return 2 * 3.24 * this.radius;
	}
	@Override
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}
