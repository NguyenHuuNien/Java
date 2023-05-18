package bai1_JFrame;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public MyWindow(String title) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(title);
		this.setVisible(true);
	}
	public void showN() {
		this.setVisible(true);
	}
	public void showN(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	public void showN(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width,height);
		this.setVisible(true);
	}
}
