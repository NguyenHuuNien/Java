package stringsCrossover;

public class StringsCrossover {
	
	public static int stack(String a, String b, String result) {
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=result.charAt(i)&&b.charAt(i)!=result.charAt(i)) {
				return 0;
			}
		}
		return 1;
	}
	
	public static int checkCrossover(String s[],String result) {
		int dem = 0;
		for(int i=0;i<s.length-1;i++) {
			for(int j=i+1;j<s.length;j++) {
				dem+=stack(s[i],s[j],result);
			}
		}
		return dem;
	}
	
	public static void main(String[] args) {
		String s[] = {"abc","aaa","aba","bab"};
		String result = "bbb";
		int kq = checkCrossover(s, result);
		System.out.println(kq);
	}

}
