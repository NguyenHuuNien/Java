package bai1_JFrame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame m1 = new MyWindow();
		JFrame m2 = new MyWindow("Hello World");
		MyWindow m3 = new MyWindow();
		m3.showN("Hyu Nie");
	}

}
