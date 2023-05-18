package qlnv;

public class NhanVien implements Comparable<NhanVien>{
	private String name;
	private int ma;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	@Override
	public String toString() {
		return "NhanVien []";
	}
	public NhanVien() {
		super();
	}
	public NhanVien(String name, int ma) {
		super();
		this.name = name;
		this.ma = ma;
	}
	@Override
	public int compareTo(NhanVien o) {
		int ssTen = this.name.compareToIgnoreCase(o.getName());
//		return this.name.compareToIgnoreCase(o.getName());
		if(ssTen==0) {
			if(this.ma == o.ma) {
				return 0;
			}else if(this.ma>o.ma){
				return -1;
			}else {
				return 1;
			}
		}else {
			return ssTen;
		}
	}
}
