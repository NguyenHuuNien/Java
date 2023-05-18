package questionCorrection;

import java.util.Scanner;

public class QuestionCorrection {

	public static String checkQ_Correction(String s) {
		int a = (int)'a';
		int z = (int)'z';
		int A = (int)'A';
		int Z = (int)'Z';
		int s0 = (int)'0';
		int s9 = (int)'9';
		int phay = (int)',';
		int space = (int)' ';
		int hoi = (int)'?';
		s = s.toLowerCase();
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		for(char o:s.toCharArray()) {
			if((a>(int)o||z<(int)o)&&(A>(int)o||Z<(int)o)&&(s0>(int)o||s9<(int)o)&&(o!=phay)&&(o!=space)&&(o!=hoi)) {
				s = s.replace(o, ' ');
			}
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==',') {
				char o = s.charAt(i-1);
				if((a>(int)o||z<(int)o)&&(A>(int)o||Z<(int)o)&&(s0>(int)o||s9<(int)o)) {
					s = s.replace(o, ' ');
				}
			}
		}
		while(s.indexOf(" ,")>=0) {
			s = s.replace(" ,", ", ");
		}
		while(s.indexOf("?")>=0) {
			s = s.replace("?", " ");
		}
		while(s.indexOf("  ")>=0) {
			s = s.replace("  ", " ");
		}
		for(int i=s.length()-1;i>=0;i--) {
			char o = s.charAt(i);
			if((a>(int)o||z<(int)o)&&(A>(int)o||Z<(int)o)&&(s0>(int)o||s9<(int)o)) {
				s = s.replace(o, ' ');
			}else {
				break;
			}
		}
		s = s.trim();
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		s = s + "?";
		return s;
	}
	
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String kq = checkQ_Correction(s);
		System.out.println(kq);
	}

}
