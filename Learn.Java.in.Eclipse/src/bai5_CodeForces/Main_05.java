package bai5_CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_05 {
	
	public static ArrayList<Integer> them(ArrayList<Integer> arl, int[] arr){
		for(int i=0;i<arr.length;i++) {
			arl.add(arr[i]);
		}
		return arl;
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n;i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
		ArrayList<Integer> arrlst = new ArrayList<Integer>();
		arrlst = them(arrlst,arr);
		int min = Integer.MAX_VALUE;

		for(int i=0;i<n;i++) {
			int j=i;
			int sum = 0;
			boolean tt=true;
			while(tt) {
				sum+=arrlst.get(j);
				if(sum<min) {
					min = sum;
				}
				j++;
				if(j>=arrlst.size()) {
					arrlst = them(arrlst,arr);
					int sumtt = sum;
					for(int k=j;k<=j+n;k++) {
						if(k==j+n) {
							tt=false;
							break;
						}
						sumtt+=arrlst.get(k);
						if(sumtt<min) {
							tt = true;
							break;
						}
					}
				}
			}
		}
		System.out.println(min);
	}

}
