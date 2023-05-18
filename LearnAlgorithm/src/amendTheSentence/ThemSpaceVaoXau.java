package amendTheSentence;

import java.util.Scanner;
/*Link: https://codelearn.io/learning/thuat-toan-can-ban/3478 */
public class ThemSpaceVaoXau {
	public static String amendAddSpace(String s) {
		String s2 = "";
		for(char o : s.toCharArray()) {
			if(Character.isUpperCase(o)) {
				s2+=" "+o;
			}
			else {
				s2+=o;
			}
		}
		s2 = s2.trim();
		return s2.toLowerCase();
	}
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String kq = amendAddSpace(s);
		System.out.println(kq);
	}

}
