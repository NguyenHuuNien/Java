package btth_ThuaKe;

public class MainHumanController {

	public static void main(String[] args) {
		CanBo canbo1 = new CanBo();
		canbo1.nhapTen();
		canbo1.nhapNgaySinh();
		canbo1.nhapGioiTinh();
		canbo1.nhapQueQuan();
		canbo1.nhapCap_ham();
		canbo1.nhapChucvu();
		canbo1.inCanBo();
		SinhVien sv1 = new SinhVien();
		sv1.nhapTen();
		sv1.nhapNgaySinh();
		sv1.nhapGioiTinh();
		sv1.nhapQueQuan();
		sv1.nhapLop();
		sv1.nhapKhoa();
		sv1.inSinhVien();
	}

}
