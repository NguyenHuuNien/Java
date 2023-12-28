package btth03;

public class MainShapeTest {

	public static void main(String[] args) {
		System.out.println("Test shape:");
		Shape shape = new Shape("Blue",true);
		System.out.println(shape.toString());
		System.out.println("Test Circle:");
		Circle circle = new Circle(5.6,"Red",true);
		circle.setFilled(false);
		System.out.println("Area = " + circle.getArea());
		System.out.println("Perimeter = " + circle.getPerimeter());
		System.out.println(circle.toString());
		System.out.println("Test Rectangle:");
		Rectangle rec = new Rectangle(7.4,10.6,"yellow",false);
		rec.setFilled(true);
		rec.setWidth(5.4);
		System.out.println("Area = " + rec.getArea());
		System.out.println("Perimeter = " + rec.getPerimeter());
		System.out.println(rec.toString());
		System.out.println("Test Square:");
		Square squa = new Square();
		squa.setColor("green");
		squa.setFilled(false);
		squa.setSide(8);
		System.out.println("Area = " + squa.getArea());
		System.out.println("Perimeter = " + squa.getPerimeter());
		System.out.println(squa.toString());
		
	}

}
