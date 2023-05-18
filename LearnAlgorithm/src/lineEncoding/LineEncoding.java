package lineEncoding;

import java.util.Arrays;
import java.util.Scanner;

public class LineEncoding {

	public static String checkEncoding(String s) {
		String str = "";
		int i=0;
		while(i<s.length()) {
			int dem = 0;
			for(int j=i;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					dem++;
				}else {
					i+=dem;
					break;
				}
			}
			if(dem>1) {
			str += dem + s.charAt(i);
			}else {
				str += s.charAt(i);
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String kq = checkEncoding(s);
		System.out.println(kq);
	}

}
