package luyentap_Bai1;

public class CanBo {
	private String name,gioitinh,diachi;
	private int tuoi;
	public CanBo() {
		super();
	}
	public CanBo(String name, int tuoi, String gioitinh, String diachi) {
		super();
		this.name = name;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.tuoi = tuoi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return this.name+"\t\t"+this.tuoi+"\t"+this.gioitinh+"\t"+this.diachi;
	}
	
}
