package LearnJava;

import java.util.Scanner;
public class indexOf_toUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine(); //nhap s1 va s2
		String s2 = sc.nextLine();
		int a = s1.toUpperCase().indexOf(s2.toUpperCase()); //chuyen s1 va s2 cung ve dang chu hoa de so sanh xem s2 ơ vi tri nao trong s1
		// toUpperCase : Chuyen xau ve dang chu in hoa
		// a.indexOf(b) : kiem tra xau b nam tai vi tri nao trong a

		System.out.println(a);
	}
}