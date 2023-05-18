package khachHang;

public class KhachHang {
	private String name,age,sex,numberPhone;

	public KhachHang(String name, String age, String sex, String numberPhone) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.numberPhone = numberPhone;
	}

	public KhachHang() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	@Override
	public String toString() {
		return this.name+";"+this.age+";"+this.sex+";"+this.numberPhone;
	}
	
}
