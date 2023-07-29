package translateUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import checkFile.LoadFile;

public class ThietKeUI extends JFrame{
	private JTextArea txtFrom, txtTo;
	private JButton btTranslate;
	private ArrayList<String> Vie = LoadFile.loadFileVie("D://DataVie.txt");
	private ArrayList<String> Jp = LoadFile.loadFileJp("D://DataJp.txt");
	public ThietKeUI(String title) {
		super(title);
		addControl();
		addEvent();
	}

	private void addEvent() {
		btTranslate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tranFrom = txtFrom.getText().toLowerCase();
				int index;
				String kq = null;
				if(Vie.indexOf(tranFrom)>=0) {
					index = Vie.indexOf(tranFrom);
					kq = Jp.get(index);
				}else if(Jp.indexOf(tranFrom)>=0){
					index = Jp.indexOf(tranFrom);
					kq = Vie.get(index);
					kq = kq.substring(0, 1).toUpperCase()+kq.substring(1);
					for(int i=1;i<kq.length();i++) {
						if(kq.charAt(i-1)==' ') {
							kq = kq.substring(0, i) + kq.substring(i, i+1).toUpperCase()+kq.substring(i+1);
						}
					}
				}else {
					index = -1;
				}
				if(index == -1) {
					txtTo.setText("Không có dữ liệu.");
				}else {
					txtTo.setText(kq);
				}
			}
		});
	}

	private void addControl() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new FlowLayout());
		con.add(pnMain);
	
		JPanel pnTop = new JPanel();
		pnMain.add(pnTop);
		pnTop.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabel lbTitle = new JLabel("Translate　日本語");
		Font font = new Font("MS Gothic",Font.BOLD | Font.ITALIC, 25);
		lbTitle.setFont(font);
		pnTop.add(lbTitle);
		
		JPanel pnCenter = new JPanel();
		pnMain.add(pnCenter);
		txtFrom = new JTextArea(10,24);
		txtTo = new JTextArea(10,24);
		btTranslate = new JButton("Translate");
		pnCenter.add(txtFrom);
		pnCenter.add(btTranslate);
		pnCenter.add(txtTo);
	}
	
	public void showWindown() {
		this.setSize(600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
