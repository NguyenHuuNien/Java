package bai31_Layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculatorUpdate extends JFrame{

	public MyCalculatorUpdate() {
		this.setTitle("Calcullator Update by Hyu Nie");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JPanel jp_text = new JPanel();
		jp_text.setLayout(new BorderLayout());
		JTextField tf = new JTextField(50);
		tf.setPreferredSize(new Dimension(200, 80));
		jp_text.add(tf,BorderLayout.CENTER);
		
		JPanel jp_button = new JPanel();
		for(int i=0;i<10;i++) {
			JButton jb = new JButton(i+"");
//			jb.setSize(50,50);
			jp_button.add(jb);
		}
		jp_button.setLayout(new GridLayout(5,3,10,10));
		JButton btcong = new JButton("+");
		JButton bttru = new JButton("-");
		JButton btnhan = new JButton("x");
		JButton btchia = new JButton("%");
		JButton btbang = new JButton("=");
		jp_button.add(btcong);
		jp_button.add(bttru);
		jp_button.add(btbang);
		jp_button.add(btnhan);
		jp_button.add(btchia);
		
		
		JButton bt_Setting = new JButton("Setting");
		JButton bt_History = new JButton("History");
		JButton bt_UpSize = new JButton("UpSize");
		JButton bt_DownSize = new JButton("DownSize");
		JButton bt_help = new JButton("Help");
		JButton bt_introduce = new JButton("Introduce");
		JPanel jp_tasbar = new JPanel();
		jp_tasbar.setLayout(new GridLayout(1,6));
		jp_tasbar.add(bt_UpSize);
		jp_tasbar.add(bt_DownSize);
		jp_tasbar.add(bt_History);
		jp_tasbar.add(bt_Setting);
		jp_tasbar.add(bt_help);
		jp_tasbar.add(bt_introduce);
		
		
		JPanel jp_than = new JPanel();
		jp_than.setLayout(new BorderLayout(10,10));
		jp_than.add(jp_text,BorderLayout.NORTH);
		jp_than.add(jp_button,BorderLayout.CENTER);
		jp_tasbar.setPreferredSize(new Dimension(0, 50));
		jp_text.setPreferredSize(new Dimension(0,150));
		this.setLayout(new BorderLayout(5,5));
		this.add(jp_tasbar,BorderLayout.NORTH);
		this.add(jp_than,BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyCalculatorUpdate();
	}

}
