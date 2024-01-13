package object;

import java.io.Serializable;

public class Human implements IPeople, Serializable{
	private String firstName;
	private String lastName;
	private String address;
	private String numberPhone;
	private int age;
	
	public Human(String firstName, String lastName, String address, String numberPhone, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.numberPhone = numberPhone;
		this.age = age;
	}

	public Human() {
		super();
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNumberPhone() {
		return numberPhone;
	}


	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String GioiThieu() {
		String s = "Xin chao! Toi ten la " + this.firstName + " " + this.lastName + ", nam nay toi " + this.age+
				" tuoi, toi song o " + this.address + ", hay lien lac voi toi thong qua so: " + this.numberPhone;
		return s;
	}

	
}
