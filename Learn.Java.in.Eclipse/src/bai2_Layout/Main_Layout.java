package bai2_Layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main_Layout {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		BorderLayout bl = new BorderLayout(15,25);
		jf.setLayout(bl);
		jf.add(new JButton("Click 1"),BorderLayout.CENTER);
		jf.add(new JButton("Click 2"),BorderLayout.WEST);
		jf.add(new JButton("Click 3"),BorderLayout.EAST);
		jf.add(new JButton("Click 4"),BorderLayout.NORTH);
		jf.add(new JButton("Click 5"),BorderLayout.SOUTH);
		jf.setTitle("Program of Nien");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,600);
		jf.setVisible(true);
	}
}
