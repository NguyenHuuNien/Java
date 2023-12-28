package btth_ThuaKe;

public class SinhVien extends Nguoi{
	private String lop;
	private String khoa;
	public SinhVien() {	
	}
	public SinhVien(String hoten, String ngaysinh, String gioitinh, String quequan,String lop, String khoa) {
		super(hoten,ngaysinh,gioitinh,quequan);
		this.lop = lop;
		this.khoa = khoa;
	}
	
	public SinhVien(String lop, String khoa) {
		super();
		this.lop = lop;
		this.khoa = khoa;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public void nhapLop() {
		this.lop = sc.nextLine();
	}
	public void nhapKhoa() {
		this.khoa = sc.nextLine();
	}
	public void inSinhVien() {
		super.inThongTin();
		System.out.println("Lop: " + this.lop + "\nKhoa: " + this.khoa);
	}
}
