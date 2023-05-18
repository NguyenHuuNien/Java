package thiet_ke_ui;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhuongTrinhBac1UI extends JFrame{
	JTextField txtHSa;
	JTextField txtHSb,txtKQ;
	JButton btGiai,btThoat,btHelp;
	
	ActionListener eventGiai = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			xulyGiaiPhuongTrinh();
		}
	};
	
	public PhuongTrinhBac1UI(String title) {
		super(title);
		addControls();
		addEvent();
	}
	
	protected void xulyGiaiPhuongTrinh() {
		String hsa = txtHSa.getText();
		String hsb = txtHSb.getText();
		double a = Double.parseDouble(hsa);
		double b = Double.parseDouble(hsb);
		if(a==0 && b==0) {
			txtKQ.setText("Vo So Nghiem");
		}else if(a==0 && b!=0) {
			txtKQ.setText("Vo Nghiem");
		}else {
			double x = -b/a;
			txtKQ.setText(""+x);
		}
	}

	public void addEvent() {
		btThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btGiai.addActionListener(eventGiai);
		btHelp.addActionListener(new HelpEvent());
	}
	class HelpEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Xin lien he 0778421699");
		}
		
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
		btGiai.setForeground(Color.GREEN);
		btGiai.setIcon(new ImageIcon("hinhanh/exec.png"));
		btThoat = new JButton("Thoat");
		btThoat.setForeground(Color.RED);
		btThoat.setIcon(new ImageIcon("hinhanh/exit.png"));
		pnButton.add(btGiai);
		pnButton.add(btThoat);
		pnMain.add(pnButton);
		
		btHelp = new JButton("Help");
		btHelp.setForeground(Color.CYAN);
		pnButton.add(btHelp);
		
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
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
