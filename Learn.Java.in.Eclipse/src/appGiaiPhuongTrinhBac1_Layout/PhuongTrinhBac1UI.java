package appGiaiPhuongTrinhBac1_Layout;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;

public class PhuongTrinhBac1UI extends JFrame{
	JTextField txtHSa;
	JTextField txtHSb,txtKQ;
	JButton btGiai,btThoat;
	public PhuongTrinhBac1UI(String title) {
		super(title);
		addControls();
	}
	
	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnTitle = new JPanel();
		pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel lbTitle = new JLabel("Giai phuong trinh bac 1");
		
		lbTitle.setForeground(Color.BLUE);
		Font fontTitle = new Font("Aria",Font.BOLD|Font.ITALIC,20);
		lbTitle.setFont(fontTitle);
		pnTitle.add(lbTitle);
		pnMain.add(pnTitle);
		
		JPanel ptHSa = new JPanel();
		ptHSa.setLayout(new FlowLayout());
		JLabel lbHSa = new JLabel("He so a:");
		txtHSa = new JTextField(15);
		ptHSa.add(lbHSa);
		ptHSa.add(txtHSa);
		pnMain.add(ptHSa);
		
		JPanel ptHSb = new JPanel();
		ptHSa.setLayout(new FlowLayout());
		JLabel lbHSb = new JLabel("He so b:");
		txtHSb = new JTextField(15);
		ptHSb.add(lbHSb);
		ptHSb.add(txtHSb);
		pnMain.add(ptHSb);
		
		JPanel pnButton =  new JPanel();
		pnButton.setLayout(new FlowLayout());
		btGiai = new JButton("Giai");
		btThoat = new JButton("Thoat");
//		btThoat.setIcon(new ImageIcon("picture/exit.png"));
		pnButton.add(btGiai);
		pnButton.add(btThoat);
		pnMain.add(pnButton);
		
		JPanel ptHSkq = new JPanel();
		ptHSa.setLayout(new FlowLayout());
		JLabel lbKQ = new JLabel("Ket Qua:");
		txtKQ = new JTextField(15);
		ptHSkq.add(lbKQ);
		ptHSkq.add(txtKQ);
		pnMain.add(ptHSkq);
	}
	
	public void showWindow() {
		this.setSize(400,250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
