package demoQuanLySinhVien;

public class SinhVien implements Comparable<SinhVien>{
	private int ms;
	private String name;
	private int age;
	public SinhVien(int ms, String name, int age) {
		super();
		this.ms = ms;
		this.name = name;
		this.age = age;
	}
	public SinhVien() {
		super();
	}
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SinhVien [ms=" + ms + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(SinhVien o) {
		int ssTen = this.name.compareToIgnoreCase(o.getName());
//		return this.name.compareToIgnoreCase(o.getName());
		if(ssTen==0) {
			if(this.ms == o.ms) {
				return 0;
			}else if(this.ms>o.ms){
				return -1;
			}else {
				return 1;
			}
		}else {
			return ssTen;
		}
	}
}
