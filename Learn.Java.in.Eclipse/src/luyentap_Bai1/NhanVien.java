package luyentap_Bai1;

public class NhanVien extends CanBo {
	private String congviec;
	private String ChucVu = "Nhan Vien";
	public NhanVien() {
	}

	public NhanVien(String name, int tuoi, String gioitinh, String diachi, String congviec) {
		super(name,tuoi,gioitinh,diachi);
		this.congviec = congviec;
	}

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+ChucVu+" : "+this.congviec;
	}
}
