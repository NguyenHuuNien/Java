package qlnv;

import java.util.ArrayList;
import java.util.Collections;

public class TestNhanVien {

	public static void main(String[] args) {
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		ds.add(new NhanVien("Nien",5));
		ds.add(new NhanVien("Anh",7));
		ds.add(new NhanVien("Minh",2));
		ds.add(new NhanVien("Hoang",1));
		ds.add(new NhanVien("Hoang",6));
		
		System.out.println("Danh sach nhan vien cua cong ty");
		for (NhanVien nv:ds) {
			System.out.println(nv.getMa() +" " + nv.getName());
		}
		Collections.sort(ds);
		System.out.println("Danh sach nhan vien sau khi sap xep cua cong ty");
		for (NhanVien nv:ds) {
			System.out.println(nv.getMa() +" " + nv.getName());
		}
	}

}
