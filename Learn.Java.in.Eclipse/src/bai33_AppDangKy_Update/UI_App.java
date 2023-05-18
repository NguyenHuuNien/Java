package bai33_AppDangKy_Update;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI_App extends JFrame {
	private Container ui;
	public UI_App(String title) {
		this.setTitle(title);
		this.showWindow();
	}
	
	public void addButton() {
		
		JPanel dau = new JPanel();
		dau.setLayout(new FlowLayout());
		JLabel s_DangKy = new JLabel("Đăng Ký");
		dau.add(s_DangKy, BorderLayout.CENTER);
		
		JPanel than = new JPanel();
		than.setLayout(new BoxLayout(than,BoxLayout.X_AXIS));
		JLabel s_Email = new JLabel("Email");
		JLabel s_TaiKhoan = new JLabel("Tài khoản");
		JLabel s_MatKhau = new JLabel("Mật khẩu");
		JLabel s_ag_MatKhau = new JLabel("Nhập lại mật khẩu");
		JLabel s_sdt = new JLabel("Số điện thoại");
		JTextField t_Email = new JTextField(25);
		JTextField t_TaiKhoan = new JTextField(25);
		JTextField t_MatKhau = new JTextField(25);
		JTextField t_ag_MatKhau = new JTextField(25);
		JTextField t_sdt = new JTextField(25);
		than.add(s_Email); than.add(t_Email);
		than.add(s_TaiKhoan); than.add(t_TaiKhoan);
		than.add(s_MatKhau); than.add(t_MatKhau);
		than.add(s_ag_MatKhau); than.add(t_ag_MatKhau);
		than.add(s_sdt); than.add(t_sdt);
		
		JPanel ket = new JPanel();
		JButton bt_DangKy = new JButton("Đăng Ký");
		ket.add(bt_DangKy,BorderLayout.CENTER);
		
		ui.setLayout(new BorderLayout());
		than.setPreferredSize(new Dimension(0,50));
		ui.add(than,BorderLayout.CENTER);
		ui.add(ket,BorderLayout.NORTH);
		ui.add(dau,BorderLayout.SOUTH);
	}
	
	public void showWindow() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,300);
		this.setLocationRelativeTo(null);
		
		addButton();
		this.add(ui);
		
		this.setVisible(true);
	}
}
