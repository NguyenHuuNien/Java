package ui_thietke_calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI_Calculator extends JFrame{
	JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btcong,btcham,btAns,bttru,btnhan,btchia,btchiadu,btmu,btgiaithua,btbang;
	JTextField txtShowNhap,txtShowKQ;
	public UI_Calculator(String title) {
		super(title);
		addControls();
		addEvent();
	}
	
	public void addEvent() {
//		String Ans;
		bt0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"0");
			}
		});
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"1");
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"2");
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"3");
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"4");
			}
		});
		
		bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"5");
			}
		});
		
		bt6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"6");
			}
		});
		
		bt7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"7");
			}
		});
		
		bt8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"8");
			}
		});
		
		bt9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"9");
			}
		});
		
		btcong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"+");
			}
		});
		
		bttru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"-");
			}
		});
		
		btnhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"x");
			}
		});
		
		btchia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"/");
			}
		});
		
		btchiadu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"%");
			}
		});
		
		btmu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"^");
			}
		});
		
		btgiaithua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+"!");
			}
		});
		
		btcham.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				txtShowNhap.setText(s+".");
			}
		});
		
		btAns.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtShowNhap.getText();
				String Ans = txtShowKQ.getText();
				txtShowNhap.setText(s+"Ans");
			}
		});
		
		btbang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int kq = 0,num1=0,num2=0;
				String s = txtShowNhap.getText();
				int i=0;
				while(i<=s.length()) {
					String sNum1 = "";
					for(int j=i; j<s.length();j++) {
						if(Character.isDigit(s.charAt(j))) {
							sNum1 += s.charAt(j);
							i++;
						}else {
							if(s.charAt(j)=='A') {
								i++;
								sNum1+="Ans";
							}
							break;
						}
					}
					String sKyTu="";
					for(int j=i; j<s.length();j++) {
						if(!Character.isDigit(s.charAt(j))) {
							sKyTu += s.charAt(j);
							i++;
						}else {
							break;
						}
					}
					String sNum2 = "";
					for(int j=i; j<s.length();j++) {
						if(Character.isDigit(s.charAt(j))) {
							sNum2 += s.charAt(j);
							i++;
						}else {
							if(s.charAt(j)=='A') {
								i++;
								sNum2+="Ans";
							}
							break;
						}
					}
					i++;
					if(!sNum1.isEmpty()) {
						if(sNum1.equals("Ans")) {
							String Ans = txtShowKQ.getText();
							num1 = Integer.parseInt(Ans);
						}else {
						num1 = Integer.parseInt(sNum1);
						}
					}else {
						num1 = 0;
					}
					if(!sNum2.isEmpty()) {
						if(sNum2.equals("Ans")) {
							String Ans = txtShowKQ.getText();
							num2 = Integer.parseInt(Ans);
						}else {
						num2 = Integer.parseInt(sNum2);
						}
					}else {
						num2 = 0;
					}
					switch(sKyTu) {
					case "+":
						kq += num1 + num2;
						break;
					case "-":
						kq += num1 - num2;
						break;
					case "x":
						kq += num1 * num2;
						break;
					case "%":
						kq += num1 / num2;
						break;
					}
					
					System.out.println(kq+" ");
				}
				txtShowKQ.setText(kq+"");
			}
		});
	}
	
	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain,BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnBtTasbar = new JPanel();
		pnBtTasbar.setLayout(new BoxLayout(pnBtTasbar,BoxLayout.X_AXIS));
		JButton btFile =  new JButton("File");
		JButton btSetting = new JButton("Setting");
		JButton btHelp = new JButton("Help");
		JButton btEdit = new JButton("Edit");
		JButton btView = new JButton("View");
		JButton btHistory = new JButton("History");
		pnBtTasbar.add(btFile);
		pnBtTasbar.add(btEdit);
		pnBtTasbar.add(btView);
		pnBtTasbar.add(btHistory);
		pnBtTasbar.add(btSetting);
		pnBtTasbar.add(btHelp);
		pnMain.add(pnBtTasbar);
		
		JPanel pnThan = new JPanel();
		pnThan.setLayout(new BorderLayout());
		
		JPanel pnShowKQ = new JPanel();
		pnShowKQ.setLayout(new BorderLayout());

		JPanel pnTXTShowNhap = new JPanel(new GridLayout(1, 2));
		txtShowNhap = new JTextField(25);
		pnTXTShowNhap.add(txtShowNhap);

		JPanel pnTXTShowKQ = new JPanel(new GridLayout(1, 2));
		txtShowKQ = new JTextField(25);
		pnTXTShowKQ.add(txtShowKQ);
//		pnTXTShowKQ.setPreferredSize(new Dimension(0,50));
		pnShowKQ.add(pnTXTShowKQ, BorderLayout.SOUTH);
		pnShowKQ.add(pnTXTShowNhap, BorderLayout.CENTER);
		pnShowKQ.setPreferredSize(new Dimension(0,100));
		pnThan.add(pnShowKQ, BorderLayout.NORTH);

		JPanel pnButton = new JPanel();
		pnButton.setLayout(new GridLayout(5,4));
		bt0 = new JButton("0");
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		btcong = new JButton("+");
		bttru = new JButton("-");
		btnhan = new JButton("x");
		btchia = new JButton("%");
		btcham = new JButton(".");
		btbang = new JButton("=");
		btAns = new JButton("Ans");
		btchiadu = new JButton("%R");
		btmu = new JButton("^");
		btgiaithua = new JButton("!");
		pnButton.add(bt7);
		pnButton.add(bt8);
		pnButton.add(bt9);
		pnButton.add(btcong);
		pnButton.add(bt4);
		pnButton.add(bt5);
		pnButton.add(bt6);
		pnButton.add(bttru);
		pnButton.add(bt1);
		pnButton.add(bt2);
		pnButton.add(bt3);
		pnButton.add(btnhan);
		pnButton.add(bt0);
		pnButton.add(btcham);
		pnButton.add(btAns);
		pnButton.add(btchia);
		pnButton.add(btchiadu);
		pnButton.add(btmu);
		pnButton.add(btgiaithua);
		pnButton.add(btbang);
		pnThan.add(pnButton, BorderLayout.CENTER);
		pnMain.add(pnThan);
	}
	
	public void showWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
//		this.setLocationRelativeTo(null);
		this.setSize(400, 500);
		this.setVisible(true);
	}
}
