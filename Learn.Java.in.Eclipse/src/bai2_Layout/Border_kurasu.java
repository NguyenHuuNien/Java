package bai2_Layout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class Border_kurasu extends JFrame{
	public void hien(String title,int hight,int wight) {
		this.setTitle(title);
		this.setSize(wight,hight);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void addBu(JFrame jf,JButton button) {
		button.setPreferredSize(new Dimension());
		jf.add(button);
	}

}
