package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyKhachHang {
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	
	public static void menu() {
		int choose;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("CHON CHUC NANG TRONG MENU:");
			System.out.println("1.Nhap khach hang.");
			System.out.println("2.Xuat khach hang.");
			System.out.println("3.Tim kiem khach hang.");
			System.out.println("4.Sap xep khach hang.");
			System.out.println("5.Luu khach hang.");
			System.out.println("6.Doc khach hang.");
			System.out.println("7.Xoa khach hang.");
			System.out.println("8.Thoat.");
			System.out.print("Your Choose: ");
			choose = sc.nextInt();
		}while(choose>8 && choose<1);
		switch(choose) {
		case 1:
			nhapKhachHang();
			break;
		case 2:
			xuatKhachHang();
			break;
		case 3:
			timKhachHang();
			break;
		case 4:
			sapXep();
			break;
		case 5:
			saveKH();
			break;
		case 6:
			loadKH();
			break;
		case 7:
			removeKH();
			break;
		default:
			System.out.println("Cam on va hen gap lai!");
			System.exit(0);
		}
	}
	private static void removeKH() {
		System.out.print("Nhap ma so Khach Hang can xoa: ");
		int maKH = new Scanner(System.in).nextInt();
		for(KhachHang o:dsKH) {
			if(maKH == o.getMa()) {
				dsKH.remove(o);
			}
		}
		System.out.println("Xoa thanh cong! ");
	}
	private static void loadKH() {
		dsKH = LoadFile.loadFile("D://dulieu.txt");
		System.out.println("Load Data Success!");
	}
	private static void saveKH() {
		boolean kt = SaveFile.saveFile(dsKH,"D://dulieu.txt");
		if (kt) {
			System.out.println("Save Data Success!");
		}else {
			System.out.println("Save Data Error!");
		}
	}
	private static void sapXep() {
		Collections.sort(dsKH);
		System.out.println("Sort Data Success!");
	}
	private static void timKhachHang() {
		System.out.println("============================");
		System.out.print("Nhap noi dung can tim kiem: ");
		String napho = new Scanner(System.in).nextLine();
		System.out.println("Cac khach hang thoa man noi dung tim kiem cua ban: ");
		int p=0;
		System.out.println("Ma\tName\t\tPhone");
		for (KhachHang o:dsKH) {
			if(o.getName().startsWith(napho) || o.getPhone().startsWith(napho)) {
				System.out.println(o);
				p++;
			}
		}
		if(p==0) {
			System.out.println("Khong co khach hang nao thoa man noi dung tim kiem cua ban!");
		}
		System.out.println("============================");
	}
	private static void xuatKhachHang() {
		System.out.println("============================");
		System.out.println("Ma\tTen\t\tPhone");
		for(KhachHang o:dsKH) {
			System.out.println(o);
		}
		System.out.println("============================");
	}
	private static void nhapKhachHang() {
		KhachHang kh = new KhachHang();
		System.out.print("Nhap ma: ");
		int ma = new Scanner(System.in).nextInt();
		System.out.print("Nhap ten: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.print("Nhap number phone: ");
		String sdt = new Scanner(System.in).nextLine();
		kh.setMa(ma);
		kh.setName(ten);
		kh.setPhone(sdt);
		
		dsKH.add(kh);
	}
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
}
