package commonCharacterCount;

import java.util.Scanner;

public class CommonCharacterCount {

	public static int checkCharCount(String s1, String s2) {
		int sum = 0;
		int[] sum1 = new int[26];
		int[] sum2 = new int[26];
		for(int i=0;i<26;i++) {
			sum1[i] = 0;
			sum2[i] = 0;
		}
		for(int i=0;i<s1.length();i++) {
			sum1[s1.charAt(i)-97]++;
		}
		for(int i=0;i<s2.length();i++) {
			sum2[s2.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			sum += Math.min(sum1[i], sum2[i]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		String s1 = new Scanner(System.in).nextLine();
		String s2 = new Scanner(System.in).nextLine();
		int kq = checkCharCount(s1,s2);
		System.out.println(kq);
	}

}
