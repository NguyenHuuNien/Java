package bai4_BoxLayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBoxLayoutUI extends JFrame{
	public HocBoxLayoutUI(String title) {
		super(title);
		addControls();
		showWindow();
	}
	public void addControls() {
		Container con = getContentPane();
		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		
		Button bt1 = new Button("Demo button 1");
		bt1.setBackground(Color.BLUE);
		bt1.setForeground(Color.CYAN);
		Button bt2 = new Button("Demo button 2");
		bt2.setBackground(Color.CYAN);
		Button bt3 = new Button("Demo button 3");
		bt3.setBackground(Color.GREEN);
		
		pnBox.add(bt1);
		pnBox.add(bt2);
		pnBox.add(bt3);
		
		con.add(pnBox);
	}
	public void showWindow() {
		this.setSize(600,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
