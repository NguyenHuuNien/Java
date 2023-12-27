package baiThucHanh2;

public class Employee {
	private String ten;
	private String ho;
	private double luong;
	public Employee(String ho, String ten, double luong) {
		this.setTen(ten);
		this.setHo(ho);
		this.setLuong(luong);
	}
	public Employee() {
		super();
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		if(luong<0) {
			this.luong = 0.0;
		}
		else {
			this.luong = luong;
		}
	}
	public String toString() {
		String s = this.ho + " " + this.ten + " | Luong thang: " + this.luong;
		return s;
	}
}
