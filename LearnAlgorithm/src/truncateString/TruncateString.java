package truncateString;

import java.util.Scanner;

public class TruncateString {

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String kq =	checkTruncate(s);
		System.out.println(kq);
	}

	private static String checkTruncate(String s) {
//		int n = s.length();
		while(s.length()>0) {
			if(Character.getNumericValue(s.charAt(0))%3==0) {
				s = s.substring(1);
			}else if(Character.getNumericValue(s.charAt(s.length()-1))%3==0) {
				s = s.substring(0,s.length()-1);
			}else if((Character.getNumericValue(s.charAt(0))+Character.getNumericValue(s.charAt(s.length()-1)))%3==0) {
					s = s.substring(1,s.length()-1);
			}else {
				return s;
			}
		}
		return s;
	}

}
