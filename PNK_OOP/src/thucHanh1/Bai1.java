package thucHanh1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("La mot tam giac");
		}else {
			System.out.println("Khong la mot tam giac");
		}
	}

}
