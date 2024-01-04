package btth04;

public class Bai1 {

	public static void main(String[] args) {
		Circle c = new Circle(3.0,"red",true);
		Rectangle r = new Rectangle(3,5,"white",false);
		Square s = new Square(4,"blue",true);
		System.out.println(c.toString());
		System.out.println(r.toString());
		System.out.println(s.toString());
	}

}
