package thiet_ke_ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI_PTBac2 extends JFrame{
	JTextField tfHSa,tfHSb,tfHSc,tfKQ1,tfKQ2,tfKQ,tfKQvonghiem;
	JButton btTinh;
	JPanel jmain , pnKQ, pnKQvn;
	Container con;
	public UI_PTBac2(String title) {
		super(title);
		addControls();
		addEvent();
	}
	
	public void addEvent() {
		btTinh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String hsa = tfHSa.getText();
				String hsb = tfHSb.getText();
				String hsc = tfHSc.getText();
				double a = Double.parseDouble(hsa);
				double b = Double.parseDouble(hsb);
				double c = Double.parseDouble(hsc);
				if(a==0) {
					if(b==0) {
						if(c==0) {
							tfKQ.setText("Phuong trinh vo so nghiem");
						}else {
							tfKQ.setText("Phuong trinh vo nghiem");
						}
					}else {
						if(c==0) {
							tfKQ.setText("X = "+b);
						}else {
							tfKQ.setText("X = "+(-c/b));
						}
					}
				}else {
					double delta = b*b-4*a*c;
					if (delta<0) {
						tfKQ.setText("Phuong trinh vo nghiem");
					}else if(delta==0) {
						tfKQ.setText("X = "+(-b/(2*a))+"");
					}else {
						tfKQ.setText("               X1 = "+Math.round(((-b+Math.sqrt(delta))/(2*a))*100)/100.0+"     ||     "+"X2 = "+Math.round(((-b-Math.sqrt(delta))/(2*a))*100)/100.0+"");
					}
				}
			}
		});
	}
	
	public void addControls() {
		con = getContentPane();
		jmain = new JPanel();
		jmain.setLayout(new BoxLayout(jmain,BoxLayout.Y_AXIS));
		con.add(jmain);
		
		JPanel titleMain = new JPanel();
		JLabel txtTitle = new JLabel("Chuong trinh giai pt bac 2");
		txtTitle.setForeground(Color.YELLOW);
		Font fontTXT = new Font("Korin",Font.BOLD|Font.ITALIC,26);
		txtTitle.setFont(fontTXT);
		titleMain.add(txtTitle);
		jmain.add(titleMain);
		
		JPanel pnHSa = new JPanel();
		pnHSa.setLayout(new FlowLayout());
		JLabel txtHSa = new JLabel("Nhap he so a:");
		tfHSa = new JTextField(15);
		pnHSa.add(txtHSa);
		pnHSa.add(tfHSa);
		jmain.add(pnHSa);
		
		JPanel pnHSb = new JPanel();
		pnHSb.setLayout(new FlowLayout());
		JLabel txtHSb = new JLabel("Nhap he so b:");
		tfHSb = new JTextField(15);
		pnHSb.add(txtHSb);
		pnHSb.add(tfHSb);
		jmain.add(pnHSb);
		
		JPanel pnHSc = new JPanel();
		pnHSc.setLayout(new FlowLayout());
		JLabel txtHSc = new JLabel("Nhap he so c:");
		tfHSc = new JTextField(15);
		pnHSc.add(txtHSc);
		pnHSc.add(tfHSc);
		jmain.add(pnHSc);
		
		JPanel btControl = new JPanel();
		btControl.setLayout(new BorderLayout());
		JPanel addBT = new JPanel();
		btControl.add(addBT,BorderLayout.EAST);
		btTinh = new JButton("Tinh");
		btTinh.setIcon(new ImageIcon("picture/icon_equal.png"));
		addBT.add(btTinh);
		jmain.add(btControl);
			
		pnKQvn = new JPanel();
		pnKQvn.setLayout(new FlowLayout());
		tfKQ = new JTextField(25);
		JLabel txtVoNghiem = new JLabel("Ket Qua: ");
		pnKQvn.add(txtVoNghiem);
		pnKQvn.add(tfKQ);
		jmain.add(pnKQvn);
	}
	
	public void showWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setSize(400, 350);
		this.setVisible(true);
	}
}
