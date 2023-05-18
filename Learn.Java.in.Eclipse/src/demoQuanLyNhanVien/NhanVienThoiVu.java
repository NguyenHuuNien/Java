package demoQuanLyNhanVien;

public class NhanVienThoiVu extends NhanVien {

	public NhanVienThoiVu(String name,String cmnd) {
		super(name,cmnd);
	}
	@Override
	public int xuatLuong() {
		return 100;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " ==> Vi la nhan vien thoi vu";
	}
}
