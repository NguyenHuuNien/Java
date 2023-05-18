package uxPhanMem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import khachHang.KhachHang;
import uiGiaoDienPhanMem.*;
import xulyFile.LoadFile;
import xulyFile.SaveFile;
public class UX_Controls {
	private static String linkData;
	public UX_Controls(){
		
		GiaoDienPhamMem ux = new GiaoDienPhamMem(null);
		ux.btLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ux.txtComment.setText("Vui lòng paste đường dẫn file muốn load");
				ux.btOk.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							linkData = ux.txtInput.getText();
					}
				});
				ArrayList<KhachHang> KH = new ArrayList<>();
				KH = LoadFile.loadFile(linkData);
				StringBuilder sb = new StringBuilder();
				for(Object o:KH) {
					sb.append(o.toString()).append("\n");
				}
				ux.txtKQ.setText(sb.toString());
			}
		});
		
		ux.btSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ux.txtKQ.getText()==null) {
					ux.txtComment.setText("Vui lòng load dữ liệu trước");
				}else {
					
				}
			}
		});
		
		String[] addInfor = null;
		ux.btAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ux.txtKQ.getText()==null) {
					ux.txtComment.setText("Vui lòng load dữ liệu trước");
				}else {
					ux.txtComment.setText("Vui lòng nhập tên");
					ux.btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[0] = ux.txtInput.getText();
						}
					});
					ux.txtComment.setText("Vui lòng nhập tuổi");
					ux.btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[1] = ux.txtInput.getText();
						}
					});
					ux.txtComment.setText("Vui lòng nhập giới tính");
					ux.btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[2] = ux.txtInput.getText();
						}
					});
					ux.txtComment.setText("Vui lòng nhập số điện thoại");
					ux.btOk.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addInfor[3] = ux.txtInput.getText();
						}
					});
					
				}
			}
		});
		
		ux.btSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<KhachHang> KH = new ArrayList<>();
				KH = LoadFile.loadFile(linkData);
				KH.add(new KhachHang(addInfor[0],addInfor[1],addInfor[2],addInfor[3]));
				boolean kq = SaveFile.saveFile(KH, linkData);
				if(kq) {
					ux.txtComment.setText("Lưu thành công");
				}else {
					ux.txtComment.setText("Lưu thất bại");
				}
			}
		});
	}
}
