package baiTapveStaticVaFinal;

import java.util.Random;

public class MyClass {
	private final int numStudent = 40;
	private final int soMay = new Random().nextInt(40);
	private static int ID = 0;
	class ClassManagement{
		private int idClass;
		void increace() {
			ID++;
			idClass = ID;
		}
		void display() {
			System.out.println("ID: " + idClass +"So luong sinh vien cua lop : " + numStudent + 
					"\nSo luong may tinh duoc cap phat: " + soMay);
		}
	}
	
	public static void main(String[] args) {
		MyClass.ClassManagement cl1 = new MyClass().new ClassManagement();
		MyClass.ClassManagement cl2 = new MyClass().new ClassManagement();
		MyClass.ClassManagement cl3 = new MyClass().new ClassManagement();
		cl1.increace();
		cl2.increace();
		cl3.increace();
		cl1.display();
		cl2.display();
		cl3.display();
		System.out.println("Dm Bella Ha");
	}
}
