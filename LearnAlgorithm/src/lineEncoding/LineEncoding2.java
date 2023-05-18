package lineEncoding;

import java.util.Scanner;

public class LineEncoding2 {

	public static String lineEncoding(String s) {
		String kq = "";
		s=s+"1";
		int dem=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				dem++;
			}
			else {
				kq+=(dem+"")+(s.charAt(i)+"");
				dem=1;
			}
		}
		return kq;
	}
	
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String kq = lineEncoding(s);
		System.out.println(kq);
	}

}
