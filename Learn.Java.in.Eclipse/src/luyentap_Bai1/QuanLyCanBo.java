package luyentap_Bai1;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyCanBo {
	
	static ArrayList<CanBo> dsCB = new ArrayList<CanBo>();
	
	public static void menu() {
		System.out.println("============MENU==============");
		System.out.println("1. Them moi can bo.");
		System.out.println("2. Tim kiem theo ho & ten.");
		System.out.println("3. Hien thong tin ve danh sach cac can bo.");
		System.out.println("4. Thoat chuong trinh.");
		System.out.println("==============================");
		System.out.print("Nhap lua chon: ");
		int choose;
		do {
			choose = new Scanner(System.in).nextInt();
			if(choose<1 || choose>4) {
				System.out.println("Nhap sai du lieu! Vui long nhap lai.");
			}
		}while(choose<1 || choose>4);
		switch(choose) {
		case 1:
			addCanBo();
			break;
		case 2:
			searchCanBo();
			break;
		case 3:
			printFullCanBo();
			break;
		default:
			System.out.println("Cam on ban da su dung, Hen gap lai!");
			System.exit(0);
		}
	}
	
	private static void printFullCanBo() {
		System.out.println("=============List Can Bo=================");
		System.out.println("Ten\t\tTuoi\tGioi Tinh\tDia Chi\tChuc Vu");
		dsCB.forEach(o -> System.out.println(o.toString()));
		System.out.println("=========================================");
	}

	private static void searchCanBo() {
		System.out.print("Nhap ten can bo muon tim: ");
		String sName = new Scanner(System.in).nextLine();
		System.out.println("Ket qua tim kiem: ");
		for (CanBo o:dsCB) {
			if(o.getName().equals(sName)) {
				System.out.println(o.toString());
			}
		}
		System.out.println("==============================");
	}

	private static void addCanBo() {
		System.out.println("Ban muon nhap can bo thuoc chuc vu gi?");
		System.out.println("1. Cong Nhan.");
		System.out.println("2. Ky Su.");
		System.out.println("3. Nhan Vien.");
		System.out.print("Select 1 in 3, enter 1,2 or 3: ");
		int cv = new Scanner(System.in).nextInt();
		System.out.println("==============================");
		System.out.print("Nhap ten can bo: ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Nhap tuoi cua can bo: ");
		int age = new Scanner(System.in).nextInt();
		System.out.print("Nhap gioi tinh cua can bo: ");
		String sex = new Scanner(System.in).nextLine();
		System.out.print("Nhap dia chi cua can bo: ");
		String local = new Scanner(System.in).nextLine();
		switch(cv) {
		case 1:
			System.out.print("Nhap bac cua can bo: ");
			int bac = new Scanner(System.in).nextInt();
			dsCB.add(new CongNhan(name,age,sex,local,bac));
			break;
		case 2:
			System.out.print("Nhap nganh dao tao cua can bo: ");
			String nganhdt = new Scanner(System.in).nextLine();
			dsCB.add(new KySu(name,age,sex,local,nganhdt));
			break;
		case 3:
			System.out.print("Nhap cong viec cua can bo: ");
			String congviec = new Scanner(System.in).nextLine();
			dsCB.add(new NhanVien(name,age,sex,local,congviec));
			break;
		}
	}

	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
