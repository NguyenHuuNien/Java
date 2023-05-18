package differentValuesInMultiplicationTable;

import java.util.Scanner;

public class DifferentValuesInMultiplicationTable {

	public static int checkValues(int n, int m) {
		String s="";
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=m;j++){
				if(s.indexOf(String.valueOf(i*j))<0){
					s += String.valueOf(i*j);
				}
			}
		}
		return s.length();
	}
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int m = new Scanner(System.in).nextInt();
		int kq = checkValues(n,m);
		System.out.println(kq);
	}

}
