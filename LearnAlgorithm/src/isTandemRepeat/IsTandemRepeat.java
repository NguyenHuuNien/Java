package isTandemRepeat;

import java.util.Scanner;

public class IsTandemRepeat {

	public static boolean checkString(String s) {
		if(s.length()%2!=0) {
			return false;
		}else {
			if(s.substring(0, s.length()/2).equals(s.substring(s.length()/2))) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		boolean kq = checkString(s);
//		System.out.println(s.substring(0, s.length()/2));
//		System.out.println(s.substring(s.length()/2));
		System.out.println(kq);
	}

}
