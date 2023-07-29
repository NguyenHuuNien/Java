package LearnJava;

import java.util.Scanner;


public class Tong_pt_trong_mang {
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i : arr){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sumOfArray(arr));
	}
}