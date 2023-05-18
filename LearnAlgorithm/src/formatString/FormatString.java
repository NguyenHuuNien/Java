package formatString;

import java.util.Scanner;

public class FormatString {

	public static String Format(String s) {
		String str = "";
		s = s+" ";
		for(int i = 0;i<s.length()-1;i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1)==' ') {
				continue;
			}else {
				str += s.charAt(i);
			}
		}
		str = str.trim();
		return str;
	}
	
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String kq = Format(s);
		System.out.println(kq);
	}

}
