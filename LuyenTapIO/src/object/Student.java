package object;

import java.io.Serializable;

public class Student extends Human implements Serializable{
	private String MSSV;
	private String lop;
	public Student(String firstName, String lastName, String address, String numberPhone, int age, String mSSV,
			String lop) {
		super(firstName, lastName, address, numberPhone, age);
		MSSV = mSSV;
		this.lop = lop;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	@Override
	public String GioiThieu() {
		return super.GioiThieu() + ", toi hoc lop: " + this.lop;
	}
}
