package bai3_viewJpane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class MyCalculator extends JFrame{
	public MyCalculator() {
		this.setTitle("First Caculator of Nien");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField,BorderLayout.CENTER);
		JButton jb0 = new JButton("0");
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jbcong = new JButton("+");
		JButton jbtru = new JButton("-");
		JButton jbnhan = new JButton("x");
		JButton jbchia = new JButton("/");
		JButton jbbang = new JButton("=");
		
		JPanel jpanel_button = new JPanel();
		
		jpanel_button.setLayout(new GridLayout(5,3));
		
		jpanel_button.add(jb0);
		jpanel_button.add(jb1);
		jpanel_button.add(jb2);
		jpanel_button.add(jb3);
		jpanel_button.add(jb4);
		jpanel_button.add(jb5);
		jpanel_button.add(jb6);
		jpanel_button.add(jb7);
		jpanel_button.add(jb8);
		jpanel_button.add(jb8);
		jpanel_button.add(jb9);
		jpanel_button.add(jbcong);
		jpanel_button.add(jbtru);
		jpanel_button.add(jbnhan);
		jpanel_button.add(jbchia);
		jpanel_button.add(jbbang);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_button,BorderLayout.CENTER);
		this.add(jPanel_head,BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyCalculator();
	}
}
