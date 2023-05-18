package uiGiaoDienPhanMem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import khachHang.KhachHang;
import uxPhanMem.UX_Controls;
import xulyFile.LoadFile;
import xulyFile.SaveFile;

public class GiaoDienPhamMem extends JFrame{
	public JButton btOk,btSearch,btLoad,btAdd,btSave;
	private static String linkData;
	public JTextArea txtKQ;
	public JTextField txtComment,txtInput;
	public GiaoDienPhamMem (String title) {
		super(title);
		addControl();
		addEvent();
	}
	public void addEvent() {
		btLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtComment.setText("Vui lòng paste đường dẫn file muốn load");
				btOk.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							linkData = txtInput.getText();
					}
				});
				ArrayList<KhachHang> KH = new ArrayList<>();
				KH = LoadFile.loadFile(linkData);
				StringBuilder sb = new StringBuilder();
				for(Object o:KH) {
					sb.append(o.toString()).append("\n");
				}
				txtKQ.setText(sb.toString());
			}
		});
		
		btSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtKQ.getText()==null) {
					txtComment.setText("Vui lòng load dữ liệu trước");
				}else {
					
				}
			}
		});
		
		String[] addInfor = new String[4];
		btAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtKQ.getText()==null) {
					txtComment.setText("Vui lòng load dữ liệu trước");
				}else {
					txtComment.setText("Vui lòng nhập tên");
					btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[0] = txtInput.getText();
						}
					});
					txtComment.setText("Vui lòng nhập tuổi");
					btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[1] = txtInput.getText();
						}
					});
					txtComment.setText("Vui lòng nhập giới tính");
					btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[2] = txtInput.getText();
						}
					});
					txtComment.setText("Vui lòng nhập số điện thoại");
					btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[3] = txtInput.getText();
						}
					});
					
				}
			}
		});
		
		btSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<KhachHang> KH = new ArrayList<>();
				KH = LoadFile.loadFile(linkData);
				KH.add(new KhachHang(addInfor[0],addInfor[1],addInfor[2],addInfor[3]));
				boolean kq = SaveFile.saveFile(KH, linkData);
				if(kq) {
					txtComment.setText("Lưu thành công");
				}else {
					txtComment.setText("Lưu thất bại");
				}
			}
		});
	}
	public void addControl() {
		Container ui = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		ui.add(pnMain);
		
		JPanel pnTop = new JPanel();
		JLabel txtTop = new JLabel("Chương Trình Kiểm Soát Thông Tin Khách Hàng");
		txtTop.setForeground(Color.BLUE);
		Font font = new Font("Arial",Font.BOLD,20);
		txtTop.setFont(font);
		pnTop.add(txtTop,BorderLayout.PAGE_START);
		pnMain.add(pnTop,BorderLayout.NORTH);
		
		JPanel pnBody = new JPanel();
		pnBody.setLayout(new FlowLayout());
		pnMain.add(pnBody,BorderLayout.CENTER);
		
		txtComment = new JTextField(25);
		pnBody.add(txtComment);
		
		txtInput = new JTextField(40);
		JPanel pnOk = new JPanel();
		pnOk.setLayout(new FlowLayout());
		btOk = new JButton("OK");
		btOk.setForeground(Color.GREEN);
		btOk.setBackground(Color.PINK);
		txtInput.setPreferredSize(new Dimension(25,50));
		pnOk.add(txtInput);
		pnOk.add(btOk);
		pnBody.add(pnOk);
		
		JPanel pnBt = new JPanel();
		GridLayout loGrid = new GridLayout(1,3);
		loGrid.setHgap(40);
		pnBt.setLayout(loGrid);
		btSearch = new JButton("Search");
		btLoad = new JButton("Load");
		btAdd = new JButton("Add");
		btSearch.setPreferredSize(new Dimension(80, 35));
		btLoad.setPreferredSize(btSearch.getPreferredSize());
		btAdd.setPreferredSize(btSearch.getPreferredSize());
		pnBt.add(btSearch); pnBt.add(btLoad); pnBt.add(btAdd);
		pnBody.add(pnBt);
		
		JPanel pnKQSAVE = new JPanel();
		pnKQSAVE.setLayout(new FlowLayout());
		pnBody.add(pnKQSAVE);
		
		JPanel pnInfor = new JPanel();
		Border border = BorderFactory.createLineBorder(Color.RED);
		TitledBorder borderTitle = BorderFactory.createTitledBorder(border,"Thông Tin");
		pnInfor.setBorder(borderTitle);
		pnKQSAVE.add(pnInfor);
		
		txtKQ = new JTextArea(10,38);
		JScrollPane sc = new JScrollPane(txtKQ,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnInfor.add(sc);
		btSave = new JButton("Save");
		pnKQSAVE.add(btSave);
	}
	
	public void showWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(600, 450);
		this.setVisible(true);
	}
}
