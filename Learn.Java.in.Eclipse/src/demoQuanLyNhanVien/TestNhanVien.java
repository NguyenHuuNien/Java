package demoQuanLyNhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nien = new NhanVienChinhThuc();
		nien.setTen("Nguyen Huu Nien");
		nien.setCmnd("037204002646");
		System.out.println(nien);
		NhanVien anh = new NhanVienThoiVu("Pham Thi Hong Anh","037204001344");
		System.out.println(anh);
	}

}
