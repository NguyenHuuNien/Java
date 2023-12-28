package btth03;

public class Person {
	private String name;
	private String address;
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
