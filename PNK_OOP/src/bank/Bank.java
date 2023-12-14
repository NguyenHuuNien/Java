package bank;

public class Bank {
	private String name;
	private String cccd;
	private double tien;
	public Bank(String name, String cccd, double tien) {
		this.name = name;
		this.cccd = cccd;
		this.tien = tien;
	}
	public void napTien(double tienNap) {
		if(tienNap == 0) {
			System.out.println("So tien nap khong hop le");
		}
		else {
			this.tien += tienNap;
			System.out.println(this.name + " nap tien thanh cong");
		}
	}
	public void rutTien(double tienRut) {
		if(this.tien - tienRut < 50) {
			System.out.println("Khong du dieu kien rut tien");
		}else {
			this.tien -= tienRut;
			System.out.println(this.name + " rut tien thanh cong");
		}
	}
	public String toString() {
		String s = "Name: " + this.name + " \t| CCCD: " + this.cccd + " \t| So du: "+ this.tien;
		return s;
	}
}
