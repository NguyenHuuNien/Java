package bai2;

import java.io.Serializable;

public class Staff extends Person implements Serializable{
	private String school;
	private double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public Staff() {}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		String x = "Staff["+super.toString()+",school="+this.school+",pay="+this.pay+"]";
		return x;
	}
}
