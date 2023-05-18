package ai_data;

import java.util.Scanner;

public class Entropy {

	public static void main(String[] args) {
		System.out.print("Nhap so phan tu cua doi tuong(Sv): ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Trong "+ n +" phan tu do, co:");
		System.out.print("S yes = ");
		int yes=new Scanner(System.in).nextInt();
		System.out.print("S no = ");
		int no=new Scanner(System.in).nextInt();
		double entro = (-(yes*1.0/n)*(Math.log(yes*1.0/n)/Math.log(2)))+(-(no*1.0/n)*(Math.log(no*1.0/n)/Math.log(2)));
		System.out.println("Entro = "+entro);
	}

}
