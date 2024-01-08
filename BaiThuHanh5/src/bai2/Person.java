package bai2;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String address;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person() {}
	public String toString() {
		String s = "Person[name="+this.name+",address="+this.address+"]";
		return s;
	}
}
