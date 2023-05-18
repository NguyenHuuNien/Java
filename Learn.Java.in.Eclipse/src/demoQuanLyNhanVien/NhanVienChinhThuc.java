package demoQuanLyNhanVien;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public int xuatLuong() {
		return 5000;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" ==> Vi la nhan vien chinh thuc";
	}

}
