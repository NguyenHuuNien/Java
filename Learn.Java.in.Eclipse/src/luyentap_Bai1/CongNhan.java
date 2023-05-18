package luyentap_Bai1;

public class CongNhan extends CanBo{
	public int bac;
	private String ChucVu = "Cong Nhan";
	public CongNhan() {
		
	}
	public CongNhan(String name, int tuoi, String gioitinh, String diachi, int bac) {
		super(name,tuoi,gioitinh,diachi);
		this.bac = bac;
	}
	public int getBac() {
		return bac;
	}
	public void setBac(int bac) {
		if(bac<1 || bac >10) {
			System.out.println("Nhap sai du lieu bac!");
		}else {
			this.bac = bac;
		}
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+ChucVu+" bac "+this.bac;
	}
}
