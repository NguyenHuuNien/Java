package demoQuanLyKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

import fileIO.LoadData;
import fileIO.SaveData;
public class TestKhachhang {
	public static void save(ArrayList<KhachHang> data) {
		boolean suc = SaveData.saveData(data, "D://data.txt");
		if (suc == true) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
	}
	public static void save(KhachHang newKH) {
		boolean suc = SaveData.saveData(newKH, "D://data.txt");
		if (suc == true) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public static void updateData() {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("N01","Nguyen Huu Nien"));
		dsKH.add(new KhachHang("N02","Nguyen Huu Dai"));
		dsKH.add(new KhachHang("N03","Nguyen Thi Minh Nguyet"));
		dsKH.add(new KhachHang("N04","Pham Thi Luyen"));
		save(dsKH);
		System.out.println("Nhap them thanh vien moi: (Nhap ma so & ten)");
		Scanner sc = new Scanner(System.in);
		KhachHang newKH = new KhachHang();
		System.out.print("Ma so: ");
		String ms = sc.nextLine();
		newKH.setMa(ms);
		System.out.print("Ten: ");
		String newName = sc.nextLine();
		newKH.setName(newName);
		save(newKH);
	}
	
	public static void loadingData() {
		LoadData.loadData("D://data.txt");
	}
	
	public static void main(String[] args) {
		updateData();
		System.out.println("---- DATA WAS LOADING SUCCESS -----");
		loadingData();
	}
}
