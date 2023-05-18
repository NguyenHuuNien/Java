package demoQuanLyKhachHang;

public class KhachHang {
	private String ma;
	private String name;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public KhachHang(String ma, String name) {
		super();
		this.ma = ma;
		this.name = name;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		return this.ma +"\t"+ this.name;
	}
	
}
