package bai32_AppDangKy_Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Main_DangKy extends JFrame{

	public Main_DangKy() {
		this.setTitle("Màn Hình Đăng Ký <Hyu Nie>");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false); // không cho user điều chỉnh size
		
		this.setLayout(new BorderLayout());
		
		JPanel dau = new JPanel();
		JPanel than = new JPanel();
		JPanel ket = new JPanel();
		
		JLabel modau = new JLabel("Đăng ký");
		modau.setHorizontalAlignment(JLabel.CENTER);
		dau.add(modau,BorderLayout.NORTH);
		
		JLabel email = new JLabel("Email");
		email.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel taikhoan = new JLabel("Tài khoản");
		taikhoan.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel matkhau = new JLabel("Mật khẩu");
		matkhau.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel ag_matkhau = new JLabel("Nhập lại mật khẩu");
		ag_matkhau.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel sdt = new JLabel("Số điện thoại");
		sdt.setHorizontalAlignment(JLabel.CENTER);
		
		JTextField t_email = new JTextField(20);
//		t_email.setPreferredSize(new Dimension(200, 20));
		JTextField t_taikhoan = new JTextField(20);
		JTextField t_matkhau = new JTextField(20);
		JTextField t_ag_matkhau = new JTextField(20);
		JTextField t_sdt = new JTextField(20);
		
		than.setLayout(new GridLayout(5,2));
		than.add(email); than.add(t_email,BorderLayout.CENTER);
		than.add(taikhoan); than.add(t_taikhoan);
		than.add(matkhau); than.add(t_matkhau);
		than.add(ag_matkhau); than.add(t_ag_matkhau);
		than.add(sdt); than.add(t_sdt);
		
		this.add(dau,BorderLayout.NORTH);
		this.add(than,BorderLayout.CENTER);
		this.add(ket,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main_DangKy();
	}

}
