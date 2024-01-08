package bai2;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	private String program;
	private int year;
	private double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public Student(){}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		String s = "Student["+super.toString()+",program="+
	this.program+",year="+this.year+",fee="+this.fee+"]";
		return s;
	}
}
