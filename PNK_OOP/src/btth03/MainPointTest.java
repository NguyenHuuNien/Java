package btth03;

public class MainPointTest {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.toString()); // in p truoc khi set
		MovablePoint mp = new MovablePoint();
		p.setX(3);
		p.setY(5);
		System.out.println(p.toString()); // in p sau khi set
		mp.setSpeed(8, 5);
		System.out.println(mp.toString()); // in thong tin mp
		System.out.println("Sau khi move: ");
		System.out.println(mp.move().toString()); // in thong tin cua diem mp sau khi move
	}

}
