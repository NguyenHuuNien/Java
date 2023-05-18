package demoQuanLySinhVien;

/* 
 * Chương trình này để đọc từ 1 file gồm list sinh viên,
 * nhập vào 1 mã sinh viên và đưa ra thông tin của sinh viên đó,
 * ngoài ra có thể update thêm sinh vien vào list.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class TestQuanLySV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String path;
//		System.out.print("Nhap duong link file luu tru: ");
		path = "D://data.txt";
		System.out.println("Ban muon tim sinh vien hay them sinh vien?");
		String yken = sc.nextLine();
		switch(yken) {
		case "tim kiem":
			ArrayList<SinhVien> arr = new ArrayList<SinhVien>();
			arr = ReadingData.readingData(path);
			System.out.print("Nhap ma so sinh vien muon tim kiem: ");
			int search = sc.nextInt();
			for(SinhVien o:arr) {
				if(search==o.getMs()) {
					System.out.println("Sinh Vien do la: ");
					System.out.println("Ma sinh vien: "+ o.getMs()+"\n"+"Ten Sinh Vien: "+o.getName()+"\n"+"Tuoi Sinh Vien: "+o.getAge());
				}
			}
			break;
		case "them":
			System.out.print("Nhap ma sinh vien muon them: ");
			int newMS = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap ten sinh vien: ");
			String newName = sc.nextLine();
			System.out.print("Nhap tuoi sinh vien: ");
			int newAge = sc.nextInt();
			SinhVien svNew = new SinhVien(newMS,newName,newAge);
			boolean check = UpdateData.updateData(svNew, path);
			if(check == true) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
			}
		}
	}

}
