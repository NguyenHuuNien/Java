package thietKeUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderAndJTextArea extends JFrame{
	JTextField txtName;
	JTextArea txtAddress;
	Button btOK;
	public HocBorderAndJTextArea(String title) {
		super(title);
		addControls();
		addEvents();
	}
	
	public void addEvents() {
		
	}
	
	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnInfor = new JPanel();
		pnMain.add(pnInfor);
		pnInfor.setLayout(new BoxLayout(pnInfor, BoxLayout.Y_AXIS));
		JPanel pnName = new JPanel();
		pnName.setLayout(new FlowLayout());
		JLabel lbTen = new JLabel("Nhap ten:");
		txtName = new JTextField(20);
		
		pnName.add(lbTen);
		pnName.add(txtName);
		pnInfor.add(pnName);
		
		JPanel pnDiaChi = new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		JLabel lbDiaChi = new JLabel("Dia chi:");
		txtAddress = new JTextArea(5,19);
		JScrollPane sc = new JScrollPane(txtAddress,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDiaChi.add(lbDiaChi);
		pnDiaChi.add(sc);
		pnInfor.add(pnDiaChi);
		
		Border bdInfor = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder bdTInfor = new TitledBorder(bdInfor,"Thong Tin:");
		pnInfor.setBorder(bdTInfor);
		bdTInfor.setTitleColor(Color.GREEN);
		bdTInfor.setTitleJustification(TitledBorder.CENTER);
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btOK = new Button("OK");
		pnOK.add(btOK);
		pnMain.add(pnOK);
		
		lbDiaChi.setPreferredSize(lbTen.getPreferredSize());
	}
	
	public void showWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setSize(400, 250);
		this.setVisible(true);
	}
}
