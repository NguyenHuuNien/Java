package btth_ThuaKe;

import java.util.Scanner;

public class Nguoi {
	private String hoten;
	private String ngaysinh;
	private String gioitinh;
	private String quequan;
	protected Scanner sc = new Scanner(System.in);
	public Nguoi() {
	}
	public Nguoi(String hoten, String ngaysinh, String gioitinh, String quequan) {
		super();
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.quequan = quequan;
	}
	
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public void nhapTen() {
		this.hoten = sc.nextLine();
	}
	public void nhapNgaySinh() {
		this.ngaysinh = sc.nextLine();
	}
	public void nhapGioiTinh() {	
		this.gioitinh = sc.nextLine();
	}
	public void nhapQueQuan() {
		this.quequan = sc.nextLine();
	}
	public void inThongTin() {
		System.out.println("Ho ten: " + this.hoten + "\nNgay Sinh: " + this.ngaysinh 
				+"\nGioi tinh: " + this.gioitinh + "\nQue Quan: " + this.quequan);
	}
}
