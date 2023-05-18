package cauTrucDuLieu_GiaiThuat_CodeLearn;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = new Scanner(System.in).nextInt();
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
