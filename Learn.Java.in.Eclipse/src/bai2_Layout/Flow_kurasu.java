package bai2_Layout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class Flow_kurasu extends JFrame{
	public void hien(String title,int hight,int wight) {
		this.setTitle(title);
		this.setSize(wight,hight);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,30,50));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void addBu(JFrame jf,JButton button) {
		button.setPreferredSize(new Dimension(100,20));
		jf.add(button);
	}

}
