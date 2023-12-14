package thucHanh1;

import java.util.Scanner;

public class Bai3 {

	private static int n1,n2;
	
	public static void inMang(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void sapxep(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nhap so luong day 1:");
		n1 = Integer.parseInt(sc.next());
		int[] a = new int[n1];
		System.out.println("Nhap cac phan tu cua day 1:");
		for(int i=0;i<n1;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		System.out.println("Nhap so luong day 2:");
		n2 = Integer.parseInt(sc.next());
		int[] b = new int[n2];
		System.out.println("Nhap cac phan tu cua day 2:");
		for(int i=0;i<n2;i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		sapxep(a);
		System.out.print("Mang a sau sap xep: ");
		inMang(a);
		sapxep(b);
		System.out.print("Mang b sau sap xep: ");
		inMang(b);
		int[] c = new int[n1+n2];
		int k = 0;
		for(int i=0;i<n1;i++) {
			c[k] = a[i];
			k++;
		}
		for(int i=0;i<n2;i++) {
			c[k] = b[i];
			k++;
		}
		System.out.print("Mang sau khi da tron: ");
		sapxep(c); inMang(c);
	}

}
