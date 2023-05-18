package checkStrongPassword;

import java.util.Scanner;
/*Link: https://codelearn.io/learning/thuat-toan-can-ban/3476 */
public class CheckPassW {

	public static boolean checkPass(String s) {
		boolean ck1 = false;
		boolean ck2 = false;
		boolean ck3 = false;
		boolean ck4 = false;
		String p = "!@#$%^&*()-+";
		if(s.length()<6) {
			return false;
		}else {
			for(int i=0;i<s.length();i++) {
				if((int)s.charAt(i)>=(int)'a' && (int)s.charAt(i)<=(int)'z') {
					ck1 = true;
				}
				if((int)s.charAt(i)>=(int)'A' && (int)s.charAt(i)<=(int)'Z') {
					ck2 = true;
				}
				if((int)s.charAt(i)>=(int)'0' && (int)s.charAt(i)<=(int)'9') {
					ck3 = true;
				}
				if(p.indexOf(s.charAt(i))!=-1) {
					ck4 = true;
				}
			}
		}
		return (ck1 && ck2 && ck3 && ck4);
	}
	
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		boolean bo = checkPass(s);
		System.out.println(bo);
	}

}
