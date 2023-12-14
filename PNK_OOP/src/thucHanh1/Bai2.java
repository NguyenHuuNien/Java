package thucHanh1;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		if(2 <= a && a <= 8) {
			System.out.println("a la thu " + a + " trong tuan");
		}else {
			System.out.println("a khong la thu trong tuan");
		}

	}

}
