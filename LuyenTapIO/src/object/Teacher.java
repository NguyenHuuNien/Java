package object;

import java.io.Serializable;

public class Teacher extends Human implements Serializable{
	private String id;
	private String lop;
	public Teacher(String firstName, String lastName, String address, String numberPhone, int age, String id,
			String lop) {
		super(firstName, lastName, address, numberPhone, age);
		this.id = id;
		this.lop = lop;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	@Override
	public String GioiThieu() {
		return super.GioiThieu() + ", toi day lop: " + this.lop;
	}
}
