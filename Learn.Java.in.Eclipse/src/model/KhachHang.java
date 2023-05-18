package model;

import java.io.Serializable;

public class KhachHang implements Serializable,Comparable<KhachHang>{
	private int ma;
	private String name;
	private String phone;
	public KhachHang() {
		super();
	}
	public KhachHang(int ma, String name, String phone) {
		super();
		this.ma = ma;
		this.name = name;
		this.phone = phone;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return this.ma+"\t"+this.name+"\t\t"+this.phone;
	}
	@Override
	public int compareTo(KhachHang o) {
		return this.phone.compareToIgnoreCase(o.getName());
	}
}
